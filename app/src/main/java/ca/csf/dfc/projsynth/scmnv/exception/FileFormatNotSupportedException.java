package ca.csf.dfc.projsynth.scmnv.exception;

/**
 * Exception lorsque quelqu'un essai d'envoyer un fichier non supporté par l'adaptateur.
 * @author Team 2014
 * @see Exception 
 */
public class FileFormatNotSupportedException extends Exception
{
	
	private static final long serialVersionUID = 1L;

	/**
	 * Constructeur par défaut de l'exception
	 */
	public FileFormatNotSupportedException()
	{
		super("Le type de fichier n'est pas supporté");
	}

}
