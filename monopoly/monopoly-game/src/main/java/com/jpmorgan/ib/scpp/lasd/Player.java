package com.jpmorgan.ib.scpp.lasd;


public class Player {
    private String id;
    private Die die1;
    private Die die2;


    public Player(String playerId) {
        this.id = playerId;
    }

    public String getId() {
        return id;

    }

    public int getCurrentSquare() {
        return 1;
    }

    public void takeTurn() {

        die1.roll();
        die2.roll();
        int totalFaceValue = die1.getFaceValue()+die2.getFaceValue();


    }

    public void setDie1(Die die) {
        this.die1 = die;
    }

    public void setDie2(Die die) {
        this.die2 = die;
    }
}
