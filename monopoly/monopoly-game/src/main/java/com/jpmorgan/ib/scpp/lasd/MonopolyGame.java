package com.jpmorgan.ib.scpp.lasd;

import java.util.ArrayList;
import java.util.List;

public class MonopolyGame {

    private static final int DEFAULT_NUMBER_OF_SQUARES = 40;
	int numberOfRounds; 
	List<Player> players;
	Board board;
	int roundsCompleted;
	int currentRound;
	private Die die1;
	private Die die2;
	boolean isGameOver = false;
	
	public void playGame(Integer numberOfPlayers, Integer numberOfRounds) {
		this.numberOfRounds = numberOfRounds;
		this.board = new Board(DEFAULT_NUMBER_OF_SQUARES);
		this.die1 = new Die();
		this.die2 = new Die();
		this.roundsCompleted = 0;
		this.currentRound = 0;
		players = createPlayers(numberOfPlayers);
		playRound();
	}
	
	private List<Player> createPlayers(Integer numberOfPlayers) {
		List<Player> players = new ArrayList<Player>();
		for (int i = 0; i < numberOfPlayers; i++) {
			Player player = new Player(String.valueOf(i));
			player.setBoard(board);
			player.setDie1(die1);
			player.setDie2(die2);
			players.add(player);
		}
		return players;
	}
	
	private void playRound() {
		for (int i = 0; i < numberOfRounds; i++) {
			currentRound++;
			for (int j = 0; j < players.size(); j++) {
				players.get(j).takeTurn();
			}
			roundsCompleted++;
		}
		isGameOver = true;
	}
		
}
