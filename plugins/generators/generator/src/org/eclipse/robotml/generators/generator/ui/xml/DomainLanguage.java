/**
 * 
 */
package org.eclipse.robotml.generators.generator.ui.xml;

/**
 * @author nbrodnan
 *
 */
public class DomainLanguage {
	
	private String _name = "";
	private String _class = "";
	private String _method = "";
	
	public DomainLanguage(String name, String classe, String method)
	{
		this._name = name;
		this._class = classe;
		this._method = method;
	}
	
	public String getName()
	{
		return this._name;
	}
	
	public String getDomainClass()
	{
		return this._class;
	}
	
	public String getMethod()
	{
		return this._method;
	}

}
