package agedepierre.joueur;

import agedepierre.plateau.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class JoueurTest {

    ArrayList<Zone> listeUneZone ;
    ArrayList<Zone> listeZones ;
    Zone zoneDeLOracle;
    Réponse oracleTous, oracleAucun;
    Joueur j;
	Inventaire inventaire ;

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

        oracleTous = new Réponse(zoneDeLOracle,5);
        // oracleAucun = new Réponse(zoneDeLOracle,0);
		inventaire = new Inventaire();
    }

    /**
     * on prend le premier 
	 * @TODO à compléter
     */
	@Test
    void placeOuvrier() {
        assertEquals(oracleTous, j.placeOuvrier(listeUneZone, inventaire));
        // assertEquals(oracleAucun, j.placeOuvrier(listeZones, inventaire));
    }

    @Test
    void reprendreOuvrier() {
        assertEquals(zoneDeLOracle, j.reprendreOuvrier(listeUneZone));
        assertEquals(zoneDeLOracle, j.reprendreOuvrier(listeZones));

    }
}