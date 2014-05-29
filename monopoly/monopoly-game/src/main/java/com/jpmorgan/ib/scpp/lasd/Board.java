package com.jpmorgan.ib.scpp.lasd;

public class Board {

    Square squares[];

	public Board(int numberOfSquares) {
		squares = new Square[numberOfSquares];
		for(int i = 0; i < squares.length; ++i) {
			squares[i] = new Square(i+1);
		}
	}
	
	public Square calculateNextSquare(int diceTotal, Square currentSquare) {
		return squares[ ( currentSquare.getCurrentPosition() + diceTotal - 1) % squares.length ];
	}


}
