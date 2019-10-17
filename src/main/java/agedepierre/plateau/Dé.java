package agedepierre.plateau;

import java.util.Random;

public class Dé {

    private Random dé = new Random();


    public int lancer() {
        return dé.nextInt(6)+1;
    }
}
