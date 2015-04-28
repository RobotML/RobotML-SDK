/**
 * @author : nbrodnan
 * @mail : nicolas.brodnan@gmail.com
 */
package org.eclipse.papyrus.generator.xtend.common

import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.common.util.URI

/**
 * Abstract common generator for EMF model
 */
abstract class CommonGenerator implements IGenerator {
	
	/*
	 * (non-javadoc) @org.eclipse.papyrus.xtend.generator.common.generate(String url) 
	 */
	override generate(String url) {
		
		/*
		 * Getting access to the model's root object
		 */
		val resourceSet = new ResourceSetImpl();
		val resource = resourceSet.getResource(URI.createURI(url), true);
		
		/*
		 * Generate content
		 */
		for(content : resource.contents)
		{
			generate(content);
		}
	}
}