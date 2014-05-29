package com.jpmorgan.ib.scpp.lasd;

public class Board {

	static final int TOTAL_SQUARES = 40;
	Square squares[] = new Square[TOTAL_SQUARES];
	
	public Board() {
		for(int i = 0; i < squares.length; ++i) {
			squares[i] = new Square(i+1);
		}
	}
	
	public Square calculateNextSquare(int diceTotal, Square currentSquare) {
		return squares[ ( currentSquare.getCurrentPosition() + diceTotal - 1) % TOTAL_SQUARES ];
	}

}
