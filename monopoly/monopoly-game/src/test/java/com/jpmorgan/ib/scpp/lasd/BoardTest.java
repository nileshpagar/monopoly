package com.jpmorgan.ib.scpp.lasd;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BoardTest {

	private static final int TOTAL_SQUARES = 40;
	Board testObj; 
	
	@Before
	public void setup(){
		testObj = new Board(TOTAL_SQUARES); 
	}
	
	@Test
	public void initialize() {
		assertEquals(TOTAL_SQUARES, testObj.squares.length);
	}
	
	@Test
	public void calculateNextSquare_WhenDieRolled(){
		int currentSquarePosition = 1;
		Square currentSquare = new Square(currentSquarePosition);
		int diceTotal = 2;
		
		int nextSquarePosition = testObj.calculateNextSquare(diceTotal, currentSquare).getCurrentPosition();
		
		assertEquals(currentSquarePosition + diceTotal, 
						nextSquarePosition );
	}
	
	

}
