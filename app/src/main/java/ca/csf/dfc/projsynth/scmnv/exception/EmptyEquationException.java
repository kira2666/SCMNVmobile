package ca.csf.dfc.projsynth.scmnv.exception;

/**
 * Classe pour générer une exception lorsque l'utilisateur ouvre un fichier 
 * qui ne contient aucune équation.
 * @author Team 2014
 * @see Exception 
 */
public class EmptyEquationException extends Exception
{
	private static final long serialVersionUID = 1L;

	/**
	 * Constructeur par défaut de l'exception
	 */
	public EmptyEquationException()
	{
		super("Aucune équation trouvée");
	}
}
