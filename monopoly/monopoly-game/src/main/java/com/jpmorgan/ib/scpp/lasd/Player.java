package com.jpmorgan.ib.scpp.lasd;


public class Player {
    private String id;

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

    }
}
