package com.company;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class BenutzerTest
{

    @Test
    void kalkuliereZeit()
    {
        Benutzer Test_benutzer = new Benutzer();
        Mannschaft basket = new Basketball();
        Mannschaft fusbal = new Fussball();
        ArrayList<Sport> lieblingsport = new ArrayList<Sport>();
        lieblingsport.add(basket);
        lieblingsport.add(fusbal);
        lieblingsport.add(basket);
        lieblingsport.add(fusbal);
        Test_benutzer.setSports(lieblingsport);
        assertEquals(Test_benutzer.kalkuliereZeit(),240);
    }

    @Test
    void kalkuliereDurchschnittszeit()
    {
        Benutzer Test_benutzer = new Benutzer();
        Mannschaft basket = new Basketball();
        Mannschaft fusbal = new Fussball();
        ArrayList<Sport> lieblingsport = new ArrayList<Sport>();
        lieblingsport.add(basket);
        lieblingsport.add(fusbal);
        lieblingsport.add(basket);
        lieblingsport.add(fusbal);
        Test_benutzer.setSports(lieblingsport);
        assertEquals(Test_benutzer.kalkuliereDurchschnittszeit(),60);
    }

    @Test
    void kalkuliereZeitt()
    {
        Benutzer Test_benutzer = new Benutzer();
        Mannschaft basket = new Basketball();
        Mannschaft fusbal = new Fussball();
        ArrayList<Sport> lieblingsport = new ArrayList<Sport>();
        lieblingsport.add(basket);
        lieblingsport.add(fusbal);
        lieblingsport.add(basket);
        lieblingsport.add(fusbal);
        Test_benutzer.setSports(lieblingsport);
        assertEquals(Test_benutzer.kalkuliereZeit(basket),55);
    }
}