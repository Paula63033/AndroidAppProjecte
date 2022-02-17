package com.example.myapplication.models;

public class Card {
    private char [] letter = {'A','B','C','D', 'E', 'F', 'G', 'H', 'I', 'J','K','L','M','N','Ñ', 'O','P','Q','R','S','T', 'U', 'V', 'W', 'X', 'Y','Z'};

    public Card(char[] letter) {
        this.letter = letter;
    }

    public char[] getLetter() {
        return letter;
    }

    public void setLetter(char[] letter) {
        this.letter = letter;
    }
}
