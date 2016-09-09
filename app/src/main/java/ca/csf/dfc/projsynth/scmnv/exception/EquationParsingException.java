package ca.csf.dfc.projsynth.scmnv.exception;

/**
 * Classe pour générer une exception lorsque l'utilisateur tente de traduire une équation
 * qui a pu être convertie, mais qui est intraductible.
 * @author Team 2014
 * @see Exception 
 */
public class EquationParsingException extends Exception
{
	private static final long serialVersionUID = 1L;

	/**
	 * Constructeur par défaut de l'exception
	 */
	public EquationParsingException()
	{
		super("L'équation n'a pu être parsée");
	}
}
