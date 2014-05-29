package com.jpmorgan.ib.scpp.lasd;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class PlayerTest{

    private static final String ARBITRARY_PLAYER_ID = "arbitraryPlayerId";
	private Player testObj;

	@Before
    public void setUp() {
        testObj =  new Player("playerId");
        testObj.setDie1(new Die());
        testObj.setDie2(new Die());
    }
    
	@Test
    public void initialize(){
        assertEquals(ARBITRARY_PLAYER_ID, testObj.getId());
    }

    @Ignore
    public void takeTurn_changesCurrentSquare(){
        int firstPosition = testObj.getCurrentSquare();
        
        testObj.takeTurn();
        
        int nextPosition = testObj.getCurrentSquare();
        assertNotEquals(firstPosition, nextPosition);
    }
}
