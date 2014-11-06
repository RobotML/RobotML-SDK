/*****************************************************************************
 * Copyright (c) 2013 DASSAULT AVIATION.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Nicolas BRODNAN (Dassault Aviation) nicolas.brodnan@gmail.com - Athena services configuration
 *****************************************************************************/
package org.eclipse.robotml.generators.acceleo.athena.files;

import java.io.Reader;
import java.util.Iterator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.parser.IParser;
import org.xtext.AthenaDSLStandaloneSetup;
import org.xtext.athenaDSL.ProcessingDeclaration;
import org.xtext.athenaDSL.Project;
import org.xtext.parser.antlr.AthenaDSLParser;

import com.google.inject.Injector;

/**
 * 
 * @author nbrodnan
 * Class for athena services
 */
public class AthenaServices {
	private AthenaDSLParser _parser = null;
	private Project _prj = null;
	
	/**
	 * Constructor
	 */
	public AthenaServices()
	{
		AthenaDSLStandaloneSetup setup = new AthenaDSLStandaloneSetup();
		Injector inject = setup.createInjector();
		this._parser = (AthenaDSLParser)inject.getInstance(IParser.class);
	}
	
	/**
	 * Constructor
	 * @param fileReader : robotml file handler
	 */
	public AthenaServices(Reader fileReader)
	{
		AthenaDSLStandaloneSetup setup = new AthenaDSLStandaloneSetup();
		Injector inject = setup.createInjector();
		this._parser = (AthenaDSLParser)inject.getInstance(IParser.class);
		if(this._parser != null)
		{
			IParseResult result = this._parser.doParse(fileReader);
			if(result.hasSyntaxErrors() == false)
			{
				EObject eRoot = result.getRootASTElement();
				this._prj = (org.xtext.athenaDSL.Project)eRoot;
			}
			else
			{
				Iterator<INode> iter = result.getSyntaxErrors().iterator();
				while(iter.hasNext())
				{
					System.out.println(iter.next().getText());
				}
			}
		}
	}
	
	/**
	 * Return Athena project
	 * @return project
	 */
	public Project getProject()
	{
		return this._prj;
	}
	/**
	 * Parse string to declare athena processing
	 * @param processing
	 * @return processing declaration
	 */
	public ProcessingDeclaration parseProcessingDeclaration(String processing)
	{
		ProcessingDeclaration procDecl = null;
		if(this._parser != null)
		{
			IParseResult result = this._parser.doParse(processing);
			if(result.hasSyntaxErrors() == false)
			{
				EObject eRoot = result.getRootASTElement();
				this._prj = (org.xtext.athenaDSL.Project)eRoot;
			}
			else
			{
				Iterator<INode> iter = result.getSyntaxErrors().iterator();
				while(iter.hasNext())
				{
					System.out.println(iter.next().getText());
				}
			}
		}
		return procDecl;
	}
}
