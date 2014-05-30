package com.jpmorgan.ib.scpp.lasd;

public class GoSquare implements Square {


    public static final int GO_SQUARE_POSITION =1;

    @Override
    public void landsOn(Player player) {

    }

    @Override
    public int getCurrentPosition() {
        return GO_SQUARE_POSITION;
    }
}
