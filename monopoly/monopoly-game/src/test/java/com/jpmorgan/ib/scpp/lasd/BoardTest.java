package com.jpmorgan.ib.scpp.lasd;

import static org.junit.Assert.*;

import org.junit.Assert;
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
		for(int i = 0; i < testObj.squares.length; ++i) {
			Square square = testObj.squares[i];
			switch(i+1) {
			case 0:
				Assert.assertEquals(GoSquare.class, square.getClass() );
				break;
			case 5:
				Assert.assertEquals(GoSquare.class, square.getClass() );
				break;
			case 10:
				Assert.assertEquals(JailSquare.class, square.getClass() );
				break;
			case 30:
				Assert.assertEquals(GotoJailSquare.class, square.getClass() );
				break;
			default:
				Assert.assertEquals(DoNothingSquare.class, square.getClass() );	
				break;
			}
		}
	}
	
	@Test
	public void calculateNextSquare_WhenDieRolled(){
		int currentSquarePosition = 1;
		DoNothingSquare currentDoNothingSquare = new DoNothingSquare(currentSquarePosition);
		int diceTotal = 2;
		
		int nextSquarePosition = testObj.calculateNextSquare(diceTotal, currentDoNothingSquare).getPosition();
		
		assertEquals(currentSquarePosition + diceTotal,
						nextSquarePosition );
	}
	
	@Test
    public void calculateNextSquare_WhenStepOverflows_ShouldGoBackToBeginning(){
        int currentSquarePosition = 37;
        int diceTotal = 5;

        DoNothingSquare currentDoNothingSquare = new DoNothingSquare(currentSquarePosition);

        int nextSquarePosition = testObj.calculateNextSquare(diceTotal, currentDoNothingSquare).getPosition();

        assertEquals((currentSquarePosition + diceTotal) % TOTAL_SQUARES,
                nextSquarePosition );
    }

}
