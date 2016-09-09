
package ca.csf.dfc.projsynth.scmnv.tree;


import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;


import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.Tree;
/*
import symbols.Symboles;

import exception.ErrorPipe;
import fmath.ApplicationConfiguration;
import fmath.components.MathMLFormula;
*/
/**
 * Classe qui permet de faire un arbre à partir d'une équation LaTeX
 * @author Team 2014
 */
public class TreeCalculation {
    /**
     * Chemin d'accès relatif pour les fonts pour dessiner un équation LaTeX
     */
    private static final String FOLDER_FONTS = "./res/fonts";

    /**
     * Chemin d'accès relatif pour les glyphs pour dessiner un équation LaTeX
     */
    private static final String FOLDER_GLYPHS = "./res/glyphs";

    /**
     * Nombre d'opérateur de l'arbre
     */
    private int m_nbOperators;

    /**
     * Nombre d'opérand de l'arbre
     */
    private int m_nbOperands;

    /**
     * Profondeur de l'arbre
     */
    private int m_depth;

    /**
     * Complexité de l'arbre
     */
    private double m_complexity;

    /**
     * String représentant la complexité d'un arbre en mot (Ex : complexité de 1
     * = Simple)
     */
    private String m_complexityLabel;

    /**
     * String permettant de voir l'arbre sous forme de string divisé en
     * parenthèse
     */
    private String m_treePrint;

    /**
     * String de l'équation LaTeX
     */
    private String m_LateXEquation;


    /**
     * Arbre syntaxique
     */
    private Tree m_synTree;

    /**
     * Constructeur
     *
     * @param p_lateX LateX equation
     * @throws RecognitionException
     */
    public TreeCalculation(String p_lateX) throws RecognitionException {
        // Initialisation variables
        // Initialisation variables
        this.m_nbOperators = 0;
        this.m_nbOperands = 0;
        this.m_depth = 0;
        this.m_complexity = 0.0;
        this.m_complexityLabel = "";
        this.m_treePrint = "";
        this.m_LateXEquation = "";

        this.m_LateXEquation = p_lateX;
        CharStream charStream = new ANTLRStringStream(p_lateX);
        EquationLexer lexer = new EquationLexer(charStream);
        TokenStream tokenStream = new CommonTokenStream(lexer);
        EquationParser parser = new EquationParser(tokenStream);
        EquationParser.doIt_return returnValue1 = parser.doIt();

        CommonTree tree = (CommonTree) returnValue1.getTree();
        this.m_synTree = tree;

        this.initialize(tree);

        this.m_treePrint = tree.toStringTree();

    }

    /**
     * @return Nombre d'opérateur de l'arbre
     */
    public int getNbOperators() {
        return this.m_nbOperators;
    }

    /**
     * @return Nombre d'opérands dans l'arbre
     */
    public int getNbOperands() {
        return this.m_nbOperands;
    }

    /**
     * @return La profondeur de l'arbre
     */
    public int getDepth() {
        return this.m_depth;
    }

    /**
     * @return La complexité de l'équation
     */
    public double getComplexity() {
        return this.m_complexity;
    }

    /**
     * @return La catégorie de la complexité
     */
    public String getComplexityLabel() {
        return this.m_complexityLabel;
    }

    /**
     * @return L'équation plus celle-ci sous forme d'arbre avec parenthèse
     */
    public String getTreePrint() {
        return this.m_treePrint;
    }

    /**
     * @return L'équation LaTeX
     */
    public String getLateXEquation() {
        return this.m_LateXEquation;
    }


    /**
     * Override de la méthode toString Affiche l'arbre avec son équation LaTeX,
     * son équation sous forme d'arbre divisé en parenthèse, sa complexité en
     * chiffre, le label de la complexité, son nombre d'opérands, son nombre
     * d'opérateurs et sa profondeur
     */
    @Override
    public String toString() {
        return "Equation LaTeX       : " + this.m_LateXEquation + "\nTree equation 	     : " + this.m_treePrint
                + "\nComplexity label     : " + this.m_complexityLabel + "\nComplexity number    : "
                + this.m_complexity + "\nTree nb of operands  : " + this.m_nbOperands + "\nTree nb of operators : "
                + this.m_nbOperators + "\nTree depth           : " + this.m_depth;
    }

    /**
     * Initialise l'arbre et calcule la complexité puis assigne une complexité
     * au string.
     *
     * @param t L'arbre
     */
    private void initialize(Tree t) {
        this.m_depth = this.calculateTree(t) - 1;

        this.m_complexity = (0.39 * this.m_nbOperands) + (0.10 * this.m_nbOperators) + (0.16 * this.m_depth);

        if (this.m_complexity < 1.5) {
            this.m_complexityLabel = "Très Simple";
        } else if (this.m_complexity < 2.5) {
            this.m_complexityLabel = "Simple";
        } else if (m_complexity < 3.5) {
            this.m_complexityLabel = "Moyen";
        } else if (m_complexity < 4.5) {
            this.m_complexityLabel = "Complexe";
        } else {
            this.m_complexityLabel = "Très Complex";
        }
    }


    /**
     * "Override" de la méthode replaceFirst de String.
     *
     * @param original    chaine original
     * @param replace     chaine à remplacer
     * @param replacement chaine de remplacement
     * @param all         vrai si on veut tout changer, faux sinon
     * @return la chaine modifier selon les paramètres
     * @author Samuel Blais
     */
    private String cReplace(String original, String replace, String replacement, boolean all) {
        StringBuilder tmp = new StringBuilder("");
        boolean first = true;

        //On parcours tout les caractères
        for (int i = 0; i < original.length(); i++) {
            //Si on rencontre le caractère de remplacement et qu'on doit le remplacer
            if (original.substring(i, i + 1).equals(replace) && (all || first)) {
                //On ajoute la chaine de remplacement au stringbuilder de sortie
                tmp.append(replacement);
                first = false;
            } else {
                //Sinon on ajoute le caractère rencontré
                tmp.append(original.substring(i, i + 1));
            }

        }
        return tmp.toString();
    }

    /**
     * Retourne le nombre de sous arguments (sections de parenthèses)
     *
     * @param equation l'équation latex
     * @return le nombre de sous-arguments
     * @author Samuel Blais
     */
    private int getSousArgs(String equation) {
        int currentParenthesisHeight = 0;
        int argNum = 0;

        //On parcours toute l'équation, caractère par caractère
        for (int i = 0; i < equation.length(); i++) {
            String tmp = equation.substring(i, i + 1);
            //S'il s'agit d'une parenthèse ouvrante
            if (tmp.equals("(")) {
                //On incrémente le compteur
                currentParenthesisHeight++;
            }
            //S'il s'agit d'une parenthèse fermante
            else if (tmp.equals(")")) {
                //On décrémente le compteur
                currentParenthesisHeight--;
                //On vérifie si on vient d'arriver à une fin d'expression.
                if (currentParenthesisHeight == 0) {
                    //On incrémente le nombre d'expression
                    argNum++;
                }
            }
        }

        return argNum;
    }

    /**
     * Retourne la hauteur maximale de parenthèses
     *
     * @param equation l'équation latex
     * @return la hauteur maximale de parenthèses
     * @author Samuel Blais
     */
    private int getParenthesisMax(String equation) {
        int parenthesisMax = 0;
        int currentParenthesisHeight = 0;

        //On parcours toute l'équation, caractère par caractère
        for (int i = 0; i < equation.length(); i++) {
            String tmp = equation.substring(i, i + 1);
            //S'il s'agit d'une parenthèse ouvrante
            if (tmp.equals("(")) {
                //On incrémente le compteur
                currentParenthesisHeight++;

                if (currentParenthesisHeight > parenthesisMax)
                    parenthesisMax = currentParenthesisHeight;
            } else if (tmp.equals(")")) {
                //On décrémente le compteur
                currentParenthesisHeight--;
            }
        }

        return parenthesisMax;
    }


    /**
     * Calcule la profondeur, les opérandes et les opérateurs de l'arbre
     *
     * @param t the tree
     * @return Max depth
     */
    private int calculateTree(Tree t) {
        if (t.getChildCount() == 0) {
            this.m_nbOperands += 1;
        } else {
            this.m_nbOperators += 1;
        }

        ArrayList<Integer> depth = new ArrayList<Integer>();
        int deeper = 0;

        for (int i = 0; i < t.getChildCount(); i++) {
            depth.add(calculateTree(t.getChild(i)));
        }

        for (Integer nb : depth) {
            if (nb > deeper) {
                deeper = nb;
            }
        }
        return deeper + 1;
    }

}
