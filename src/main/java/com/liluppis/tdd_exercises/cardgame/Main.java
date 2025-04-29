package com.liluppis.tdd_exercises.cardgame;

import com.liluppis.tdd_exercises.cardgame.model.Card;
import com.liluppis.tdd_exercises.cardgame.model.suits.Heart;

public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck();

        // to print the entire deck
        deck.test();
        deck.addToDeck();
        deck.printDeck();
    }

}
