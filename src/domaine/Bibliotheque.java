package domaine;

public class Bibliotheque {
	private Ouvrage [] fonds;
	private int nbOuvrages;
	
	
	public Bibliotheque(int nbMaxOuvrages) {
		fonds= new Ouvrage[nbMaxOuvrages];
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
	
	@Override
	public String toString() {
		String textualState = "Bibliotheque d'un fonds de "+nbOuvrages+ " ouvrages :\n";
		for(int indexOuvrage = 0;indexOuvrage<nbOuvrages;indexOuvrage++) {
			textualState += "- "+ fonds[indexOuvrage];
		}
		return textualState;
	}
	
}
