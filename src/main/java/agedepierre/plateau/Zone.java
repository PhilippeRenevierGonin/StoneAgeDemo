package agedepierre.plateau;

public class Zone {

	private int nbOuvriersPlacés = 0;
	private int niveauZone = 2; // entre 2 et 6
    private Dé dé;

    public Zone(int niveau) {
        this.niveauZone = niveau;
        dé = new Dé();
    }

    public Zone(int niveau, Dé dé) {
        this.niveauZone = niveau;
        this.dé = dé;
    }

    /**
     * Permet de placer nbOuvriers sur cette zone
     * @param inventaireDuJoueur l'inventaire du joueur qui place les ouvriers
     * @param nbOuvriers nombre d'ouvrier placer
     */
    public void placerOuvrier(Inventaire inventaireDuJoueur, int nbOuvriers) {
        inventaireDuJoueur.retirerOuvrierDispo(nbOuvriers);
		nbOuvriersPlacés = nbOuvriers;
    }

    public void resoudre(Inventaire inventaireDuJoueur) {
        int nb_ressources = lancéDeDés(nbOuvriersPlacés);
        inventaireDuJoueur.setNbRessource(inventaireDuJoueur.getNbRessource()+nb_ressources);
        inventaireDuJoueur.ajouterOuvrierDispo(nbOuvriersPlacés);
		nbOuvriersPlacés = 0;
    }

    private int lancéDeDés(int nbOuvriersPlacés) {
        int sommeDés = 0;
        for(int i = 0; i < nbOuvriersPlacés; i++) sommeDés += dé.lancer();

        return sommeDés / niveauZone;
    }
}
