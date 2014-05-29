package com.jpmorgan.ib.scpp.lasd;

import junit.framework.TestCase;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class PlayerTest{


    @Test
    public void initialize(){
        Player player = new Player("playerId");
        assertEquals("playerId",player.getId());
    }

}
