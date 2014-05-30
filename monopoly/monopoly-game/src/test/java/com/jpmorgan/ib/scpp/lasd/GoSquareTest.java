package com.jpmorgan.ib.scpp.lasd;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GoSquareTest {

    GoSquare testObject;

    @Before
    public void setUp(){
        testObject = new GoSquare();
    }
    @Test
    public void initialize(){

        assertEquals(GoSquare.SQUARE_POSITION, testObject.getPosition());
    }

    @Test
    public void landOn_whenPlayerOnGoSquare_getCash(){

        Player player = new Player("ARBITRARY_PLAYER_ID");
        player.setCurrentSquare(new DoNothingSquare(0));
        int currentCash = player.getCurrentCash();
        Square currentSquare = player.currentSquare;
        testObject.landsOn(player);

        assertEquals(currentCash + GoSquare.CASH_ON_SQUARE, player.getCurrentCash());
        assertEquals(currentSquare.getPosition() + GoSquare.SQUARE_POSITION, player.getCurrentSquare().getPosition());

    }



}
