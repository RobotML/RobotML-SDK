package org.eclipse.robotml.generators.generator.ui.common;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;

public class FileSynchronizer {

	private WorkspaceSynchronizer _synchonizer = null;
	private TransactionalEditingDomain _domain = null;
	private List<WorkspaceSynchronizer.Delegate> _delegates = null;
	
	private class CompositeSynchronizerDelegate implements WorkspaceSynchronizer.Delegate
	{

		public boolean handleResourceDeleted(Resource resource) 
		{
			IFile file = WorkspaceSynchronizer.getFile(resource);
			if(file != null)
			{
				try 
				{
					file.refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
				}
				catch (CoreException e) 
				{
					e.printStackTrace();
				}
				resource.unload();
				synchronized(FileSynchronizer.this)
				{
					for(WorkspaceSynchronizer.Delegate delegate : _delegates)
					{
						delegate.handleResourceDeleted(resource);
					}
				}
			}
			return true;
		}

		public boolean handleResourceMoved(Resource resource, URI newURI) 
		{
			synchronized(FileSynchronizer.this)
			{
				for(WorkspaceSynchronizer.Delegate delegate : _delegates)
				{
					delegate.handleResourceMoved(resource, newURI);
				}
			}
			return true;
		}

		public boolean handleResourceChanged(Resource resource) {
			synchronized(FileSynchronizer.this)
			{
				for(WorkspaceSynchronizer.Delegate delegate : _delegates)
				{
					delegate.handleResourceChanged(resource);
				}
			}
			return true;
		}

		public void dispose() {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	public void dispose()
	{
		this.stopSynchronize();
	}

	public FileSynchronizer(TransactionalEditingDomain domain)
	{
		this._domain = domain;
		this._delegates = new ArrayList<WorkspaceSynchronizer.Delegate>();
	}
	
	public void startSynchronize()
	{
		if(_synchonizer == null)
		{
			this._synchonizer = new WorkspaceSynchronizer(this._domain, new CompositeSynchronizerDelegate());
		}
	}
	
	/**
	 * Stop file synchronize
	 */
	public void stopSynchronize()
	{
		if(this._synchonizer != null)
		{
			this._synchonizer.dispose();
		}
		this._synchonizer = null;
	}

	/**
	 * Add workspace synchrinizer delegate
	 * @param delegate
	 */
	public void addSynchronizerDelegate(WorkspaceSynchronizer.Delegate delegate)
	{
		this._delegates.add(delegate);
	}
	
	/**
	 * Remove workspace synchronizer delegate
	 * @param delegate
	 */
	public void removeSynchronizerDelegate(WorkspaceSynchronizer.Delegate delegate)
	{
		this._delegates.remove(delegate);
	}
}
