/**
 * 
 */
package org.eclipse.robotml.generators.generator.ui.xml;

/**
 * @author smillet
 *
 */
public enum ESourceGenerator {
	MODEL_SOURCE("model"),
	FILE_SOURCE("file");

	private String _value = "";
	
	private ESourceGenerator(String value)
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
