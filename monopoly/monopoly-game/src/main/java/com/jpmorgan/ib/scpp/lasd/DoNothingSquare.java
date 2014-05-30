package com.jpmorgan.ib.scpp.lasd;

public class DoNothingSquare implements Square{
	
	int currentPosition =0;

	public DoNothingSquare(int currentPosition) {
		this.currentPosition = currentPosition;
	}

	public int getPosition() {
		return currentPosition;
	}

    @Override
    public void landsOn(Player player) {

    }
}
