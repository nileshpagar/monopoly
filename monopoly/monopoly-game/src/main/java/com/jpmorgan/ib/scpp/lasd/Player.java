package com.jpmorgan.ib.scpp.lasd;

public class Player {
	
    private String id;
    Die die1;
    Die die2;
    Board board;
    Square currentSquare;
	int numberOfTurnsTaken;
    int currentCash;

    public Player(String playerId) {
        this.id = playerId;
    }

    public String getId() {
        return id;
    }

    public Square getCurrentSquare() {
        return currentSquare;
    }

    public void setCurrentSquare(Square currentSquare) {
        this.currentSquare = currentSquare;
    }

    public void setCurrentCash(int currentCash) {
        this.currentCash = currentCash;
    }

    public void takeTurn() {
        die1.roll();
        die2.roll();
        int diceTotal = calculateDiceTotal(die1.getFaceValue(),die2.getFaceValue());
        currentSquare = board.calculateNextSquare(diceTotal, currentSquare);
        numberOfTurnsTaken++;
    }

    private int calculateDiceTotal(int faceValueOfDie1, int faceValueOfDie2) {
        return faceValueOfDie1+faceValueOfDie2;
    }

    public void setDie1(Die die) {
        this.die1 = die;
    }

    public void setDie2(Die die) {
        this.die2 = die;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public int getCurrentCash() {
        return currentCash;
    }
}
