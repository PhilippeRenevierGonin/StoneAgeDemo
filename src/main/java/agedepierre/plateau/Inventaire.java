package agedepierre.plateau;

// résolution du conflit, ici en gardant les deux commentaires
// un autre commentaire pour faire un conflit
// un commentaire pour faire un conflit
public class Inventaire {
	public static final int NB_INITIAL_OUVRIERS = 5;
    private int niveauAgriculture;

    public int getNbOuvrier() {
        return nbOuvrier;
    }

	/**
	 * Pour modifier le nombre d'ouvrier d'un joueur à travers son inventaire
	 * @param nbOuvrier le nouveau nombre d'ouvriers associés à cet inventaire
	 */
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
        setNiveauAgriculture(0);
    }

    public void resetOuvriersDispo() {
        nbDispo = getNbOuvrier();
    }

    public boolean ouvrierDispo() {
        return (nbDispo > 0);
    }
	
	public int getNbOuvrierDispo() {
        return nbDispo;
    }

    public void retirerOuvrierDispo(int i) {
        nbDispo = nbDispo - i;
    }

    public void ajouterOuvrierDispo(int nbOuvriersRetirés) {
        nbDispo = nbDispo + nbOuvriersRetirés;
    }

    public void setNiveauAgriculture(int niveauAgriculture) {
        this.niveauAgriculture = niveauAgriculture;
    }

    public int getNiveauAgriculture() {
        return niveauAgriculture;
    }
}
