package domaine;

public enum GenreLitteraire {

   R("roman"), SF("roman fantasy / science-fiction"), RP("roman policier"), T("Théatre"), S("Savoir");
    
    private String nom;

    private GenreLitteraire(String nom) {
        this.nom = nom;
    }
    
    @Override
    public String toString() {
        return nom;
    }

}
