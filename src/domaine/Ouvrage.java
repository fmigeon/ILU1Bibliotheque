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
}
