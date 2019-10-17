package agedepierre.plateau;

public class Zone {

    public void placerOuvrier(Inventaire inventaireDuJoueur, int nbOuvriers) {
        inventaireDuJoueur.retirerOuvrierDispo(1);
    }

    public void resoudre(Inventaire inventaireDuJoueur) {
        inventaireDuJoueur.setNbRessource(inventaireDuJoueur.getNbRessource()+1);
    }
}
