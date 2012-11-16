package org.eclipse.robotml.generators.xtext.athena.simu.main;

import java.util.ArrayList;
import java.util.List;

import org.xtext.athenaDSL.DataType;
import org.xtext.athenaDSL.arrayType;
import org.xtext.athenaDSL.defineType;
import org.xtext.athenaDSL.mapType;
import org.xtext.athenaDSL.structElement;
import org.xtext.athenaDSL.structType;
import org.xtext.athenaDSL.unionType;
import org.xtext.athenaDSL.vectorType;

public class DataTypeCollection {
	
	private ArrayList<DataType> _buffer = null;
	
	public DataTypeCollection(List<DataType> origin)
	{
		_buffer = new ArrayList<DataType>(origin);
	}
	
	public void add(DataType type)
	{
		if(this._buffer.contains(type) == false)
		{
			this._buffer.add(type);
		}
	}
	
	public void remove(DataType type)
	{
		if(this._buffer.contains(type) == true)
		{
			this._buffer.remove(type);
		}
	}
	
	public void Sort()
	{
		for(int cpt = 0; cpt < this._buffer.size(); cpt++)
		{
			DataType type = this._buffer.get(cpt);
			
			if(changeIndex(type, true))
			{
				cpt = 0;
			}
		}
	}
	
	
	private boolean changeIndex(DataType type, boolean check_structure)
	{
		boolean isMove= false;
		int current_index = this._buffer.indexOf(type);
		int new_index = 0;
		if(type instanceof arrayType)
		{
			new_index = changeIndexArrayType((arrayType)type);
		}
		else if(type instanceof vectorType)
		{
			new_index = changeIndexVectorType((vectorType)type);
		}
		else if(type instanceof mapType)
		{
			new_index = changeIndexMapType((mapType)type);
		}
		else if(type instanceof structType)
		{
			new_index = changeIndexStructType((structType)type);
		}
		else if(type instanceof unionType)
		{
			new_index = changeIndexUnionType((unionType)type);
		}
		else if(type instanceof defineType)
		{
			new_index = changeIndexDefineType((defineType)type);
		}
		
		if(new_index > current_index)
		{
			this.move(type, new_index);
			isMove = true;
		}
		
		return isMove;
	}
	
	private int changeIndexArrayType(arrayType array)
	{
		int array_index = this._buffer.indexOf(array);
		int type_index = this._buffer.indexOf(array.getTypename());
		
		return type_index < array_index ? array_index : type_index;
	}
	
	private int changeIndexVectorType(vectorType vector)
	{
		int vector_index = this._buffer.indexOf(vector);
		int type_index = this._buffer.indexOf(vector.getTypename());
		
		return type_index < vector_index ? vector_index : type_index;
	}
	
	private int changeIndexMapType(mapType map)
	{
		int map_index = this._buffer.indexOf(map);
		int key_index = this._buffer.indexOf(map.getKeytype());
		int val_index = this._buffer.indexOf(map.getValtype());
		
		int index = map_index;
		if(key_index > index) index = key_index;
		if(val_index > index) index = val_index;
		return index;
	}
	
	private int changeIndexStructType(structType struct)
	{
		int struct_index = this._buffer.indexOf(struct);
		int index = struct_index;
		for(structElement elt : struct.getParameters())
		{
			int elt_index = this._buffer.indexOf(elt.getTypename());
			if(elt_index > index) index = elt_index;
		}
		return index;
	}
	
	private int changeIndexUnionType(unionType union)
	{
		int union_index = this._buffer.indexOf(union);
		int index = union_index;
		for(DataType type : union.getElements())
		{
			int type_index = this._buffer.indexOf(type);
			if(type_index > index) index = type_index;
		}
		return index;
	}
	
	private int changeIndexDefineType(defineType define)
	{
		int define_index = this._buffer.indexOf(define);
		int type_index = this._buffer.indexOf(define.getTypename());
		
		return type_index > define_index ? type_index : define_index;
	}
	
	
	
	private void move(DataType type, int index)
	{
		this._buffer.remove(type);
		if(index > this._buffer.size())
		{
			this._buffer.add(type);
		}
		else
		{
			this._buffer.add(index, type);
		}
	}
	
	public List<DataType> getTypes()
	{
		return this._buffer;
	}
}
