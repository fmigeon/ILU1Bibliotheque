package domaine;


public class Exemplaire {
	private String cote;
	private boolean empruntable = true;
	private boolean consultableEnLigne = true;
	private boolean emprunte=false;
	
	public Exemplaire(String cote) {
		this.cote = cote;
	}
}
