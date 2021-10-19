package com.company;

import java.util.ArrayList;

class Benutzer
{
    public String vorName;
    public String nachName;
    public ArrayList<Sport> sports;

    public ArrayList<Sport> getSports()
    {
        return sports;
    }

    public void setSports(ArrayList<Sport> sports)
    {
        this.sports = sports;
    }

    public void setNachName(String nachName)
    {
        this.nachName = nachName;
    }

    public void setVorName(String vorName)
    {
        this.vorName = vorName;
    }

    public String getVorName()
    {
        return this.vorName;
    }

    public String getNachName()
    {
        return this.nachName;
    }

    public double kalkuliereZeit()
    {
        double s = 0;
        for (Sport i : this.sports)
        {
            s = s + i.kalkuliereZeit();
        }
        return s;
    }

    public double kalkuliereDurchschnittszeit()
    {
        return kalkuliereZeit() / this.sports.size();
    }

    public double kalkuliereZeit(Sport sport)
    {
        double artzeit = 0;
        for (Sport i : this.sports)
        {
            if (sport.kalkuliereZeit() == i.kalkuliereZeit())
                artzeit += i.kalkuliereZeit();
        }
        return artzeit;
    }
}
