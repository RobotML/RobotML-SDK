/**
 * 
 */
package org.eclipse.robotml.generators.acceleo.alf.generation;

import org.eclipse.papyrus.uml.alf.alf.Block;

/**
 * @author nbrodnan
 * 
 * Alf bloc container for translation
 */
public class AlfBlock {

	/**
	 * code translation result : String
	 */
	private String _result = "";
	
	/**
	 * Original Alf bloc
	 */
	private Block _bloc = null;
	
	/**
	 * Construct an Alf bloc container
	 * @param bloc : original Alf bloc
	 * @throws Exception : Alf bloc null
	 */
	public AlfBlock(Block bloc) throws Exception {
		if(bloc == null)
		{
			throw new Exception("NULL Alf bloc !!!");
		}
		this._bloc = bloc;
	}
	
	/**
	 * Generate the code translation
	 * @param generator : IAlfGenerator
	 */
	public void generateTo(IAlfGenerator generator)
	{
		this._result = "";
		generator.generate(this);
	}
	
	/**
	 * Get the original Alf bloc
	 * @return original Alf bloc : Alf::Block
	 */
	public Block getBlock()
	{
		return this._bloc;
	}
	
	/**
	 * Define the code translated
	 * @param code : String
	 */
	public void setCodeTranslation(String code)
	{
		_result += code;
	}

	/**
	 * Get the code translated
	 * @return code translated
	 */
	public String getCodeTranslation()
	{
		return _result;
	}
}
