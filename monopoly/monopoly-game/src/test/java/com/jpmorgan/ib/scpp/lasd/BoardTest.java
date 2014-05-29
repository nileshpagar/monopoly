package com.jpmorgan.ib.scpp.lasd;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BoardTest {

	Board testObj; 
	
	@Before
	public void setup(){
		testObj = new Board(40); 
	}
	
	@Test
	public void initialize() {
		assertEquals(40, testObj.squares.length);
	}
	
	@Test
	public void calculateNextSquare_WhenDieRolled(){
		Square currentSquare = new Square(1);
		int diceTotal = 2;
		assertEquals(3, testObj.calculateNextSquare(diceTotal, currentSquare).getCurrentPosition() );
	}
	
	

}
