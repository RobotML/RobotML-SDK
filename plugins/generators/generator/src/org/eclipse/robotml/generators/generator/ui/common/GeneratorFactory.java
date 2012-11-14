/**
 * 
 */
package org.eclipse.robotml.generators.generator.ui.common;


import java.lang.reflect.InvocationTargetException;

import org.eclipse.acceleo.engine.service.AbstractAcceleoGenerator;
import org.eclipse.robotml.generators.generator.ui.xml.Configuration;

/**
 * @author nbrodnan
 *
 */
public class GeneratorFactory {

	/**
	 * Return generator instance, not initialized
	 * @param generator_name
	 * @return
	 * @throws ClassNotFoundException
	 * @throws SecurityException
	 * @throws NoSuchMethodException
	 * @throws IllegalArgumentException
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 * @throws InvocationTargetException
	 */
	public static AbstractAcceleoGenerator create(String generator_name) throws ClassNotFoundException, SecurityException, NoSuchMethodException, IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException
	{
		AbstractAcceleoGenerator gen = null;
		String main_class = Configuration.getInstance().getGenerator_MainClass(generator_name);
		
		
		Class<?> class_find = GeneratorFactory.class.getClassLoader().loadClass(main_class);
		if(class_find != null)
		{
			gen = (AbstractAcceleoGenerator)class_find.newInstance();
		}

		
		return gen;
	}
}
