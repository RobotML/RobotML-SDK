/**
 * 
 */
package org.eclipse.robotml.generators.acceleo.athena.mmqueries;

import java.util.Vector;
import org.eclipse.uml2.uml.DataType;
import org.eclipse.uml2.uml.NamedElement;

/**
 * @author nbrodnan
 *
 */
public class DataTypeCollection extends Vector<NamedElement> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void sortDataType()
	{
		for(int cpt = 0; cpt < this.size(); cpt++)
		{
			NamedElement elt = this.get(cpt);
			//structured datatype
			if(SpecificQueries.isStructuredType(elt) ||
					SpecificQueries.isDefineType(elt))
			{
				for(NamedElement child : ((DataType)elt).getAllAttributes())
				{
					if(isDefine(child) == false)
					{
						this.move(elt, cpt + 1);
						break;
					}
				}
			}
			else if(SpecificQueries.isUnionType(elt))
			{
				//TODO: Wait for union definition
			}
			else if(SpecificQueries.isContainerType(elt) == true)
			{
				//containers datatype
				String type = SpecificQueries.getContainerTypeDeclaration(elt);
				
				//type map
				if(type.startsWith("map"))
				{
					//type array and vector
					int index_begin = type.indexOf("<") + 1;
					int index_sep = type.indexOf(",");
					int index_end = type.indexOf(">") - 1;	
					
					String key = type.substring(index_begin, index_sep - 1);
					String value = type.substring(index_sep + 1, index_end);
					
					if(isDefine(key, cpt) == false || isDefine(value, cpt) == false)
					{
						this.move(elt, cpt + 1);
					}
				}
				else
				{
					//type array and vector
					int index_begin = type.indexOf("<") + 1;
					int index_end = type.indexOf(">") - 1;
					
					type = type.substring(index_begin, index_end).trim();
					if(isDefine(type, cpt) == false)
					{
						this.move(elt, cpt + 1);
					}
				}
			}
		}
	}
	
	private boolean isDefine(NamedElement ne)
	{	
		int index = this.indexOf(ne);
		if(index < 0)
		{
			//child datatype element, we test all element
			index = this.size();
		}
		boolean result = false;
		try
		{
			result = isDefine(ne.getName(), index);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return result;
	}
	
	private boolean isDefine(String type_name, int index)
	{
		boolean result = false;
		for(int cpt = 0; cpt < index; cpt ++)
		{
			NamedElement elt = this.get(cpt);
			if(type_name.equals(elt.getName()) == true)
			{
				result = true;
				break;
			}
		}
		return result;
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
}
