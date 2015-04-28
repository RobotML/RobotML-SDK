/**
 * @author : nbrodnan
 * @mail : nicolas.brodnan@gmail.com
 */
package org.eclipse.papyrus.generator.xtend.robotml

import org.eclipse.papyrus.RobotML.Algorithm
import org.eclipse.papyrus.RobotML.AlgorithmLibrary
import org.eclipse.papyrus.RobotML.ActuatorSystem
import org.eclipse.papyrus.RobotML.ActuatorHardware

/**
 * RobotML interface generator
 */
interface IRobotMLGenerator {
	
	/**
	 * generate algorithm
	 */
	def void doGenerate(Algorithm algo);
	
	/**
	 * generate algorithm library
	 */
	def void doGenerate(AlgorithmLibrary library);
	
	/**
	 * generate actuator system
	 */
	def void doGenerate(ActuatorSystem actuatorSys);
	
	/**
	 * generate actuator hardware
	 */	
	def void doGenerate(ActuatorHardware actuatorHard);
}