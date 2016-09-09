package ca.csf.dfc.projsynth.scmnv.exception;

/**
 * Classe pour générer une exception lorsque l'exception attrapé ne 
 * correspond à aucune des autres classes.
 * @author Team 2014
 * @see Exception 
 */
public class UnknownErrorException extends Exception
{
	private static final long serialVersionUID = 1L;
	
	/**
	 * Constructeur par défaut de l'exception
	 */
	public UnknownErrorException()
	{
		super("Une erreur est survenue et nous ne savons pas pourquoi.");
	}
	
}
