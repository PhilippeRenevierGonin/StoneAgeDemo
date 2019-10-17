package agedepierre.plateau;

public class Inventaire {

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
        setNbOuvrier(1);
        setNbRessource(0);
    }

    public Inventaire(Inventaire àCopié) {
        setNbOuvrier(àCopié.getNbOuvrier());
        setNbRessource(àCopié.getNbRessource());
    }

    public void resetOuvriersDispo() {
        nbDispo = getNbOuvrier();
    }

    public boolean ouvrierDispo() {
        return nbDispo > 0;
    }

    public void retirerOuvrierDispo(int i) {
        nbDispo = nbDispo - i;
    }
}
