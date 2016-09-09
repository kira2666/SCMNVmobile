package ca.csf.dfc.projsynth.scmnv.exception;

/**
 * Classe pour générer une exception lorsque qu'une balise LaTeX n'est pas reconnue.
 * @author Team 2014
 * @see Exception 
 */
public class FindLatexEquationException extends Exception
{
	private static final long serialVersionUID = 1L;

	/**
	 * Constructeur par défaut de l'exception
	 */
	public FindLatexEquationException()
	{
		super("Une erreur est survenue dans la recherche de balise des équations LaTeX");
	}
}
