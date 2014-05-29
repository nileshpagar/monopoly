package com.jpmorgan.ib.scpp.lasd;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MonopolyGameTest {

	private static final int NUMBER_OF_ROUNDS = 3;
	private static final int NUMBER_OF_PLAYERS = 2;
	private MonopolyGame testObject;

	@Before
	public void setup() {
		testObject = new MonopolyGame();
	}

	@Test
	public void playGame_WhenTypical() {
		testObject.playGame(NUMBER_OF_PLAYERS, NUMBER_OF_ROUNDS);
		assertEquals(NUMBER_OF_PLAYERS, testObject.players.size());
		assertEquals(NUMBER_OF_ROUNDS, testObject.numberOfRounds);
//		assertNotNull(testObject.board);
	}

}
