package domaine;


public class Exemplaire {
	private String cote;
	private boolean empruntable = true;
	private boolean consultableEnLigne = true;
	private boolean emprunte=false;
	
	public Exemplaire(String cote) {
		this.cote = cote;
	}

	/**
	 * @return the cote
	 */
	public String getCote() {
		return cote;
	}

	/**
	 * @return the empruntable
	 */
	public boolean isEmpruntable() {
		return empruntable;
	}

	/**
	 * @return the consultableEnLigne
	 */
	public boolean isConsultableEnLigne() {
		return consultableEnLigne;
	}

	/**
	 * @return the emprunte
	 */
	public boolean isEmprunte() {
		return emprunte;
	}

	@Override
	public String toString() {
		return "Exemplaire [cote=" + cote + ", empruntable=" + empruntable + ", consultableEnLigne="
				+ consultableEnLigne + ", emprunte=" + emprunte + "]";
	}
	
	
	
}
