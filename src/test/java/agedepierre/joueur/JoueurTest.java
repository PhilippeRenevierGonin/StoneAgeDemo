package agedepierre.joueur;

import agedepierre.plateau.Zone;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class JoueurTest {

    ArrayList<Zone> listeUneZone ;
    ArrayList<Zone> listeZones ;
    Zone zoneDeLOracle;
    Réponse oracle;
    Joueur j;

    @BeforeEach
    void setUp() {
        listeUneZone = new ArrayList<>();
        listeZones = new ArrayList<>();
        zoneDeLOracle = new Zone();
        listeUneZone.add(zoneDeLOracle);
        listeZones.add(zoneDeLOracle);
        for(int k = 0; k < 5; k++) {
            listeZones.add(new Zone());
        }
        j = new Joueur();

        oracle = new Réponse(zoneDeLOracle,1);
    }

    /**
     * on prend le premier
     */
    @Test
    void placeOuvrier() {
        assertEquals(oracle, j.placeOuvrier(listeUneZone, null));
        assertEquals(oracle, j.placeOuvrier(listeZones, null));
        assertEquals(null, j.placeOuvrier(null, null));
    }

    @Test
    void reprendreOuvrier() {
        assertEquals(zoneDeLOracle, j.reprendreOuvrier(listeUneZone));
        assertEquals(zoneDeLOracle, j.reprendreOuvrier(listeZones));

    }
}