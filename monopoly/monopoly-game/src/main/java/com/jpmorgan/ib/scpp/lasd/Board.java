package com.jpmorgan.ib.scpp.lasd;

public class Board {

    int numberOfSquares;

    public Board(int numberOfSquares) {
        this.numberOfSquares = numberOfSquares;
    }

    public int calculateNextSquare(int diceTotal, int currentSquare) {
        return diceTotal + currentSquare;
    }
}
