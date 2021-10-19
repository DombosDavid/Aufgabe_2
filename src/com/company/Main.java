package com.company;

import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        Benutzer Schuller = new Benutzer();

        Mannschaft basket = new Basketball();
        Mannschaft fusbal = new Fussball();
        Leichtathletik hindernislauf = new Hindernislauf();
        Leichtathletik hochsprung = new Hochsprung();

        ArrayList<Sport> lieblingsport = new ArrayList<Sport>();
        lieblingsport.add(basket);
        lieblingsport.add(fusbal);
        lieblingsport.add(hindernislauf);
        lieblingsport.add(hochsprung);
        Schuller.setSports(lieblingsport);
        Schuller.setNachName("David");
        Schuller.setVorName("Dombos");
        System.out.println(Schuller.nachName + " " + Schuller.vorName + " braucht: " + Schuller.kalkuliereZeit() + " Zeit fur seine Lieblingsporte");
        System.out.println(Schuller.nachName + " " + Schuller.vorName + " braucht Durchschnittlich: " + Schuller.kalkuliereDurchschnittszeit() + " Zeit fur seine Lieblingsporte");
        System.out.println(Schuller.nachName + " " + Schuller.vorName + " braucht: " + Schuller.kalkuliereZeit(basket) + " Zeit fur Basketball");
    }

}

