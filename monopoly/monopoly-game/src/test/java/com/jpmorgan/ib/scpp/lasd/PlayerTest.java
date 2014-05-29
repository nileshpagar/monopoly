package com.jpmorgan.ib.scpp.lasd;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotSame;
import static org.junit.Assert.assertNotEquals;

public class PlayerTest{

    private Player testObj;

    @Test
    public void initialize(){
        assertEquals("playerId", testObj.getId());
    }

    @Before
    public void setUp() {
        testObj =  new Player("playerId");
    }

    @Ignore
    public void takeTurn_changesCurrentSquare(){
        int firstPosition = testObj.getCurrentSquare();
        testObj.takeTurn();
        int nextPosition = testObj.getCurrentSquare();
        assertNotEquals(firstPosition, nextPosition);
    }
}
