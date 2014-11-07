/**
 * 
 */
package org.eclipse.papyrus.generators.xtext.athena.vle.main;

import java.util.LinkedList;
import java.util.List;

import org.xtext.athenaDSL.DataType;
import org.xtext.athenaDSL.Project;
import org.xtext.athenaDSL.arrayType;
import org.xtext.athenaDSL.basicType;
import org.xtext.athenaDSL.defineType;
import org.xtext.athenaDSL.mapType;
import org.xtext.athenaDSL.structElement;
import org.xtext.athenaDSL.structType;
import org.xtext.athenaDSL.unionType;
import org.xtext.athenaDSL.vectorType;

/**
 * @author nbrodnan
 *
 */
public class DataTypeSorter {
	
	public List<DataType> getSortedDatatypes(Project project)
	{
		LinkedList<DataType> sortedTypes = new LinkedList<DataType>();
		List<DataType> unsortedTypes = project.getTypes();
		
		for(DataType type : unsortedTypes)
		{
			if(type instanceof basicType)
			{
				sortedTypes.add(type);
			}
			else
			{
				this.checkForSort(type, sortedTypes);
			}
		}
		
		
		
		return sortedTypes;
	}
	
	/**
	 * sort specific datatype
	 * @param type
	 * @param sortedTypes
	 */
	private void checkForSort(DataType type, List<DataType> sortedTypes)
	{
		if(type instanceof basicType)
			this.checkForBasicType((basicType)type, sortedTypes);
		else if(type instanceof arrayType)
			this.checkForArrayType((arrayType) type, sortedTypes);
		else if(type instanceof defineType)
			this.checkForDefineType((defineType)type, sortedTypes);
		else if(type instanceof mapType)
			this.checkForMapType((mapType)type, sortedTypes);
		else if(type instanceof structType)
			this.checkForStructType((structType)type, sortedTypes);
		else if(type instanceof unionType)
			this.checkForUnionType((unionType)type, sortedTypes);
		else if(type instanceof vectorType)
			this.checkForVectorType((vectorType)type, sortedTypes);
	}
	
	
	/**
	 * Check for vector type
	 * @param type
	 * @param sortedTypes
	 */
	private void checkForVectorType(vectorType type, List<DataType> sortedTypes)
	{
		/*
		 * Check the type template
		 */
		this.checkForSort(type.getTypename(), sortedTypes);
		
		if(this.isAlreadySorted(type, sortedTypes) == false)
			sortedTypes.add(type);
	}
	
	/**
	 * Check for union type
	 * @param type
	 * @param sortedTypes
	 */
	private void checkForUnionType(unionType type, List<DataType> sortedTypes)
	{
		/*
		 * Check all union element type
		 */
		for(DataType eltType : type.getElements())
			this.checkForSort(eltType, sortedTypes);
		
		if(this.isAlreadySorted(type, sortedTypes) == false)
			sortedTypes.add(type);
	}
	
	/**
	 * Check for struct type
	 * @param type
	 * @param sortedTypes
	 */
	private void checkForStructType(structType type, List<DataType> sortedTypes)
	{
		/*
		 * Check struct element type
		 */
		for(structElement elt : type.getParameters())
			this.checkForSort(elt.getTypename(), sortedTypes);
		
		if(this.isAlreadySorted(type, sortedTypes) == false)
			sortedTypes.add(type);
	}
	
	/**
	 * Check for map type
	 * @param type
	 * @param sortedTypes
	 */
	private void checkForMapType(mapType type, List<DataType> sortedTypes)
	{
		this.checkForSort(type.getKeytype(), sortedTypes);
		this.checkForSort(type.getValtype(), sortedTypes);
		
		if(this.isAlreadySorted(type, sortedTypes) == false)
			sortedTypes.add(type);
	}
	
	/**
	 * Check for defined type
	 * @param type
	 * @param sortedTypes
	 */
	private void checkForDefineType(defineType type, List<DataType> sortedTypes)
	{
		this.checkForSort(type.getTypename(), sortedTypes);
		
		if(this.isAlreadySorted(type, sortedTypes) == false)
			sortedTypes.add(type);
	}
	
	/**
	 * Check for array type
	 * @param type
	 * @param sortedTypes
	 */
	private void checkForArrayType(arrayType type, List<DataType> sortedTypes)
	{
		this.checkForSort(type.getTypename(), sortedTypes);
		
		if(this.isAlreadySorted(type, sortedTypes) == false)
			sortedTypes.add(type);
	}
	
	/**
	 * Check for basic type
	 * @param type
	 * @param sortedTypes
	 */
	private void checkForBasicType(basicType type, List<DataType> sortedTypes)
	{
		if(this.isAlreadySorted(type, sortedTypes) == false)
			sortedTypes.add(type);
	}
	
	/**
	 * Check if the type is already sorted
	 * @param typeName
	 * @param sortedTypes
	 * @return
	 */
	private boolean isAlreadySorted(DataType type, List<DataType> sortedTypes)
	{
		boolean result = false;
		for(DataType datatype : sortedTypes)
		{
			result |= datatype.equals(type);
		}
		return result;
	}
}
