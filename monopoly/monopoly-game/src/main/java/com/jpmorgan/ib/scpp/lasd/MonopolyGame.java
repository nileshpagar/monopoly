package com.jpmorgan.ib.scpp.lasd;

import java.util.List;

public class MonopolyGame {

	private Integer numberOfRobots; 
	private Integer numberOfRounds; 
	
	public MonopolyGame(Integer numberOfRobots, Integer numberOfRounds) {
		this.numberOfRobots = numberOfRobots;
		this.numberOfRounds = numberOfRounds;
	}
	
	public List<Integer> getRobotNextPositions(Integer whoseTurn, List<Integer> currentPositions, Integer diceTotal){
		return null;
	}
	
	public Integer whoseNextTurn(Integer whoseTurn){
		return null;
	}
	
	public Integer isGameOVer(Integer whoseTurn){
		return null;
	}
	
}
