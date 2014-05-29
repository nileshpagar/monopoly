package com.jpmorgan.ib.scpp.lasd;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by selvakumaresra on 5/29/14.
 */
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

}
