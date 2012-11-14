/*******************************************************************************
 * Copyright (c) 2008 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.robotml.generators.generator.ui.handler;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;

//import de.itemis.gmf.runtime.extensions.Activator;

/**
 * Common functionality of all ResourceSetInfos working on the same editing
 * domain.
 * 
 * ResourceSet related properties and methods have been copied. Uses a composite
 * {@link WorkspaceSynchronizer.Delegate} to synchronize with workspace changes.
 * 
 * @author Jan Koehnlein
 */
public class SharedResourceSetInfoDelegate {

	private long myModificationStamp = IResource.NULL_STAMP;

	private WorkspaceSynchronizer mySynchronizer;

	private final TransactionalEditingDomain editingDomain;

	private final List<WorkspaceSynchronizer.Delegate> delegates;

	public SharedResourceSetInfoDelegate(TransactionalEditingDomain editingDomain) {
		this.editingDomain = editingDomain;
		this.delegates = new ArrayList<WorkspaceSynchronizer.Delegate>();
		startResourceListening();
	}

	public long getModificationStamp() {
		return myModificationStamp;
	}

	public void setModificationStamp(long modificationStamp) {
		myModificationStamp = modificationStamp;
	}

	public TransactionalEditingDomain getEditingDomain() {
		return editingDomain;
	}

	public void dispose() {
		stopResourceListening();
	}

	public final void stopResourceListening() {
		if (mySynchronizer != null) {
			mySynchronizer.dispose();
		}
		mySynchronizer = null;
	}

	public final void startResourceListening() {
		if (mySynchronizer == null) {
			mySynchronizer = new WorkspaceSynchronizer(getEditingDomain(), new CompositeSynchronizerDelegate());
		}
	}

	public boolean addWorkspaceSynchronizerDelegate(WorkspaceSynchronizer.Delegate delegate) {
		return delegates.add(delegate);
	}

	public boolean removeWorkspaceSynchronizerDelegate(WorkspaceSynchronizer.Delegate delegate) {
		return delegates.remove(delegate);
	}

	private class CompositeSynchronizerDelegate implements WorkspaceSynchronizer.Delegate {

		public void dispose() {
		}

		public boolean handleResourceChanged(final Resource resource) {
			// BEGIN: Code block copied from generated DocumentProvider
			org.eclipse.core.resources.IFile file = org.eclipse.emf.workspace.util.WorkspaceSynchronizer
					.getFile(resource);
			if (file != null) {
				try {
					file.refreshLocal(org.eclipse.core.resources.IResource.DEPTH_INFINITE, new NullProgressMonitor());
				} catch (org.eclipse.core.runtime.CoreException ex) {
					Activator.logError("Error in refreshing changed file", ex);
				}
			}
			resource.unload();
			// END
			synchronized (SharedResourceSetInfoDelegate.this) {
				for (WorkspaceSynchronizer.Delegate delegate : delegates) {
					delegate.handleResourceChanged(resource);
				}
			}
			return true;
		}

		public boolean handleResourceDeleted(final Resource resource) {
			synchronized (SharedResourceSetInfoDelegate.this) {
				for (WorkspaceSynchronizer.Delegate delegate : delegates) {
					delegate.handleResourceDeleted(resource);
				}
			}
			return true;
		}

		public boolean handleResourceMoved(final Resource resource, final URI newURI) {
			synchronized (SharedResourceSetInfoDelegate.this) {
				for (WorkspaceSynchronizer.Delegate delegate : delegates) {
					delegate.handleResourceMoved(resource, newURI);
				}
			}
			return true;
		}
	}

	public boolean resourceSetIsDirty() {
		for (Resource resource : getEditingDomain().getResourceSet().getResources()) {
			if (resource.isLoaded() && !getEditingDomain().isReadOnly(resource) && resource.isModified()) {
				return true;
			}
		}
		return false;
	}

	public static SharedResourceSetInfoDelegate adapt(TransactionalEditingDomain editingDomain) {
		SharedResourceSetInfoAdapter.Factory factory = new SharedResourceSetInfoAdapter.Factory();
		SharedResourceSetInfoAdapter adapter = (SharedResourceSetInfoAdapter) factory.adapt(editingDomain
				.getResourceSet(), SharedResourceSetInfoDelegate.class);
		return (adapter != null) ? adapter.getSharedResourceSetInfoDelegate() : null;
	}
}
