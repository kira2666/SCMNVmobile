package ca.csf.dfc.projsynth.scmnv.exception;

/**
 * Classe pour générer une exception lorsque l'utilisateur tente de convertir une équation
 * que le parser ne supporte pas (exemple: caractères non-reconnus).
 * @author Team 2014
 * @see Exception 
 */
public class EquationConvertionException extends Exception
{
	private static final long serialVersionUID = 1L;

	/**
	 * Constructeur par défaut de l'exception
	 */
	public EquationConvertionException()
	{
		super("L'équation n'a pu être convertie");
	}
}
