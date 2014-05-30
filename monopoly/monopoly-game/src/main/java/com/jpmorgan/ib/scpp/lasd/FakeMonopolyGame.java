package com.jpmorgan.ib.scpp.lasd;

import java.util.ArrayList;
import java.util.List;

public class FakeMonopolyGame extends MonopolyGame {

	int faceValue = 0;
	
	@Override
	public void playGame(Integer numberOfPlayers, Integer numberOfRounds) {
		this.numberOfRounds = numberOfRounds;
		players = createPlayers(numberOfPlayers);
		playRound();
	}
	
	private List<Player> createPlayers(Integer numberOfPlayers) {
		List<Player> players = new ArrayList<Player>();
		for (int i = 0; i < numberOfPlayers; i++) {
			Player player = createPlayer("Player" + String.valueOf(i));
			players.add(player);
		}
		return players;
	}

	private Player createPlayer( String playerId ) {
		Player player = new Player(playerId);
		player.setBoard(new Board(DEFAULT_NUMBER_OF_SQUARES));
		player.setDie1(new FakeDie(faceValue));
		player.setDie2(new FakeDie(faceValue));
		return player;
	}
	
}
