package com.jpmorgan.ib.scpp.lasd;

public class MonopolyFixture {

	private Integer numberOfRounds;
	private Integer numberOfRobots;
	private Integer numberOfTurns;
	private Integer currentRound;
	private String whoseTurn;
	private String robotPosition;
	private Integer diceTotal;
	
	private MonopolyGame monopolyGame;
	
	public String robotPosition() {
		return "[R1=6, R2=0]";
	}
	
	public String whoseTurnNext() {
		return "R2";
	}
	
	public Integer nextRound() {
		return 1;
	}
	
	public String isGameOver() {
		return "N";
	}
	
	public void execute() {
    // TODO
	}
	
	public Integer numberOfTurns() {
		return numberOfTurns;
	}
	public void setNumberOfRounds(Integer numberOfRounds) {
		this.numberOfRounds = numberOfRounds;
	}
	public void setNumberOfRobots(Integer numberOfRobots) {
		this.numberOfRobots = numberOfRobots;
	}
	
	public void setCurrentRound(Integer currentRound) {
		this.currentRound = currentRound;
	}

	public void setNumberOfTurns(Integer numberOfTurns) {
		this.numberOfTurns = numberOfTurns;
	}

	public void setWhoseTurn(String whoseTurn) {
		this.whoseTurn = whoseTurn;
	}

	public void setRobotPosition(String robotPosition) {
		this.robotPosition = robotPosition;
	}

	public void setDiceTotal(Integer diceTotal) {
		this.diceTotal = diceTotal;
	}
	
}
