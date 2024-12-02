package com.edu.chmnu.ki_123.c3;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FootballPlayer {
    private String name;
    private int age;
    private int number;
    private String currentClub;
    private boolean playsForNationalTeam;
    private int goalsScored;

    public FootballPlayer(String name, int age, int number, String currentClub, boolean playsForNationalTeam, int goalsScored) {
        this.name = name;
        this.age = age;
        this.number = number;
        this.currentClub = currentClub;
        this.playsForNationalTeam = playsForNationalTeam;
        this.goalsScored = goalsScored;
    }

    public void displayPlayerInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Number: " + number);
        System.out.println("Current Club: " + currentClub);
        System.out.println("Plays for National Team: " + (playsForNationalTeam ? "Yes" : "No"));
        System.out.println("Goals Scored: " + goalsScored);
    }
}