package domaine;

public class Bibliotheque {
	private static final int NB_MAX_OUVRAGES = 30;
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

	public void ajouterOuvrage(Ouvrage ouvrageAAjouter) {
		if (nbOuvrages<NB_MAX_OUVRAGES)  {
			fonds[nbOuvrages++] = ouvrageAAjouter;
		}
	}
}
