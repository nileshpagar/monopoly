package com.jpmorgan.ib.scpp.lasd;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class BoardTest {

    private Board testObj = null;
    int arbituaryNumberOfSquares = 40;

    @Before
    public void setUp(){
       testObj = new Board(arbituaryNumberOfSquares);
    }

    @Test
    public void initialize() {
        assertEquals(arbituaryNumberOfSquares, testObj.numberOfSquares);
    }

	@Test
	public void calculateNextSquare_WithCurrentSquareAndTotalDiceFaceValue() {
        int diceTotal = 6;
        int currentSquare = 0;
        int nextSquare = testObj.calculateNextSquare(diceTotal,currentSquare);
        assertEquals(diceTotal+currentSquare,nextSquare);
	}

}
