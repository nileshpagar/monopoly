package com.jpmorgan.ib.scpp.lasd;

public class GoSquare implements Square {


    public static final int GO_SQUARE_POSITION =1;

    public static final int CASH_ON_SQUARE = 200;

    @Override
    public void landsOn(Player player) {
        player.currentCash += CASH_ON_SQUARE;
        player.setCurrentSquare(this);
    }

    @Override
    public int getPosition() {
        return GO_SQUARE_POSITION;
    }
}
