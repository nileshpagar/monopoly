package com.jpmorgan.ib.scpp.lasd;

import java.util.ArrayList;
import java.util.List;

public class MonopolyGame {

    int numberOfRounds; 
	List<Player> players;
	
	public void playGame(Integer numberOfPlayers, Integer numberOfRounds) {
		players = createPlayers(numberOfPlayers);
		this.numberOfRounds = numberOfRounds;
	}
	
	private List<Player> createPlayers(Integer numberOfPlayers) {
		List<Player> players = new ArrayList<Player>();
		for (int i = 0; i < numberOfPlayers; i++) {
			players.add(new Player(String.valueOf(i)));
		}
		return players;
	}
	
	public List<Player> getPlayers() {
		return players;
	}
	
}
