package com.jpmorgan.ib.scpp.lasd;

public class Board {

    DoNothingSquare doNothingSquares[];

	public Board(int numberOfSquares) {
		doNothingSquares = new DoNothingSquare[numberOfSquares];
		for(int i = 0; i < doNothingSquares.length; ++i) {
			doNothingSquares[i] = new DoNothingSquare(i+1);
		}
	}
	
	public DoNothingSquare calculateNextSquare(int diceTotal, DoNothingSquare currentDoNothingSquare) {
		return doNothingSquares[ ( currentDoNothingSquare.getCurrentPosition() + diceTotal - 1) % doNothingSquares.length ];
	}


}
