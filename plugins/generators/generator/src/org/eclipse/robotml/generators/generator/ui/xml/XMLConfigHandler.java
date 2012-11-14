/**
 * 
 */
package org.eclipse.robotml.generators.generator.ui.xml;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 * @author nbrodnan
 *
 */
public class XMLConfigHandler extends DefaultHandler {

	private StringBuffer buffer = new StringBuffer();
	private Configuration _config = null;
	private String _domainName = "";
	
	
	/**
	 * Constructor
	 */
	public XMLConfigHandler(Configuration config)
	{
		super();
		this._config = config;
	}
	
	/**
	 * Character detection
	 */
	public void characters(char[] ch,int start, int length)	throws SAXException
	{
		String lecture = new String(ch,start,length);
		if(buffer != null)
			buffer.append(lecture);
	}
	
	/**
	 * Start parsing
	 */
	public void startDocument() throws SAXException 
	{

	}
	
	/**
	 * End parsing
	 */
	public void endDocument() throws SAXException
	{
		
	}
	
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException
	{
		if(EXMLTag.GENERATOR_NODE.equals(qName))
		{
			String name = attributes.getValue(EXMLTag.NAME_ATTRIBUTE.getValue());
			String id = attributes.getValue(EXMLTag.ID_ATTRIBUTE.getValue());
			String classe = attributes.getValue(EXMLTag.CLASS_ATTRIBUTE.getValue());
			String target_folder = attributes.getValue(EXMLTag.TARGET_FOLDER_ATTRIBUTE.getValue());
			String source = attributes.getValue(EXMLTag.SRC_TYPE_ATTRIBUTE.getValue());
			String file_ext = attributes.getValue(EXMLTag.SRC_EXT_ATTRIBUTE.getValue());
			String src_generator = attributes.getValue(EXMLTag.SRC_GENERATOR_ATTRIBUTE.getValue());
			
			this._config.add(new Generator(name, id, classe, target_folder, source, file_ext, src_generator));
		}
		else if(EXMLTag.DOMAIN_NODE.equals(qName))
		{
			this._domainName = attributes.getValue(EXMLTag.NAME_ATTRIBUTE.getValue());
		}
		else if(EXMLTag.IMPLEMENTATION_NODE.equals(qName))
		{
			if(this._domainName.isEmpty() == false)
			{
				String classe = attributes.getValue(EXMLTag.CLASS_ATTRIBUTE.getValue());
				String method = attributes.getValue(EXMLTag.METHOD_ATTRIBUTE.getValue());
				
				this._config.add(new DomainLanguage(this._domainName, classe, method));
			}
		}
	}
	
	public void endElement(String uri, String localName, String qName)
	{
		if(EXMLTag.DOMAIN_NODE.equals(qName))
		{
			this._domainName = "";
		}
	}
}
