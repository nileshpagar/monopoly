package com.jpmorgan.ib.scpp.lasd;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BoardTest {

	Board testObj; 
	
	@Before
	public void setup(){
		testObj = new Board(); 
	}
	
	@Test
	public void initialize() {
		assertEquals(Board.TOTAL_SQUARES, testObj.squares.length);
	}
	
	@Test
	public void calculateNextSquare_WhenTypical(){
		int currentSquarePosition = 1;
		Square currentSquare = new Square(currentSquarePosition);
		int diceTotal = 2;
		
		Square nextSquare = testObj.calculateNextSquare(diceTotal, currentSquare);
		
		assertEquals(3, nextSquare.getCurrentPosition() );
	}
	
	

}
