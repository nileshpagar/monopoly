package com.jpmorgan.ib.scpp.lasd;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class GotoJailSquareTest {

	Player player;
	
	@Before
	public void setup() {
		player = new Player("playerId");
	}
	
	@Test
	public void landsOn_() {
		GotoJailSquare square = new GotoJailSquare(9);
		square.landsOn(player);
		assertEquals(SquareNumber.JAIL.position, player.currentSquare.getPosition());
		assertEquals(GotoJailSquare.class, player.currentSquare.getClass());
	}

}
