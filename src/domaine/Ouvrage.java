package domaine;

import java.util.Arrays;

public class Ouvrage {
	private static final int NB_MAX_EXEMPLAIRES = 50;
	
	private Exemplaire[] lesExemplaires;
	private String titre;
	private String auteurs;
	private String editeur;
	private int anneeDeParution;
	private String isbn;
	private int nbExemplaires=0;

	public Ouvrage(String titre, String auteurs, String editeur, int anneeDeParution, String isbn) {
		super();
		this.lesExemplaires = new Exemplaire[NB_MAX_EXEMPLAIRES];
		this.titre = titre;
		this.auteurs = auteurs;
		this.editeur = editeur;
		this.anneeDeParution = anneeDeParution;
		this.isbn = isbn;
	}

	/**
	 * @return the lesExemplaires
	 */
	public Exemplaire[] getLesExemplaires() {
		return lesExemplaires;
	}

	/**
	 * @return the titre
	 */
	public String getTitre() {
		return titre;
	}

	/**
	 * @return the auteurs
	 */
	public String getAuteurs() {
		return auteurs;
	}

	/**
	 * @return the editeur
	 */
	public String getEditeur() {
		return editeur;
	}

	/**
	 * @return the anneeDeParution
	 */
	public int getAnneeDeParution() {
		return anneeDeParution;
	}

	/**
	 * @return the isbn
	 */
	public String getIsbn() {
		return isbn;
	}

	/**
	 * @return the nbExemplaires
	 */
	public int getNbExemplaires() {
		return nbExemplaires;
	}
	
	/**
	 * @param cote le numero de codage de l'exemplaire dans la bibliotheque. Numero unique qui pose probleme pour sa génération
	 * @return si l'exemplaire a pu effectivement être ajouté à l'ouvrage.
	 *         Plus tard, on verra le mécanisme des exceptions pour signaler un
	 *         probleme ou pas de l'insertion
	 */
	public boolean ajouterExemplaire(String cote) {
		if (nbExemplaires < NB_MAX_EXEMPLAIRES) {
			lesExemplaires[nbExemplaires++] = new Exemplaire(cote);
			return true;
		} else {
			return false;
		}
	}
	
}
