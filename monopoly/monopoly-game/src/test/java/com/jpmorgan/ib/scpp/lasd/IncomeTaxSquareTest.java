package com.jpmorgan.ib.scpp.lasd;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IncomeTaxSquareTest {

    IncomeTaxSquare testObject;

    @Before
    public void setUp(){
        testObject = new IncomeTaxSquare();
    }
    @Test
    public void initialize(){

        assertEquals(IncomeTaxSquare.SQUARE_POSITION, testObject.getPosition());
    }

    @Test
    public void landOn_whenPlayerOnIncomeTaxSquare_getCash(){

        Player player = new Player("ARBITRARY_PLAYER_ID");
        player.setCurrentCash(1500);
        player.setCurrentSquare(new DoNothingSquare(0));
        int currentCash = player.getCurrentCash();
        Square currentSquare = player.currentSquare;
        testObject.landsOn(player);

        int cashAfterTaxDeduct = 1350;
        assertEquals(cashAfterTaxDeduct, player.getCurrentCash());
        assertEquals(IncomeTaxSquare.SQUARE_POSITION, player.getCurrentSquare().getPosition());

    }
}
