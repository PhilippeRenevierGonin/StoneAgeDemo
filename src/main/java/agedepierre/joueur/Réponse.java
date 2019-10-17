package agedepierre.joueur;

import agedepierre.plateau.Zone;

public class Réponse {

    public Zone zone;
    public int nbOuvriers ;

    public Réponse(Zone zone, int nbOuvriers) {
        this.zone = zone;
        this.nbOuvriers = nbOuvriers;
    }

    public boolean equals(Object o) {
        if (o instanceof Réponse) {
            Réponse r = (Réponse) o;
            return (r.nbOuvriers == nbOuvriers) && (r.zone == zone);
        }
        else return false;
    }
}
