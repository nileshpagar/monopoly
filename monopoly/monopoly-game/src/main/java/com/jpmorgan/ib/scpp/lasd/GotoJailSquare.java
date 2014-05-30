package com.jpmorgan.ib.scpp.lasd;

public class GotoJailSquare implements Square {

	private int currentPosition;
	
	public GotoJailSquare(int currentPosition) {
		this.currentPosition = currentPosition;
	}
	
	@Override
	public void landsOn(Player player) {
		player.setCurrentSquare(new GotoJailSquare(10));
	}

	@Override
	public int getCurrentPosition() {
		return currentPosition;
	}

}
