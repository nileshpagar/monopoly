package com.jpmorgan.ib.scpp.lasd;

public enum SquareNumber {

	JAIL(10),
	GOTO_JAIL(30),
	INCOME_TAX(4),
	GO(0);
	
	public final int position;
	
	SquareNumber(int position){
		this.position = position;
	}
	
}
