package scenarios;

import domaine.Bibliotheque;
import domaine.Exemplaire;
import domaine.GenreLitteraire;
import domaine.Ouvrage;

public class CreatingAndAccessingExemplaries {

	public static void main(String[] args) {

		Bibliotheque maBibliotheque = new Bibliotheque(50);
		maBibliotheque.ajouterOuvrage(GenreLitteraire.S, "Beginning Software Engineering", "Rod Stephens", "wrox", 2015,
				"978-1-1118-969114-454500");

		Ouvrage ouv = new Ouvrage(GenreLitteraire.S, "truc", "bidule", "trucmuche", 0, "XXX", "WHAT?");
		Exemplaire ex = new Exemplaire("???");
	}

}
