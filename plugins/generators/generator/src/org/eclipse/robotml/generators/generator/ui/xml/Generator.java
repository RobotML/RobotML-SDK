/**
 * 
 */
package org.eclipse.robotml.generators.generator.ui.xml;

import java.util.HashMap;

/**
 * @author nbrodnan
 *
 */
public class Generator {
	
	private HashMap<EXMLTag, String> _attributes = new HashMap<EXMLTag, String>();

	/**
	 * Constructor
	 * @param name
	 * @param id
	 * @param main_class
	 * @param target_folder
	 * @param type
	 * @param ext
	 */
	public Generator(String name, String id, String main_class, String target_folder, String src, String ext, String src_gen)
	{
		this._attributes.put(EXMLTag.NAME_ATTRIBUTE, name);
		this._attributes.put(EXMLTag.ID_ATTRIBUTE, id);
		this._attributes.put(EXMLTag.CLASS_ATTRIBUTE, main_class);
		this._attributes.put(EXMLTag.TARGET_FOLDER_ATTRIBUTE, target_folder);
		this._attributes.put(EXMLTag.SRC_TYPE_ATTRIBUTE, src);
		if(ext == null) ext = "";
		this._attributes.put(EXMLTag.SRC_EXT_ATTRIBUTE, ext);
		if(src_gen == null) src_gen = "";
		this._attributes.put(EXMLTag.SRC_GENERATOR_ATTRIBUTE, src_gen);
	}
	
	/**
	 * return the generator name
	 * @return
	 */
	public String getName()
	{
		return this._attributes.get(EXMLTag.NAME_ATTRIBUTE);
	}
	
	/**
	 * return the generator ID
	 * @return
	 */
	public String getId()
	{
		return this._attributes.get(EXMLTag.ID_ATTRIBUTE);
	}
	
	/**
	 * return the generator main class
	 * @return
	 */
	public String getClasse()
	{
		return this._attributes.get(EXMLTag.CLASS_ATTRIBUTE);
	}
	
	/**
	 * return the target folder
	 * @return
	 */
	public String getTargetFolder()
	{
		return this._attributes.get(EXMLTag.TARGET_FOLDER_ATTRIBUTE);
	}
	
	/**
	 * return the source type for the generator
	 * @return
	 */
	public String getSourceType()
	{
		return this._attributes.get(EXMLTag.SRC_TYPE_ATTRIBUTE);
	}
	
	/**
	 * return the file extension only if the generator source type is "file".
	 * @return
	 */
	public String getSourceFileExtension()
	{
		return this._attributes.get(EXMLTag.SRC_EXT_ATTRIBUTE);
	}
	
	public String getSourceGenerator()
	{
		return this._attributes.get(EXMLTag.SRC_GENERATOR_ATTRIBUTE);
	}
	
}
