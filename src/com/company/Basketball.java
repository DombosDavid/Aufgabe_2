package com.company;

/*
    @return basketzeit
 */
class Basketball extends Mannschaft
{
    final int basketzeit = 55;

    @Override
    public double kalkuliereZeit()
    {
        return basketzeit;
    }

}
