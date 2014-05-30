package com.jpmorgan.ib.scpp.lasd;

import java.util.ArrayList;
import java.util.List;

public class MonopolyGame {

    private static final int DEFAULT_NUMBER_OF_SQUARES = 40;
	int numberOfRounds; 
	List<Player> players;
	boolean isGameOver = false;
	
	public void playGame(Integer numberOfPlayers, Integer numberOfRounds) {
		this.numberOfRounds = numberOfRounds;
		players = createPlayers(numberOfPlayers);
		playRound();
	}
	
	private List<Player> createPlayers(Integer numberOfPlayers) {
		List<Player> players = new ArrayList<Player>();
		for (int i = 0; i < numberOfPlayers; i++) {
			Player player = new Player("Player" + String.valueOf(i));
			player.setBoard(new Board(DEFAULT_NUMBER_OF_SQUARES));
			player.setDie1(new Die());
			player.setDie2(new Die());
			players.add(player);
		}
		return players;
	}
	
	private void playRound() {
		for (int i = 0; i < numberOfRounds; i++) {
			for (int j = 0; j < players.size(); j++) {
				players.get(j).takeTurn();
			}
		}
		isGameOver = true;
	}
		
}
