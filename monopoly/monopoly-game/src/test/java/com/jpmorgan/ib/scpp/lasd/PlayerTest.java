package com.jpmorgan.ib.scpp.lasd;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class PlayerTest{

    private Player testObj;

    @Test
    public void initialize(){
        assertEquals("playerId", testObj.getId());
    }

    @Before
    public void setUp() {
        int arbituaryNumberOfSquares = 40;
        testObj =  new Player("playerId");
        testObj.setDie1(new Die());
        testObj.setDie2(new Die());
        testObj.setBoard(new Board(arbituaryNumberOfSquares));
    }

    @Test
    public void takeTurn_changesCurrentSquare(){
        int firstPosition = testObj.getCurrentSquare();
        testObj.takeTurn();
        int nextPosition = testObj.getCurrentSquare();

        assertNotEquals(firstPosition, nextPosition);
    }
}
