/**
 * 
 */
package org.eclipse.robotml.generators.generator.ui.xml;

/**
 * @author smillet
 *
 */
public enum EXMLTag {
	ROBOTML_NODE("robotml"),
	DOMAIN_LIST_NODE("domain_list"),
	DOMAIN_NODE("domain"),
	IMPLEMENTATION_NODE("implementation"),
	GENERATOR_LIST_NODE("generator_list"),
	GENERATOR_NODE("generator"),
	CLASS_ATTRIBUTE("class"),
	METHOD_ATTRIBUTE("method"),
	NAME_ATTRIBUTE("name"),
	ID_ATTRIBUTE("id"),
	MAIN_CLASS_ATTRIBUTE("main-class"),
	TARGET_FOLDER_ATTRIBUTE("target-folder"),
	SRC_TYPE_ATTRIBUTE("src-type"),
	SRC_EXT_ATTRIBUTE("src-ext"),
	SRC_GENERATOR_ATTRIBUTE("src-generator");
	
	private String _value = "";
	
	private EXMLTag(String value)
	{
		this._value = value;
	}
	
	public String getValue()
	{
		return this._value;
	}
	
	public boolean equals(String value)
	{
		return this._value.equals(value);
	}
	
	public boolean equals(EXMLTag tag)
	{
		return this.equals(tag.getValue());
	}

}
