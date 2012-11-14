/**
 * 
 */
package org.eclipse.robotml.generators.generator.ui.xml;


import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;

/**
 * @author nbrodnan
 *
 */
public class XMLParser {

	private Configuration _config = null;
	
	public XMLParser(Configuration config)
	{
		this._config = config;
		CreateParser(this._config.getConfiguration());
	}
	
	public XMLParser(File xmlFile)
	{
		CreateParser(xmlFile);
	}
	
	public XMLParser(InputStream stream)
	{
		CreateParser(stream);
	}
	
	private void CreateParser(File xmlFile)
	{
		SAXParserFactory factory = SAXParserFactory.newInstance();
		if(factory != null)
		{
			SAXParser parser;
			try
			{
				parser = factory.newSAXParser();
				if(parser != null)
				{
					XMLConfigHandler gestionnaire = new XMLConfigHandler(this._config);
					parser.parse(xmlFile, gestionnaire);
					
				}
			}
			catch (ParserConfigurationException e) 
			{
				e.printStackTrace();
			}
			catch (SAXException e) 
			{
				e.printStackTrace();
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}
		}
	}
	
	private void CreateParser(InputStream xmlStream)
	{
		SAXParserFactory factory = SAXParserFactory.newInstance();
		if(factory != null)
		{
			SAXParser parser;
			try
			{
				parser = factory.newSAXParser();
				if(parser != null)
				{
					XMLConfigHandler gestionnaire = new XMLConfigHandler(this._config);
					parser.parse(xmlStream, gestionnaire);
					
				}
			}
			catch (ParserConfigurationException e) 
			{
				e.printStackTrace();
			}
			catch (SAXException e) 
			{
				e.printStackTrace();
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}
		}
	}
}
