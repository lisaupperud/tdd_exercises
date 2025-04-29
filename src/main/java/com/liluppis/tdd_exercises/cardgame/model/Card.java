package com.liluppis.tdd_exercises.cardgame.model;

import com.liluppis.tdd_exercises.cardgame.model.suits.ISuit;

public class Card {
    private String suit;
    private int value;

    public Card(String suit, int value) {
        this.suit = suit;
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Card " +
                "suit: " + suit +
                ", value: " + value + "\n";
    }
}
