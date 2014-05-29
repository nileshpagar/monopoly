package com.jpmorgan.ib.scpp.lasd;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MonopolyGameTest {

	private static final int NUMBER_OF_ROUNDS = 3;
	private static final int NUMBER_OF_PLAYERS = 2;
	private MonopolyGame monopolyGame;
	
	@Before
	public void setup() {
		monopolyGame=new MonopolyGame(NUMBER_OF_PLAYERS, NUMBER_OF_ROUNDS);
		
	}
	
	@Test
	public void testInit(){
		assertEquals(NUMBER_OF_PLAYERS, monopolyGame.getNumberOfPlayers());
	}
	
	

}
