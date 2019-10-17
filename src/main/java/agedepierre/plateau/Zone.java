package agedepierre.plateau;

public class Zone {

	private int nbOuvriersPlacés = 0;
	
    public void placerOuvrier(Inventaire inventaireDuJoueur, int nbOuvriers) {
        inventaireDuJoueur.retirerOuvrierDispo(nbOuvriers);
		nbOuvriersPlacés = nbOuvriers;
    }

    public void resoudre(Inventaire inventaireDuJoueur) {
        inventaireDuJoueur.setNbRessource(inventaireDuJoueur.getNbRessource()+nbOuvriersPlacés);
		nbOuvriersPlacés = 0;
    }
}
