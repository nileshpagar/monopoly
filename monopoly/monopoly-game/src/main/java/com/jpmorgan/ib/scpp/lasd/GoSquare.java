package com.jpmorgan.ib.scpp.lasd;

public class GoSquare implements Square {


    public static final int SQUARE_POSITION =1;

    public static final int CASH_ON_SQUARE = 200;

    public void landsOn(Player player) {
        player.currentCash += CASH_ON_SQUARE;
        player.setCurrentSquare(this);
    }

    public int getPosition() {
        return SQUARE_POSITION;
    }
}
