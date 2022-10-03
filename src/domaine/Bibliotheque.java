package domaine;

public class Bibliotheque {
	private Ouvrage[] fonds;
	private int nbOuvrages;

	public Bibliotheque(int nbMaxOuvrages) {
		fonds = new Ouvrage[nbMaxOuvrages];
		this.nbOuvrages = 0;
	}

	/**
	 * @return the fonds
	 */
	public Ouvrage[] getFonds() {
		return fonds;
	}

	/**
	 * @return the nbOuvrages
	 */
	public int getNbOuvrages() {
		return nbOuvrages;
	}

	/**
	 * @param genre
	 * @param titre
	 * @param auteurs
	 * @param editeur
	 * @param anneeDeParution
	 * @param isbn
	 * @return si l'ouvrage a pu effectivement être ajouté dans la bibliothèque.
	 *         Plus tard, on verra le mécanisme des exceptions pour signaler un
	 *         probleme ou pas de l'insertion
	 */
	public boolean ajouterOuvrage(GenreLitteraire genre, String titre, String auteurs, String editeur,
			int anneeDeParution, String isbn) {
		if (nbOuvrages > fonds.length - 1) {
			assert isInvariantSatisfied();
			return false;
		} else {
			fonds[nbOuvrages] = new Ouvrage(genre, titre, auteurs, editeur, anneeDeParution, isbn, "/" + nbOuvrages);
			nbOuvrages++;
			assert isInvariantSatisfied();
			return true;
		}

	}

	@Override
	public String toString() {
		String textualState = "Bibliotheque d'un fonds de " + nbOuvrages + " ouvrages :\n";
		for (int indexOuvrage = 0; indexOuvrage < nbOuvrages; indexOuvrage++) {
			textualState += "- " + fonds[indexOuvrage];
		}
		return textualState;
	}

	private boolean pasDeTrousAGauche() {
		boolean pasDeTrou = true;
		int i;
		for (i = 0; i < nbOuvrages && pasDeTrou; i++) {
			pasDeTrou = pasDeTrou && fonds[i] != null;
		}
		return (i == nbOuvrages) || (!pasDeTrou);
	}
	
	private boolean toutVideADroite() {
		boolean toutVide = true;
		int i;
		for (i = nbOuvrages; i < fonds.length && toutVide; i++) {
			toutVide = toutVide && fonds[i] == null;
		}
		return (i == fonds.length) || (!toutVide);
	
	}
	
	private boolean isInvariantSatisfied() {
		return  pasDeTrousAGauche() && toutVideADroite();
	}

}
