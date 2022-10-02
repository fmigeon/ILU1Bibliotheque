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
	
}
