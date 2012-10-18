/*****************************************************************************
 * Copyright (c) 2012 CEA LIST.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the CeCILL-C Free Software License v1.0
 * which accompanies this distribution, and is available at
 * http://www.cecill.info/licences/Licence_CeCILL-C_V1-en.html
 *
 *
 *****************************************************************************/
package com.cea.ec3m.gentools.core.dialogs;

import java.util.Arrays;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.SelectionStatusDialog;

import com.cea.ec3m.gentools.core.generate.GenerationOptions;

/**
 * Select options for code generation.
 * 
 * @author ansgar
 */
public class GenerationOptionsDialog extends SelectionStatusDialog implements GenerationOptions {

	protected Button fButtonModelOnly;

	protected Button fButtonRewriteSettings;

	protected Button fButtonOnlyChanged;

	public static int oldResultInt = 0;

	public GenerationOptionsDialog(Shell parent) {
		super(parent);
	}

	/**
	 * @see SelectionStatusDialog#computeResult()
	 */
	protected void computeResult() {
		int resultInt = (isRewriteSettings() ? REWRITE_SETTINGS : 0) +
			(isOnlyChanged() ? ONLY_CHANGED : 0) +
			(isModelOnly() ? MODEL_ONLY : 0);
		oldResultInt = resultInt;
		Object[] result = new Object[]{
			resultInt
		};
		setResult(Arrays.asList(result));
	}

	public Control createDialogArea(Composite parent) {
		Composite contents = (Composite)super.createDialogArea(parent);
		// (parent, "Container rules", "Avail. extensions/interceptors");

		fButtonModelOnly = new Button(contents, SWT.CHECK);
		fButtonModelOnly.setText("Only generate model (not code)");
		fButtonModelOnly.addSelectionListener(new SelectionListener() {

			public void widgetSelected(SelectionEvent e) {
				// only write types that have changed does not make sense, if the whole directory is cleaned
				boolean modelOnly = fButtonModelOnly.getSelection();
				fButtonOnlyChanged.setEnabled(!modelOnly);
			}

			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});
		fButtonModelOnly.setSelection((oldResultInt & MODEL_ONLY) != 0);

		fButtonRewriteSettings = new Button(contents, SWT.CHECK);
		fButtonRewriteSettings.setText("Rewrite project settings, if project exists already (may overwrite user settings)");
		fButtonRewriteSettings.setSelection((oldResultInt & REWRITE_SETTINGS) != 0);

		fButtonOnlyChanged = new Button(contents, SWT.CHECK);
		fButtonOnlyChanged.setText("Experimental: only write types that have changed (based on a difference model via EMF compare)");
		fButtonOnlyChanged.setSelection((oldResultInt & ONLY_CHANGED) != 0);
		return contents;
	}

	public boolean isRewriteSettings() {
		return fButtonRewriteSettings.getSelection();
	}

	public boolean isOnlyChanged() {
		return fButtonOnlyChanged.getSelection();
	}

	public boolean isModelOnly() {
		return fButtonModelOnly.getSelection();
	}
}
