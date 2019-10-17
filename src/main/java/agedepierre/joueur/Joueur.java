package agedepierre.joueur;

import agedepierre.plateau.Inventaire;
import agedepierre.plateau.Zone;

import java.util.ArrayList;

public class Joueur {
    public Réponse placeOuvrier(ArrayList<Zone> listeZonesDispo, Inventaire inventaireTemp) {
        if ((listeZonesDispo != null) && (listeZonesDispo.size() > 0))
            return new Réponse(listeZonesDispo.get(0), inventaireTemp.getNbOuvrierDispo());
        else return null;
    }

    public Zone reprendreOuvrier(ArrayList<Zone> listeZonesJouées) {
        return listeZonesJouées.get(0);
    }
}
