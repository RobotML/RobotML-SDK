/*****************************************************************************
 * Copyright (c) 2012 CEA LIST.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the CeCILL-C Free Software License v1.0
 * which accompanies this distribution, and is available at
 * http://www.cecill.info/licences/Licence_CeCILL-C_V1-en.html
 *
 * Contributors:
 *  Saadia DHOUIB (CEA LIST) - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.robotml.modelexplorer.util;

import org.eclipse.uml2.common.util.UML2Util;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.ProfileApplication;

public class ProfileUtil {
	public static Profile getAppliedProfile(
			org.eclipse.uml2.uml.Package package_, String qualifiedName) {

		for (ProfileApplication profileApplication : package_
			.getAllProfileApplications()) {

			Profile appliedProfile = profileApplication.getAppliedProfile();

			if (appliedProfile != null
				&& UML2Util.safeEquals(appliedProfile.getQualifiedName(), qualifiedName)) {

				return appliedProfile;
			}
		}

		return null;
	}
}
