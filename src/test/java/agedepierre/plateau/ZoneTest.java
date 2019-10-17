package agedepierre.plateau;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ZoneTest {

    @Mock
    Dé dé;

    Inventaire inventaire ;
    Zone zone;

    @BeforeEach void setUp() {

        zone = new Zone(2, dé);
        inventaire = new Inventaire();
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

    @Test
    void retirerUnOuvrier() {
        when(dé.lancer()).thenReturn(1, 2, 3, 4, 5, 6);

        int oracleNbOuvriers = inventaire.getNbOuvrierDispo();

        for(int i = 1; i <= 6; i++) {
            zone.placerOuvrier(inventaire, 1);
            assertEquals(oracleNbOuvriers-1, inventaire.getNbOuvrierDispo());
            zone.resoudre(inventaire);
            assertEquals(oracleNbOuvriers, inventaire.getNbOuvrierDispo());
            assertEquals(i/2, inventaire.getNbRessource());
            inventaire.setNbRessource(0);
        }


    }


}