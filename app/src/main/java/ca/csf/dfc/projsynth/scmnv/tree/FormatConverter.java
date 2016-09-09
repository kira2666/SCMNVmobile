package ca.csf.dfc.projsynth.scmnv.tree;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

import ca.csf.dfc.projsynth.scmnv.exception.EmptyEquationException;
import ca.csf.dfc.projsynth.scmnv.exception.EquationConvertionException;
import ca.csf.dfc.projsynth.scmnv.exception.EquationParsingException;
import ca.csf.dfc.projsynth.scmnv.exception.ErrorPipe;
import ca.csf.dfc.projsynth.scmnv.exception.FileFormatNotSupportedException;
import ca.csf.dfc.projsynth.scmnv.exception.FindLatexEquationException;
import ca.csf.dfc.projsynth.scmnv.exception.UnknownErrorException;

/**
 * Classe permettant de charger un document contenant des équations mathématiques.
 * @author Team 2014
 *
 */
public class FormatConverter
{
	/**
	 * Expression pour empêcher l'utilisateur de marquer du garbage lors de
	 * l'entrée manuelle d'un chemin d'accès pour un fichier.
	 */
	public final static String REGEX_FILE_PATH = "(([a-zA-Z]:)|(\\.))([\\\\/][a-zA-ZÀ-ÿ0-9-_-|\\s]+)+(\\.)([a-zA-ZÀ-ÿ0-9_-]+)";

	/**
	 * ArrayList contenant toute les équations contenu dans l'équation
	 */
	private ArrayList<TreeCalculation> m_treeList = new ArrayList<TreeCalculation>();

	/**
	 * Constructeur
	 * 
	 * @param p_equation
	 *            L'équation ou le chemin d'accès du fichier
	 * @throws FileNotFoundException
	 *             Si le fichier n'est pas trouvé
	 * @throws EmptyEquationException
	 *             Si l'équation est vide
	 * @throws EquationParsingException
	 *             Si il y a eu une erreur de parsing
	 * @throws EquationConvertionException
	 *             Si il y a eu une erreur lors de la convertion vers LaTeX ou
	 *             docx vers LaTeX
	 * @throws FindLatexEquationException
	 *             Si il n'y a aucune équation LaTeX dans la string p_equation
	 * @throws FileFormatNotSupportedException
	 *             Si le format du fichier n'est pas supporté
	 * @throws UnknownErrorException
	 *             Si il y a une erreur inconnu qui provient du parser
	 */
	public FormatConverter(String p_equation) throws FileNotFoundException, EmptyEquationException,
			EquationParsingException, EquationConvertionException, FindLatexEquationException,
			FileFormatNotSupportedException, UnknownErrorException
	{
		String equation = "";
		String[] equationList;

		// Ce try permet de récupéré les erreurs survenue lors de la conversion
		// effectuer
		// par Fmath
		try
		{
			// Récupération du flux d'erreur de la console parce que fmath écrit
			// dedans et on est pas capable de le récupérer...
			ByteArrayOutputStream byteA = new ByteArrayOutputStream();
			PrintStream outStream = new PrintStream(new ErrorPipe(byteA), false);
			PrintStream oldErr = System.err;
			System.setErr(outStream);

			if (p_equation.matches(REGEX_FILE_PATH))
			{
				if (p_equation.matches("(.+)(\\.docx)"))
				{
					String temp = fmath.conversion.ConvertFromWordToMathML.getMathMLFromDocStream(new FileInputStream(p_equation), "UTF-8");
					equation = fmath.conversion.ConvertFromMathMLToLatex.convertToLatex(temp);
					equation = this.adjustWordToLatex(equation);
				}
				else if (p_equation.matches("(.+)(\\.tex)"))
				{
					equation = this.getString(p_equation);

				}
				else if (p_equation.matches("(.+)(\\.mml)") || p_equation.matches("(.+)(\\.xml)"))
				{
					equation = fmath.conversion.ConvertFromMathMLToLatex.convertToLatex(this.getString(p_equation));
				}
				else
				{
					throw new FileFormatNotSupportedException();
				}
			}
			else if (p_equation.contains("<math>"))
			{
				equation = fmath.conversion.ConvertFromMathMLToLatex.convertToLatex(p_equation);

			}
			else
			{
				equation = p_equation;
			}

			// les concepteurs de Fmath catch eux meme les JDOM exception dans
			// leur code
			// et l'imprime directement dans le System.err et ne renvoie pas
			// d'exception,
			// nous vérifions donc s'il y a eu une sortie dans le System.err
			// pour savoir
			// si cette erreur est survenue puis nous lancons notre exception
			if (!byteA.toString().isEmpty() || equation.equalsIgnoreCase("$ Error $"))
			{
				// On redonne le flux d'erreur à la console
				System.setErr(oldErr);
				throw new EquationConvertionException();
			}

			// On redonne le flux d'erreur à la console
			System.setErr(oldErr);
		}
		catch (RuntimeException e)
		{
			// les concepteurs de Fmath ont caché leur exception dans la cause
			// d'une
			// runtime exception, nous relancons donc la cause pour connaitre sa
			// nature
			try
			{
				throw e.getCause();
			}
			catch (FileNotFoundException ex)
			{
				throw new FileNotFoundException("Le document envoyé n'a pas pu être retrouvé");
			}
			catch (Throwable ex)
			{
				throw new UnknownErrorException();
			}
		}
		catch (EquationConvertionException e)
		{
			throw e;
		}
		catch (FileFormatNotSupportedException e)
		{
			throw e;
		}
		catch (FileNotFoundException e)
		{
			throw e;
		}
		catch (Throwable e)
		{
			throw new UnknownErrorException();
		}

		// Ce try permet de récupéré les erreurs survenue lors du preprocessing
		// des différentes équations
		try
		{
			equation = this.preProcessing(equation);
		}
		catch (Throwable e)
		{
			throw new FindLatexEquationException();
		}

		// Vérifie si la string contient aucune équation, nous lancons une
		// exception
		if (equation.isEmpty())
		{
			throw new EmptyEquationException();
		}
		else
		{
			equationList = equation.split("\\\\newline");

			// Ce try permet de récupéré les erreurs survenue lors du lexing et
			// du parsing des différentes équations
			try
			{
				for (String equat : equationList)
				{
					this.m_treeList.add(new TreeCalculation(equat));
				}
			}
			catch (RuntimeException e)
			{
				throw new EquationParsingException();
			}
			catch (Throwable e)
			{
				throw new UnknownErrorException();
			}

		}

	}

	/**
	 * Getter
	 * 
	 * @return L'arrayList de TreeCalculation contenant chaque arbre
	 */
	public ArrayList<TreeCalculation> getTreeList()
	{
		return m_treeList;
	}

	/**
	 * Pré processing de l'équation avant de l'envoyer au parser. Permet
	 * d'éviter des erreurs lors du parsing. Permet aussi d'établir certaines
	 * règles qu'on ne pourrait pas faire dans le parser
	 * 
	 * @param p_equation
	 *            L'équation LaTeX
	 * @return La nouvelle équation modifié s'il y a eu lieu
	 */
	private String preProcessing(String p_equation)
	{
		String result = p_equation;

		result = this.fixMultilineEquation(result);
		result = this.findLaTeXEquation(result);
		result = this.fixStyle(result);

		return result;
	}

	/**
	 * Cette méthode permet de supprimer les balises LaTeX pour le style
	 * 
	 * @param p_string
	 *            L'équation LaTeX
	 * @return La string de la nouvelle équation LaTeX sans les balises style
	 *         s'il y a eu lieu
	 */
	private String fixStyle(String p_string)
	{
		String[] insidePossibilityArray = { "\\mathrm", "\\mathit", "\\mathnormal", "\\mathcal", "\\mathscr",
				"\\mathpzc", "\\mathbb", "\\varmathbb", "\\mathbbm", "\\mathbbmss", "\\mathbbmtt", "\\mathds",
				"\\mathfrak", "\\textfrak", "\\textsawb", "\\textgoth", "\\mathsf", "\\mathbf"};

		for (String possibility : insidePossibilityArray)
		{
			StringBuilder build = new StringBuilder(p_string);

			if (build.toString().contains(possibility + "{"))
			{
				int sIndex = 0;
				int fenceIndex = 0;
				int index = 0;
				int endIndex = 0;

				while (build.indexOf(possibility + "{") != -1)
				{
					sIndex = build.indexOf(possibility + "{");
					fenceIndex = build.indexOf("{", sIndex);

					index = ++fenceIndex;

					endIndex = build.indexOf("}", index);

					String inside = build.substring(index, endIndex);

					build.replace(sIndex, ++endIndex, " " + inside + " ");

				}

				p_string = build.toString();

				if (p_string.contains(possibility))
				{
					p_string = p_string.replace(possibility, " ");
				}
			}
		}

		return p_string;
	}

	/**
	 * Méthode utilisé pour trouver toutes les équations contenus dans la string
	 * envoyée. Elle ignore le texte que la string contient.
	 * 
	 * @param p_equation
	 *            La où les équations
	 * @return Une string d'équations
	 */
	private String findLaTeXEquation(String p_equation)
	{
		String result = p_equation;

		// On vérifie si p_equation contient au moins
		if (p_equation.contains("$") || p_equation.contains("\\[") || p_equation.contains("\\begin")
				|| p_equation.contains("\\("))
		{
			StringBuilder build = new StringBuilder();

			// Tableau des possibilités après un \begin
			String[] insidePossibilityArray = { "equation", "equation*", "align", "align*", "multline", "multline*",
					"gather", "gather*", "math", "displaymath" };
			int startIndex = 0;
			int endIndex = 0;
			int bracketIndex = 0;
			int beginIndex = 0;
			int parenthesisIndex = 0;
			int insideBeginLength = 0;
			String parenthesisOrBracket = "\\]";

			// On fait un while tant qu'on trouve un des signes suivant dans la
			// string
			while ((p_equation.indexOf("$") != -1) || (p_equation.indexOf("\\[") != -1)
					|| (p_equation.indexOf("\\begin") != -1 || p_equation.indexOf("\\(") != -1))
			{
				// On prend en considération que c'est le signe cash qui est
				// utilisé

				boolean isCashSign = true;
				boolean isDoubleCashSign = false;
				boolean isBeginSign = false;
				boolean isGood = true;

				// On vérifie les index de chaque délimiteurs pour pouvoir
				// remettre les équations en ordres
				startIndex = p_equation.indexOf("$");
				bracketIndex = p_equation.indexOf("\\[");
				beginIndex = p_equation.indexOf("\\begin");
				parenthesisIndex = p_equation.indexOf("\\(");

				// Si l'index des bracket et que l'index des parenthèse existe
				// on compare les deux
				if (bracketIndex != -1 && parenthesisIndex != -1)
				{
					// Si les parenthèse arrive avant les bracket on met l'index
					// des bracket à celui des parenthèse.
					// Ensuite on met le string à celui des parenthèse. On fait
					// ça parce que les deux c'est exactement le même
					// procédé...
					if (parenthesisIndex < bracketIndex)
					{
						bracketIndex = parenthesisIndex;
						parenthesisOrBracket = "\\)";
					}
				}
				else if (bracketIndex == -1 && parenthesisIndex != -1)
				{
					bracketIndex = parenthesisIndex;
					parenthesisOrBracket = "\\)";
				}

				// Si bracketIndex existe
				if (bracketIndex != -1)
				{
					// le startIndex du $ n'existe pas on met son boolean à
					// false et on met le startIndex à l'index des bracket
					// Sinon on compare et si les bracket son avant le cash on
					// fait la même chose
					if (startIndex == -1)
					{
						isCashSign = false;
						startIndex = bracketIndex;
					}
					else if (bracketIndex < startIndex)
					{
						isCashSign = false;
						startIndex = bracketIndex;

					}
				}

				if (beginIndex != -1)
				{
					if (!isCashSign)
					{
						if (beginIndex < bracketIndex)
						{
							isBeginSign = true;
							startIndex = beginIndex;
						}
					}
					else
					{
						if (startIndex == -1)
						{
							isBeginSign = true;
							isCashSign = false;
							startIndex = beginIndex;
						}
						else if (beginIndex < startIndex)
						{
							isBeginSign = true;
							isCashSign = false;
							startIndex = beginIndex;
						}
					}
				}

				// Exécution si c'est un \begin{quelquechose}
				if (isBeginSign)
				{
					int end = p_equation.indexOf("}", startIndex);
					isGood = false;

					String inside = p_equation.substring(startIndex + 7, end);

					insideBeginLength = inside.length();

					for (String insidePossibility : insidePossibilityArray)
					{
						isGood |= insidePossibility.equals(inside);
					}
				}

				// Exécution si c'est un $équation$
				if (isCashSign)
				{
					if (startIndex != 0)
					{
						// On vérifie si ce n'est pas un signe de dollars
						// identifié par \$ et non le délimiteur $ des équations
						// mathématique
						isGood = (p_equation.charAt(startIndex - 1) != '\\');
					}
				}

				if (isGood)
				{
					if (isCashSign)
					{
						// On vérifie si c'est $$equation$$ au lieu de
						// $equation$ dans ce cas on doit ajouter 1 à chaque
						// index pour
						// ne pas prendre les deux signes de $ de plus lors du
						// substring de l'équation
						if (p_equation.charAt(startIndex + 1) == '$')
						{
							startIndex++;
							endIndex++;
							isDoubleCashSign = true;
						}
						endIndex = p_equation.indexOf("$", ++startIndex);
					}
					else if (!isBeginSign)
					{
						startIndex += 2;
						endIndex = p_equation.indexOf(parenthesisOrBracket, startIndex);
					}
					else
					{
						startIndex += 7;
						startIndex += insideBeginLength + 1;
						endIndex = p_equation.indexOf("\\end", startIndex);
					}

					build.append(p_equation.substring(startIndex, endIndex) + "\\newline");

					// On enleve l'équation utilisé dans la string d'équation
					// initiale
					if (isCashSign)
					{
						if (isDoubleCashSign)
						{
							p_equation = p_equation.substring(endIndex + 2);
						}
						else
						{
							p_equation = p_equation.substring(endIndex + 1);
						}
					}
					else if (!isBeginSign)
					{
						p_equation = p_equation.substring(endIndex + 2);
					}
					else
					{
						p_equation = p_equation.substring(endIndex + insideBeginLength + 6);
					}
				}
				else
				{
					p_equation = p_equation.substring(startIndex + 1);
				}

			}

			// Si notre builder n'est pas vide donc qu'il y a eu insertion
			// d'équation à l'intérieur, on supprime le
			// dernier \newline...
			if (build.length() != 0)
			{
				build.delete(build.length() - 8, build.length());
			}

			result = build.toString();

		}

		return result;

	}

	/**
	 * Méthode qui permet de transformer les délimiteurs de nouvelle équation en
	 * ceux que nous utilisons(\newline)
	 * 
	 * @param p_equation
	 *            L'équation LaTeX
	 * @return La nouvelle string avec les nouveau délimiteurs
	 */
	private String fixMultilineEquation(String p_equation)
	{
		if (p_equation.contains("\n"))
		{
			p_equation = p_equation.replace("\n", "\\newline");
		}
		if (p_equation.contains("\\\\"))
		{
			p_equation = p_equation.replace("\\\\", "\\newline");
		}
		return p_equation;
	}

	/**
	 * Méthode permettant de récupérer le contenu d'un fichier(mml, tex, xml) et
	 * de le mettre dans une string
	 * 
	 * @param p_file
	 *            Le chemin d'accès du fichier
	 * @return Une string du contenu du fichier
	 * @throws FileNotFoundException
	 *             Si le fichier n'est pas trouvé
	 */
	private String getString(String p_file) throws FileNotFoundException
	{
		File file = new File(p_file);
		Scanner scan = null;
		StringBuilder build = new StringBuilder();

		try
		{
			scan = new Scanner(new FileInputStream(file), "UTF-8");

			while (scan.hasNextLine())
			{
				build.append(scan.nextLine());
			}
		}
		finally
		{
			if (scan != null)
			{
				scan.close();
			}

		}

		return build.toString();
	}
	
	/***
	 * Méthode pour changer deux symboles qui pourrait se retrouver dans un fichier Word
	 * @param p_equation L'équation à vérifier
	 * @return La nouvelle équation modifiée
	 */
	private String adjustWordToLatex(String p_equation)
	{
		String[] listOfAdjustement = {"&lt;", "&gt;"};
		String[] listOfreplacement = {"<", ">"};
		
		for (int i = 0; i < listOfAdjustement.length; i++)
		{
			p_equation = p_equation.replaceAll(listOfAdjustement[i], listOfreplacement[i]);
		}
		
		return p_equation;
	}
}