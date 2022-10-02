package domaine;

public class Bibliotheque {
	private Ouvrage [] fonds;
	private int nbOuvrages;
	
	
	public Bibliotheque(int nbMaxOuvrages) {
		fonds= new Ouvrage[nbMaxOuvrages];
		this.nbOuvrages = 0;
	}
	
}
