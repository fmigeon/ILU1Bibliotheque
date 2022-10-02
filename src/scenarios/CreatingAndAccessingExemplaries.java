package scenarios;

import domaine.Bibliotheque;
import domaine.Exemplaire;
import domaine.Ouvrage;

public class CreatingAndAccessingExemplaries {

	public static void main(String[] args) {

		Bibliotheque maBibliotheque = new Bibliotheque(50);

		Ouvrage bse = new Ouvrage("Beginning Software Engineering", "Rod Stephens", "wrox", 2015, "978-1-1118-969114-454500");
		
		Exemplaire bseAConsulter = new Exemplaire(getNewCote());
		
		maBibliotheque.ajouterOuvrage(bse);
		bse.ajouterExemplaire(bseAConsulter);

		System.out.println(maBibliotheque);
		System.out.println(bse);
		System.out.println(bseAConsulter);
		
	}

// Les cotes des exemplaires seront implantés par un compteur tout simple qui augmente à chaque appel
	private static String getNewCote() {
		return ++coteCount+"";
	}
	private static int coteCount = 0;

}
