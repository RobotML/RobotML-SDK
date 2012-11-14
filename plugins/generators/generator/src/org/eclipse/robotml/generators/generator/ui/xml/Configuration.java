/**
 * 
 */
package org.eclipse.robotml.generators.generator.ui.xml;

import java.io.InputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.transaction.TransactionalEditingDomain;

/**
 * @author nbrodnan
 *
 */
public class Configuration {
	
	private static Configuration _instance = null;
	
	private InputStream _configPath = this.getClass().getResourceAsStream("config.xml");
	private HashMap<String, Generator> _generators = new HashMap<String, Generator>();
	private HashMap<String, DomainLanguage> _domains = new HashMap<String, DomainLanguage>();
	
	private String _trunk_target = "";
	private String _target_name = "";
	private URI _source_model = null;
	private TransactionalEditingDomain _domain = null;
	
	
	public static Configuration getInstance()
	{
		if(Configuration._instance == null)
		{
			Configuration._instance = new Configuration();
		}
		return Configuration._instance;
	}
	
	private Configuration()
	{
		new XMLParser(this);
	}
		
	public InputStream getConfiguration()
	{
		return this._configPath;
	}
	
	public void add(Generator gen)
	{
		this._generators.put(gen.getName(), gen);
	}
	
	public void add(DomainLanguage domain)
	{
		this._domains.put(domain.getName(), domain);
	}
	
	public String getGenerator_SrcGenerator(String name)
	{
		return this._generators.get(name).getSourceGenerator();
	}
	
	public String getGenerator_Id(String name)
	{
		return this._generators.get(name).getId();
	}
	
	public String getGenerator_TargetFolder(String name)
	{
		return this._generators.get(name).getTargetFolder();
	}
	
	public String getGenerator_Source(String name)
	{
		return this._generators.get(name).getSourceType();
	}
	
	public String getGenerator_MainClass(String name)
	{
		return this._generators.get(name).getClasse();
	}
	
	public String getGenerator_FileExtension(String name)
	{
		return this._generators.get(name).getSourceFileExtension();
	}
	
	public void setTrunkTarget(String val)
	{
		this._trunk_target = val;
	}
	
	public String getTrunkTarget()
	{
		return this._trunk_target;
	}
	
	public void setModelURI(URI model)
	{
		this._source_model = model;
	}
	
	public URI getModelURI()
	{
		return this._source_model;
	}
	
	public String getDomainClass(String name)
	{
		return this._domains.get(name).getDomainClass();
	}
	
	public String getDomainMethod(String name)
	{
		return this._domains.get(name).getMethod();
	}
	
	public Set<String> getDomains()
	{
		return this._domains.keySet();
	}
	
	public void setTargetName(String name)
	{
		this._target_name = name;
	}
	
	public String getTargetName()
	{
		return this._target_name;
	}
	
	public void setTransactionDomain(TransactionalEditingDomain domain)
	{
		this._domain = domain;
	}
	
	public TransactionalEditingDomain getTransactionDomain()
	{
		return this._domain;
	}
	
	public HashSet<String> getGenerators()
	{
		HashSet<String> list = new HashSet<String>();
		
		/*
		 * The first generators need to use the robotml model
		 */
		for(Generator gen : this._generators.values())
		{
			if(ESourceGenerator.MODEL_SOURCE.equals(gen.getSourceType()))
			{
				if(list.contains(gen.getName()) == false)
					list.add(gen.getName());
			}
		}
		
		/*
		 * The next generators need to use the generated file from model
		 */
		for(Generator gen : this._generators.values())
		{
			if(ESourceGenerator.FILE_SOURCE.equals(gen.getSourceType()))
			{
				if(list.contains(gen.getName()) == false)
					list.add(gen.getName());
			}
		}
		
		return list;
	}
}
