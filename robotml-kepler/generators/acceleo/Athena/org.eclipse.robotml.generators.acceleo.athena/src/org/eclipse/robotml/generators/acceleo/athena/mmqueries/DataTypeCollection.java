/**
 * 
 */
package org.eclipse.robotml.generators.acceleo.athena.mmqueries;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
import org.eclipse.uml2.uml.DataType;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Property;

/**
 * @author nbrodnan
 *
 */
public class DataTypeCollection extends Vector<NamedElement> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public void sort()
	{
		System.out.println("BEGIN SORT !!!!!!!");
		try
		{
			for(int cpt = 0; cpt < this.size(); cpt ++)
			{
				NamedElement type = this.get(cpt);
				if(changeIndex(type))
				{
					cpt = 0;
				}
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("OK!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
	}
	
	private boolean changeIndex(NamedElement element)
	{
		boolean ismove = false;
		int current_index = this.indexOf(element);
		int new_index = 0;
		
		if(SpecificQueries.isContainerType(element))
		{
			new_index = changeIndexForContainerType(element);
		}
		else if(SpecificQueries.isDefineType(element))
		{
			new_index = changeIndexForDefineType(element);
		}
		else if(SpecificQueries.isStructuredType(element))
		{
			new_index = changeIndexForStructuredType(element);
		}
		else if(SpecificQueries.isUnionType(element))
		{
			new_index = changeIndexForUnionStructuredType(element);
		}
		
		if(new_index > current_index)
		{
			this.move(element, new_index);
			ismove = true;
		}
		
		
		return ismove;
	}
	
	private int changeIndexForContainerType(NamedElement type)
	{
		int index = this.indexOf(type);
		List<String> datatypes = getContainerType(type);
		int new_index = index;
		for(String datatype : datatypes)
		{
			int tmp = findDataTypeIndexFromName(datatype);
			if(tmp > new_index)
				new_index = tmp;
		}
		
		return new_index;
	}
	
	private int changeIndexForDefineType(NamedElement type)
	{
		int index = this.indexOf(type);
		int new_index = index;
		for(Property prop : ((DataType)type).getAllAttributes())
		{
			int tmp = this.indexOf(prop.getType());
			if(tmp > new_index)
				new_index = tmp;
		}
		return new_index;
	}
	
	private int changeIndexForStructuredType(NamedElement type)
	{
		int index = this.indexOf(type);
		int new_index = index;
		for(Property prop : ((DataType)type).getAllAttributes())
		{
			int tmp = this.indexOf(prop.getType());
			if(tmp > new_index)
				new_index = tmp;
		}
		return new_index;
	}
	
	private int changeIndexForUnionStructuredType(NamedElement type)
	{
		int index = this.indexOf(type);
		int new_index = index;
		for(Property prop : ((DataType)type).getAllAttributes())
		{
			int tmp = this.indexOf(prop.getType());
			if(tmp > new_index)
				new_index = tmp;
		}
		return new_index;
	}
	
	

	private List<String> getContainerType(NamedElement type)
	{
		LinkedList<String> res = new LinkedList<String>();
		//containers datatype
		String type_str = SpecificQueries.getContainerTypeDeclaration(type);
		
		//type map
		if(type_str.startsWith("map"))
		{
			//type array and vector
			int index_begin = type_str.indexOf("<") + 1;
			int index_sep = type_str.indexOf(",");
			int index_end = type_str.indexOf(">") - 1;	
			
			String key = type_str.substring(index_begin, index_sep - 1);
			String value = type_str.substring(index_sep + 1, index_end);
			
			if(res.contains(key) == false) res.add(key);
			if(res.contains(value) == false) res.add(value);
		}
		else
		{
			//type array and vector
			int index_begin = type_str.indexOf("<") + 1;
			int index_end = type_str.indexOf(">");
			
			type_str = type_str.substring(index_begin, index_end).trim();
			if(res.contains(type_str) == false) res.add(type_str);
		}
		
		return res;
	}
	
	private int findDataTypeIndexFromName(String name)
	{
		int res = 0;
		for(int cpt = 0; cpt < this.size(); cpt++)
		{
			if(this.get(cpt).getName().equals(name))
			{
				res = cpt;
			}
		}
		return res;
	}
	
	private void move(NamedElement ne, int index)
	{
		this.remove(ne);
		if(index > this.size())
		{
			this.add(ne);
		}
		else
		{
			this.insertElementAt(ne, index);
		}
	}
	
	@Override
	public boolean addAll(Collection<? extends NamedElement> c)
	{
		for(NamedElement elt : c)
		{
			boolean isInserted = false;
			for(NamedElement elt_this: this)
			{
				isInserted |= (elt_this.getName().equals(elt.getName()) == true);
			}
			
			if(isInserted == false)
			{
				this.add(elt);
			}
		}
		return true;
	}
}
