package com.example.myapplication.models;

public class Player {
    private String name;
    private int points;
    private int wins;

    public Player(String name, int points, int wins) {
        this.name = name;
        this.points = points;
        this.wins = wins;
    }

    public String getName() {
        return name;
    }

    //@TODO
    //agafar dades de bbdd de usuaris.

    public void setName(String name) {
        this.name = name;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }
}
