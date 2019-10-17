package agedepierre.plateau;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ZoneTest {
    Inventaire inventaire ;
    Zone zone;

    @BeforeEach void setUp() {
        zone = new Zone();
        inventaire = new Inventaire();
        inventaire.resetOuvriersDispo();
    }

    @Test
    void placerUnOuvrier() {
		for(int i = 1; i < Inventaire.NB_INITIAL_OUVRIERS; i++) {
			zone.placerOuvrier(inventaire, 1);
			assertTrue(inventaire.ouvrierDispo());
		}
		zone.placerOuvrier(inventaire, 1);
		assertFalse(inventaire.ouvrierDispo());
    }


}