package com.jpmorgan.ib.scpp.lasd;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
<<<<<<< HEAD

=======
>>>>>>> 12cb192af27569e39ad0f58b6f1709b62fe2d8b5

public class MonopolyGameTest {

	private static final int NUMBER_OF_ROUNDS = 3;
	private static final int NUMBER_OF_PLAYERS = 2;
	private MonopolyGame testObject;

	@Before
	public void setup() {
		testObject = new MonopolyGame();
	}

	@Test
	public void playGame() {
		
		testObject.playGame(NUMBER_OF_PLAYERS, NUMBER_OF_ROUNDS);
<<<<<<< HEAD

		assertEquals(NUMBER_OF_PLAYERS, testObject.players.size());
		assertEquals(NUMBER_OF_ROUNDS, testObject.numberOfRounds);
		assertNotNull(testObject.board);
	}
	
	@Test
	public void playGame_whenHaving3Rounds2Players_roundsCompleted() {
		testObject.playGame(NUMBER_OF_PLAYERS, NUMBER_OF_ROUNDS);

		assertEquals(NUMBER_OF_ROUNDS, testObject.roundsCompleted);
	}
	
	@Test
	public void playGame_whenHaving3Rounds2Players_currentRoundIsEqualToNumberOfRoundsAndEveryPlayerHasTakenTurn() {
		testObject.playGame(NUMBER_OF_PLAYERS, NUMBER_OF_ROUNDS);

		assertEquals(NUMBER_OF_ROUNDS, testObject.currentRound);
=======
		
		assertEquals(NUMBER_OF_PLAYERS, testObject.players.size());
		assertEquals(NUMBER_OF_ROUNDS, testObject.numberOfRounds);
		assertNotNull(testObject.players.get(0).board);
		assertNotNull(testObject.players.get(0).die1);
		assertNotNull(testObject.players.get(0).die2);

>>>>>>> 12cb192af27569e39ad0f58b6f1709b62fe2d8b5
		for (Player player : testObject.players) {
			assertEquals(NUMBER_OF_ROUNDS, player.numberOfTurnsTaken);
		}
		
		assertTrue(testObject.isGameOver);
	}
	
<<<<<<< HEAD
	
	@Test
	public void playGame_whenHaving3Rounds2Players_isGameOver() {
		testObject.playGame(NUMBER_OF_PLAYERS, NUMBER_OF_ROUNDS);
		assertTrue(testObject.isGameOver);
	}
}
=======
}
>>>>>>> 12cb192af27569e39ad0f58b6f1709b62fe2d8b5
