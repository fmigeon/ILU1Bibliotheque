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
	private int nbExemplaires = 0;

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

	@Override
	public String toString() {
		String result = "Ouvrage [titre=" + titre + ", auteurs=" + auteurs + ", editeur=" + editeur + ", anneeDeParution="
				+ anneeDeParution + ", isbn=" + isbn + "]\n";
		for (int i = 0 ; i < nbExemplaires ; i++) {
			result += "   + "+lesExemplaires[i];
		}
		return result;
	}

}
