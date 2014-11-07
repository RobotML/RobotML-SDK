package org.eclipse.robotml.generators.acceleo.alf.main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.uml.alf.alf.Block;
import org.eclipse.papyrus.uml.textedit.operation.xtext.OperationStandaloneSetupGenerated;
import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.OpaqueBehavior;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.Property;

import org.eclipse.papyrus.uml.textedit.operation.xtext.operation.impl.OperationDefinitionOrStubImpl;
import org.eclipse.papyrus.uml.textedit.operation.xtext.parser.antlr.OperationParser;

import org.eclipse.robotml.generators.acceleo.alf.generation.AlfBlock;
import org.eclipse.robotml.generators.acceleo.alf.generation.Athena_AlfGenerator;
import org.eclipse.robotml.generators.acceleo.alf.generation.CPP_AlfGenerator;
import org.eclipse.robotml.generators.acceleo.alf.generation.IAlfGenerator;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.parser.IParser;

import com.google.inject.Injector;

/**
 * 
// * @author nbrodnan
 *
 *	Alf services class
 */
public class AlfServices
{
	private static final String FILE_PATH_PREFIX = "file://";
	
	/**
	 * Create an Alf bloc code from UML element
	 * @param ne : UML element
	 * @return Alf bloc code
	 */
	public static Block createAlfBlockFromUML(NamedElement ne)
	{
		Block bloc = null;
		String str = "";
		
		if(ne instanceof Operation)
		{
			str = AlfServices.transcodeOperation((Operation)ne);
		}
		else if(ne instanceof OpaqueBehavior)
		{
			str = AlfServices.transcodeOpaqueBehavior((OpaqueBehavior)ne);
		}
//		else if(ne instanceof org.eclipse.uml2.uml.Class)
//		{
//			str = AlfServices.transcodeClass((org.eclipse.uml2.uml.Class)ne);
//		}

		if(str.isEmpty() == false)
		{			
			try
			{
				//parse alf string
				OperationStandaloneSetupGenerated setup = new OperationStandaloneSetupGenerated();
				Injector injector = setup.createInjectorAndDoEMFRegistration();
				IParser parser = injector.getInstance(IParser.class);
				OperationParser opParser = (OperationParser)parser;
				
				
				IParseResult pResult = opParser.doParse(str);
				if(pResult.hasSyntaxErrors() == false)
				{
					EObject eRoot = pResult.getRootASTElement();
					OperationDefinitionOrStubImpl ope = (OperationDefinitionOrStubImpl) eRoot;
					bloc = ope.getBody();
				}
				else
				{
					Iterator<INode> iter = pResult.getSyntaxErrors().iterator();
					while(iter.hasNext())
					{
						System.out.println(iter.next().getText());
					}
				}
			}
			catch(Exception e)
			{
				e.printStackTrace();
				bloc = null;
			}
		}
		
		return bloc;
	}
	
	public static Boolean canConvertToAlfBlock(NamedElement ne)
	{
		return (AlfServices.createAlfBlockFromUML(ne) != null);
	}
	
	
	/**
	 * Translate Alf bloc code to C++
	 * @param bloc : Alf::Block
	 * @return C++ code
	 */
	public static String translateAlfBlocTo_CPP(Block bloc)
	{
		return AlfServices.translateAlfBloc(bloc, new CPP_AlfGenerator());
	}
	
	/**
	 * Translate Alf bloc code to Athena
	 * @param bloc : Alf::Block
	 * @return Athena code
	 */
	public static String translateAlfBlocTo_Athena(Block bloc)
	{
		return AlfServices.translateAlfBloc(bloc, new Athena_AlfGenerator());
	}
	
	/**
	 * Translate Alf bloc code
	 * @param bloc : Alf::Block
	 * @param generator : IAlfGenerator
	 * @return code translated
	 */
	private static String translateAlfBloc(Block bloc, IAlfGenerator generator)
	{
		String result = "";
		AlfBlock alf_bloc;
		try
		{
			alf_bloc = new AlfBlock(bloc);
			alf_bloc.generateTo(generator);
			
			return alf_bloc.getCodeTranslation();
		}
		catch (Exception e)
		{
			e.printStackTrace();
			result = e.getMessage();
		}
		return result;
	}
	
	
	
	/**
	 * Transcoding on String the properties
	 * @param prop
	 * @return
	 */
	private static String transcodeProperty(Property prop)
	{
		String str = "";
		str = prop.getVisibility().getName();
		str += " " + prop.getType().getQualifiedName();
		str += " " + prop.getName() + ";";
		return str;
	}
	
	/**
	 * Transocding on String the operation
	 * @param op
	 * @return
	 */
	private static String transcodeOperation(Operation op)
	{
		String str = "";
		
		str = op.getVisibility().getName();
		str+= " " + op.getName() + " (";
		Iterator<Parameter> iter = op.getOwnedParameters().iterator();
		
		while(iter.hasNext())
		{
			str += AlfServices.transcodeParameter(iter.next());
			if(iter.hasNext()) str += ", ";
		}
		str += ") { ";
		
		//browse if operation is in relation with opaque behavior
		for(Behavior tmp : op.getMethods())
		{
			if(tmp instanceof OpaqueBehavior)
			{
				OpaqueBehavior opaque = (OpaqueBehavior)tmp;
				if(opaque.getLanguages().contains("Alf") == true)
				{
					for(String body :opaque.getBodies())
					{
						if(body.isEmpty() == false)
						{
							str += body;
						}
					}
				}
			}
		}
		
		str += "}";
		return str;
	}
	
	/**
	 * Transcoding parameters on String
	 * @param param
	 * @return
	 */
	private static String transcodeParameter(Parameter param)
	{
		String str = "";
		str += param.getDirection() .getName();
		str += " " + param.getName();
		str += ":" + param.getType().getQualifiedName();
		return str;
	}
	
	/**
	 * Transcoding Opaque behavior on String
	 * @param opaque
	 * @return
	 */
	private static String transcodeOpaqueBehavior(OpaqueBehavior opaque)
	{
		String str = "";
		
		if(AlfServices.usingFile(opaque))
		{
			for(String body : opaque.getBodies())
				str += AlfServices.AlfDescriptionFromFile(body);
		}
		else
		{
			str = opaque.getVisibility().getName();
			str += " " + opaque.getName() + "(";
			
			
			//get opaque behavior parameters
			Operation op = (Operation)opaque.getSpecification();
			Iterator<Parameter> iter = op.getOwnedParameters().iterator();
			while(iter.hasNext())
			{
				str += AlfServices.transcodeParameter(iter.next());
				if(iter.hasNext()) str += ", ";
			}
			str += ") {";
			
			for(String body : opaque.getBodies())
			{
				if(body.isEmpty() == false)
				{
					str += body;
				}
			}
			str += "}";
		}
		return str;
	}
	
	private static boolean usingFile(OpaqueBehavior opaque)
	{
		boolean result = false;
		for(String body : opaque.getBodies())
		{
			result |= body.startsWith(AlfServices.FILE_PATH_PREFIX);
		}
		return result;
	}
	
	private static String AlfDescriptionFromFile(String body)
	{
		String result = "";
		
		String path = body.substring(AlfServices.FILE_PATH_PREFIX.length());
		File input = new File(path);
		if(input.exists())
		{
			FileInputStream istream = null;
			
			try 
			{
				istream = new FileInputStream(input);
				InputStreamReader reader = new InputStreamReader(istream);
				int length = reader.read();
				char[] buffer = new char[length];
				reader.read(buffer);
				result = new String(buffer);
				reader.close();
				istream.close();
			} 
			catch (FileNotFoundException e1) {
				e1.printStackTrace();
			}
			catch (IOException e) {
				e.printStackTrace();
			}
		}
		return result;
	}
}