/**
 * 
 */
package org.eclipse.robotml.generators.generator.ui.handler;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.HashSet;

import javax.swing.JOptionPane;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.robotml.generators.generator.ui.common.FileSynchronizer;
import org.eclipse.robotml.generators.generator.ui.common.GenerateAll;
import org.eclipse.robotml.generators.generator.ui.common.GeneratorScheduler;
import org.eclipse.robotml.generators.generator.ui.xml.Configuration;
import org.eclipse.uml2.uml.Model;

/**
 * @author nbrodnan
 *
 */
public class GenerateGlobalCommand extends AbstractTransactionalCommand {

	/** The selected element. */
	private final EObject _selection;

	/** The trunk target folder path. */
	private final String _target;
	
	private FileSynchronizer _synchronizer = null;
	
	/**
	 * Instantiates global generator command.
	 * 
	 * @param label
	 *        the label
	 * @param domain
	 *        the domain
	 * @param selectedElement
	 *        the selected element
	 * @param athenaTargetFolderPath
	 *        the target folder path
	 */
	public GenerateGlobalCommand(String label, TransactionalEditingDomain domain, EObject selectedElement, String athenaTargetFolderPath) {
		super(domain, label, Collections.EMPTY_LIST);
		Configuration.getInstance().setTransactionDomain(domain);
		this._selection = selectedElement;
		this._target = athenaTargetFolderPath;
		this._synchronizer = new FileSynchronizer(domain);
	}
	
	@Override
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		
		/*
		 * Configure the common trunk targetand the source model URI
		 */
		Configuration.getInstance().setTrunkTarget(_target);
		Configuration.getInstance().setModelURI(this._selection.eResource().getURI());
		
		if(this._selection instanceof Model)
		{
			Configuration.getInstance().setTargetName(((Model)_selection).getName());
		}
		
		/*
		 * Scheduling generators
		 */
		GeneratorScheduler scheduler = new GeneratorScheduler();
		HashSet<String> generators = Configuration.getInstance().getGenerators();
		for(String generator : generators)
		{
			scheduler.add(generator);
		}
		
		/*
		 * Initialize DSL
		 */
		InitializeDSL();
		
		/*
		 * generate
		 */
		scheduler.generate(monitor);
		
		return CommandResult.newOKCommandResult();
	}
	
	/**
	 * initialize the needed DSL
	 */
	private void InitializeDSL()
	{
		for(String dsl : Configuration.getInstance().getDomains())
		{
			String classe = Configuration.getInstance().getDomainClass(dsl);
			String method = Configuration.getInstance().getDomainMethod(dsl);
			
			Class<?> class_find;
			try {
				class_find = GenerateAll.class.getClassLoader().loadClass(classe);
				if(class_find != null)
				{
					Method op = class_find.getMethod(method, null);
					if(op != null)
					{
						op.invoke(null);
					}
				}
			} catch (ClassNotFoundException e) {
				JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
				//e.printStackTrace();
			} catch (SecurityException e) {
				JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
				//e.printStackTrace();
			} catch (NoSuchMethodException e) {
				JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
				//e.printStackTrace();
			} catch (IllegalArgumentException e) {
				JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
				//e.printStackTrace();
			} catch (IllegalAccessException e) {
				JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
				//e.printStackTrace();
			} catch (InvocationTargetException e) {
				JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
				//e.printStackTrace();
			}
			
		}
	}

	@Override
	public boolean canExecute() {
		return (_selection != null && _target != null && Configuration.getInstance().getTransactionDomain() != null);
	}
}
