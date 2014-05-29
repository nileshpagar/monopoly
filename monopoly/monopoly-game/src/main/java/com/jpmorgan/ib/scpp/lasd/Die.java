package com.jpmorgan.ib.scpp.lasd;

import java.util.Random;

public class Die {


    public static final int MIN_FACEVALUE = 1;
    public static final int MAX_FACEVALUE = 6;
    private Random random = new Random();
    private int faceValue = 1;

    public int getFaceValue() {
        return faceValue;
    }

    public void roll() {
        faceValue = random.nextInt(6)+1;
    }
}
