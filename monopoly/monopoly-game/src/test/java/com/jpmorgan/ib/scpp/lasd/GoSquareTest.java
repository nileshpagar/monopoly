package com.jpmorgan.ib.scpp.lasd;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GoSquareTest {

    @Test
    public void landOn_whenPlayerOnGoSquare_getCash(){
        GoSquare testObject = new GoSquare();

        assertEquals(GoSquare.GO_SQUARE_POSITION,testObject.getCurrentPosition());
        Player player = new Player("ARBITRARY_PLAYER_ID");
        int currentCash = player.getCash();
        testObject.landsOn(player);
        int cashOnGoSquare = 200;
        assertEquals(currentCash + cashOnGoSquare, player.getCash());

    }



}
