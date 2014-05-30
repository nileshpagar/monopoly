package com.jpmorgan.ib.scpp.lasd;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GoSquareTest {

    @Test
    public void landOn_whenPlayerOnGoSquare_getCash(){
        GoSquare testObject = new GoSquare();

        assertEquals(GoSquare.GO_SQUARE_POSITION,testObject.getPosition());

        Player player = new Player("ARBITRARY_PLAYER_ID");
        player.setCurrentSquare(new DoNothingSquare(0));
        int currentCash = player.getCurrentCash();
        Square currentSquare = player.currentSquare;
        testObject.landsOn(player);

        assertEquals(currentCash + GoSquare.CASH_ON_SQUARE, player.getCurrentCash());
        assertEquals(currentSquare.getPosition() + GoSquare.GO_SQUARE_POSITION, player.getCurrentSquare().getPosition());

    }



}
