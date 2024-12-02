package com.edu.chmnu.ki_123.c3;

public class FootballTeam {
    public static void main(String[] args) {
        FootballPlayer player1 = new FootballPlayer("Lionel Messi", 30, 10, "Miami", true, 754);
        FootballPlayer player2 = new FootballPlayer("Cristiano Ronaldo", 35, 7, "RM", true, 846);
        FootballPlayer player3 = new FootballPlayer("Mbappe", 21, 7, "PSG", false, 445);

        System.out.println("Player 1:");
        player1.displayPlayerInfo();
        System.out.println();

        System.out.println("Player 2:");
        player2.displayPlayerInfo();
        System.out.println();

        System.out.println("Player 3:");
        player3.displayPlayerInfo();
        System.out.println();

        player2.setAge(23);
        player2.setCurrentClub("Barcelona");
        player2.setGoalsScored(642);
        System.out.println("Updated Player 2:");
        player2.displayPlayerInfo();
    }
}