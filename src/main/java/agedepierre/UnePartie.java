package agedepierre;

import agedepierre.joueur.Joueur;
import agedepierre.joueur.Réponse;
import agedepierre.plateau.Inventaire;
import agedepierre.plateau.Zone;
import java.util.ArrayList;

public class UnePartie {


    private final Inventaire inventaireDuJoueur;
    private final Joueur joueur;
    private final Zone zone;

    public static final void main(String [] args) {
        UnePartie p = new UnePartie();
        p.jouer();
    }

    public UnePartie() {
        joueur = new Joueur();
        inventaireDuJoueur = new Inventaire();
        zone = new Zone();

    }

    protected void jouer() {
        ArrayList<Zone> listeZonesDispo = new ArrayList<>();
        ArrayList<Zone> listeZonesJouées = new ArrayList<>();

        // on remplit les zones dispo
        listeZonesDispo.add(zone);

        // reset des ouvriers dispo
        inventaireDuJoueur.resetOuvriersDispo() ;

        System.out.println("**** phase de placement ****");
        phasePlacement(listeZonesDispo, listeZonesJouées);

        System.out.println("**** phase de résolution des ouvriers ****");
        phaseAction(listeZonesJouées);

        System.out.println("**** fin du jeu ****");
        System.out.println("Le joueur gagne avec "+inventaireDuJoueur.getNbRessource()+ " ressource(s).");



    }

    protected void phaseAction(ArrayList<Zone> listeZonesJouées) {
        // on fait reprendre
        while (listeZonesJouées.size() > 0 )
        {
            Zone choix = joueur.reprendreOuvrier(listeZonesJouées);
            listeZonesJouées.remove(choix);
            choix.resoudre(inventaireDuJoueur);

            System.out.println("Le joueur a reprend un ouvrier de la zone "+choix);

        }
    }


    protected void phasePlacement(ArrayList<Zone> listeZonesDispo, ArrayList<Zone> listeZonesJouées) {
        // on fait placer
        while (inventaireDuJoueur.ouvrierDispo() ) {
            Inventaire inventaireTemp = new Inventaire(inventaireDuJoueur);
            Réponse choix = joueur.placeOuvrier(listeZonesDispo, inventaireTemp);
            // @todo tester le nombre d'ouvrier
            listeZonesDispo.remove(choix.zone);
            listeZonesJouées.add(choix.zone);
            choix.zone.placerOuvrier(inventaireDuJoueur, 1);

            System.out.println("Le joueur a choisi la zone "+choix.zone+" pour y placer "+choix.nbOuvriers+" ouvrier(s)");

        }
    }
}
