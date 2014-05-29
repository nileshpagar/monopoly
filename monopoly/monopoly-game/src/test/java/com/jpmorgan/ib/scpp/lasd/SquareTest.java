package com.jpmorgan.ib.scpp.lasd;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;


public class SquareTest {

	private static final int ARBITRARY_SQUARE_POSITION = 1;
	Square testObj; 
	
	@Before
	public void setup(){
		testObj = new Square(ARBITRARY_SQUARE_POSITION); 
	}
	
	@Test
	public void initialize() {
		assertEquals(ARBITRARY_SQUARE_POSITION, testObj.getCurrentPosition());
	}

}
