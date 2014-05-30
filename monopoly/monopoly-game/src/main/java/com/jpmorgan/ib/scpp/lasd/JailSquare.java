package com.jpmorgan.ib.scpp.lasd;

public class JailSquare implements Square {

	private int currentPosition;
	
	public JailSquare(int currentPosition) {
		this.currentPosition = currentPosition;
	}
	
	@Override
	public void landsOn(Player player) {
		player.setCurrentSquare(new JailSquare(SquareNumber.JAIL.position));
	}

	@Override
	public int getPosition() {
		return currentPosition;
	}

}
