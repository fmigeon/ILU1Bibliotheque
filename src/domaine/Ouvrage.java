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
	
	private String prefixeCote;

	public Ouvrage(String titre, String auteurs, String editeur, int anneeDeParution, String isbn, String prefixeCote) {
		super();
		this.lesExemplaires = new Exemplaire[NB_MAX_EXEMPLAIRES];
		this.titre = titre;
		this.auteurs = auteurs;
		this.editeur = editeur;
		this.anneeDeParution = anneeDeParution;
		this.isbn = isbn;
		this.prefixeCote = prefixeCote;
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
	 * Numero unique généré à partir d'un préfixe unique par ouvrage et de l'index dans le tableau d'ouvrage.
	 * @return si l'exemplaire a pu effectivement être ajouté à l'ouvrage.
	 *         Plus tard, on verra le mécanisme des exceptions pour signaler un
	 *         probleme ou pas de l'insertion
	 */
	public boolean ajouterExemplaire() {
		if (nbExemplaires < NB_MAX_EXEMPLAIRES) {
			lesExemplaires[nbExemplaires] = new Exemplaire(prefixeCote+"-"+nbExemplaires);
			nbExemplaires++;
			return true;
		} else {
			return false;
		}
	}
	
}
