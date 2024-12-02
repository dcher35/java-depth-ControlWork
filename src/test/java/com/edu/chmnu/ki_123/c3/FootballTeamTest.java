package com.edu.chmnu.ki_123.c3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FootballTeamTest {
    @Test
    public void testPlayerCreation() {
        FootballPlayer player1 = new FootballPlayer("Lionel Messi", 30, 10, "Miami", true, 754);

        assertEquals("Lionel Messi", player1.getName());
        assertEquals(30, player1.getAge());
        assertEquals(10, player1.getNumber());
        assertEquals("Miami", player1.getCurrentClub());
        assertTrue(player1.isPlaysForNationalTeam());
        assertEquals(754, player1.getGoalsScored());
    }

    @Test
    public void testSetters() {
        FootballPlayer player2 = new FootballPlayer("Cristiano Ronaldo", 35, 7, "RM", true, 846);

        player2.setGoalsScored(846);
        player2.setCurrentClub("RM");

        assertEquals(846, player2.getGoalsScored());
        assertEquals("RM", player2.getCurrentClub());
    }
}