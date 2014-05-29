package com.jpmorgan.ib.scpp.lasd;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

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

    @Test
    public void takeTurn_changesCurrentSquare(){
        
    }
}
