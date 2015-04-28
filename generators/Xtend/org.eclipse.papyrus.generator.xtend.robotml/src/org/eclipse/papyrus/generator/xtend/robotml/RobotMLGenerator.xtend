/**
 * @author ; nbrodnan
 * @mail : nicolas.brodnan@gmail.com
 */
package org.eclipse.papyrus.generator.xtend.robotml

import org.eclipse.papyrus.generator.xtend.common.CommonGenerator
import org.eclipse.emf.ecore.EObject
import org.eclipse.papyrus.RobotML.Algorithm
import org.eclipse.papyrus.RobotML.AlgorithmLibrary
import org.eclipse.papyrus.RobotML.ActuatorHardware
import org.eclipse.papyrus.RobotML.ActuatorSystem

abstract class RobotMLGenerator extends CommonGenerator implements IRobotMLGenerator {
	
	/*
	 * (non-javadoc) @org.eclipse.papyrus.xtend.generator.common.IGenrator.generate(EObject object)
	 */
	override generate(EObject object) {
		if(object instanceof Algorithm)
		{
			doGenerate(object);
		}
		else if(object instanceof AlgorithmLibrary)
		{
			doGenerate(object);
		}
		else if(object instanceof ActuatorHardware)
		{
			doGenerate(object);
		}
		else if(object instanceof ActuatorSystem)
		{
			doGenerate(object);
		}
	}
}