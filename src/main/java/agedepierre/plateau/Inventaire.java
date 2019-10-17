package agedepierre.plateau;

public class Inventaire {
	public static final int NB_INITIAL_OUVRIERS = 5;

    public int getNbOuvrier() {
        return nbOuvrier;
    }

    public void setNbOuvrier(int nbOuvrier) {
        this.nbOuvrier = nbOuvrier;
    }

    public int getNbRessource() {
        return nbRessource;
    }

    public void setNbRessource(int nbRessource) {
        this.nbRessource = nbRessource;
    }

    private int nbOuvrier = 1;
    private int nbRessource = 0;
    private int nbDispo = 0;

    public Inventaire() {
        setNbOuvrier(NB_INITIAL_OUVRIERS);
        setNbRessource(0);
		resetOuvriersDispo();
    }

    public Inventaire(Inventaire àCopié) {
        setNbOuvrier(àCopié.getNbOuvrier());
        setNbRessource(àCopié.getNbRessource());
		resetOuvriersDispo();
    }

    public void resetOuvriersDispo() {
        nbDispo = getNbOuvrier();
    }

    public boolean ouvrierDispo() {
		System.out.println("nbDispo = "+nbDispo);
        return (nbDispo > 0);
    }
	
	public int getNbOuvrierDispo() {
        return nbDispo;
    }

    public void retirerOuvrierDispo(int i) {
        nbDispo = nbDispo - i;
    }
}
