package org.eclipse.robotml.generators.acceleo.athena.mmqueries;

import org.eclipse.uml2.uml.Class;

public class ComponentLevel {
	public int _level = 0;
	public Class _class = null;
	
	ComponentLevel(Class classe, int level)
	{
		this._class = classe;
		this._level = level;
	}
}
