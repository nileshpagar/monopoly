package com.jpmorgan.ib.scpp.lasd;

import org.junit.Assert;

public class Board {

    Square squares[];

	public Board(int numberOfSquares) {
		squares = new Square[numberOfSquares];
		createSquares();
	}
	
	private void createSquares() {
		for(int i = 0; i < squares.length; ++i) {
			switch(i+1) {
			case 1:
				squares[i] = new GoSquare();
				break;
			case 5:
				squares[i] = new IncomeTaxSquare();
				break;
			case 11:
				squares[i] = new JailSquare(10);
				break;
			case 31:
				squares[i] = new GotoJailSquare(30);
				break;
			default:
				squares[i] = new DoNothingSquare(i+1);	
				break;
			}
		}
		
	}

	public Square calculateNextSquare(int diceTotal, Square currentSquare) {
		return squares[ ( currentSquare.getPosition() + diceTotal - 1) % squares.length ];
	}


}
