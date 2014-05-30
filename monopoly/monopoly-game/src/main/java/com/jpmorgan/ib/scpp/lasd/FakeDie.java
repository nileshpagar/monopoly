package com.jpmorgan.ib.scpp.lasd;

public class FakeDie extends Die {
	
	int fakeFaceValue;
	public FakeDie(int fakeFaceValue) {
		this.fakeFaceValue = fakeFaceValue;
	}
	
	@Override
	public int getFaceValue() {
		return fakeFaceValue;
	}
	
}
