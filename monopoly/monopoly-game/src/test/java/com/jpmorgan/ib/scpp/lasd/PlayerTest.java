package com.jpmorgan.ib.scpp.lasd;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Before;
import org.junit.Test;

public class PlayerTest{

    private Player testObj;
    private int arbituaryNumberOfSquares = 40;
    @Test
    public void initialize(){
        assertEquals("playerId", testObj.getId());
    }

    @Before
    public void setUp() {

        testObj =  new Player("playerId");
        testObj.setDie1(new Die());
        testObj.setDie2(new Die());
        testObj.setBoard(new Board(arbituaryNumberOfSquares));
    }

    @Test
    public void takeTurn_changesCurrentSquare(){
        int firstPosition = testObj.getCurrentSquare().getCurrentPosition();
        testObj.takeTurn();
        int nextPosition = testObj.getCurrentSquare().getCurrentPosition();

        assertNotEquals(firstPosition, nextPosition);
    }


}
