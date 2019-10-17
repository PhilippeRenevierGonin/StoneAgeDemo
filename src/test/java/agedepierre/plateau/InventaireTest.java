package agedepierre.plateau;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InventaireTest {

    Inventaire ref ;
    @BeforeEach
    void setUp() {
        ref = new Inventaire();
    }

    @Test public void TestConstructeurVide() {
        assertEquals(0, ref.getNbRessource());
        assertEquals(1, ref.getNbOuvrier());
    }

    @Test public void TestConstructeurClone() {
        ref.setNbOuvrier(5);
        ref.setNbRessource(2);

        Inventaire clone = new Inventaire(ref);

        assertEquals(2, clone.getNbRessource());
        assertEquals(5, clone.getNbOuvrier());

        ref.setNbRessource(20);
        assertEquals(2, clone.getNbRessource());

        clone.setNbRessource(10);
        assertEquals(20, ref.getNbRessource());


    }
}