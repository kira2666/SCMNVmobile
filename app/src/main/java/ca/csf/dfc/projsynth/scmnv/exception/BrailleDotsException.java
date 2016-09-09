/**
 * 
 */
package ca.csf.dfc.projsynth.scmnv.exception;

/**
 * @author  Richard Giroux
 *
 */
public class BrailleDotsException extends Exception
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	public BrailleDotsException()
	{
		
		super("La liste en paramètre dépasse les 6 ou 8 points braille règlementaires");

	}

}
