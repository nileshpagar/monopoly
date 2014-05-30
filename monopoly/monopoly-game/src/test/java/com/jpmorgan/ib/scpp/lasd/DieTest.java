package com.jpmorgan.ib.scpp.lasd;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class DieTest {
    private Die testObj;

    @Test
    public void initialize(){
        assertTrue(testObj.getFaceValue()>= Die.MIN_FACEVALUE);
        assertTrue(testObj.getFaceValue()<= Die.MAX_FACEVALUE);
    }



    @Before
    public void setUp() {
        testObj =  new Die();
    }

    @Test
    public void roll_whenTypical(){
        int totalRollCount = 600000;
        int[] totalRolls = new int[Die.MAX_FACEVALUE];
        for (int counter = 0; counter < totalRollCount; counter++) {
            testObj.roll();
            totalRolls[testObj.getFaceValue()-1] =  totalRolls[testObj.getFaceValue()-1] +1;
        }
        double delta = 0.01;
        for (int counter = 0; counter < Die.MAX_FACEVALUE; counter++) {
            assertEquals(totalRollCount/Die.MAX_FACEVALUE,
                    totalRolls[counter],totalRollCount/Die.MAX_FACEVALUE*delta);
        }
    }

}
