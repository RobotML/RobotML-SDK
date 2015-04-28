/**
 * @author : nbrodnan
 * @mail : nicolas.brodnan@gmail.com
 */
package org.eclipse.papyrus.generator.xtend.common

import org.eclipse.emf.ecore.EObject

/**
 * Common interface generator
 */
interface IGenerator {
	
	/**
	 * Generate from the model URI
	 */
	def void generate(String url);
	
	/** 
	 * Generate from component model
	 */
	def void generate(EObject obj);
}