package com.jpmorgan.ib.scpp.lasd;

public class MonopolyFixture {

	private Integer numberOfRounds;
	private Integer numberOfRobots;
	private Integer numberOfTurns;
	
	public void execute() {
		numberOfTurns = numberOfRobots * numberOfRounds;
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
	
}
