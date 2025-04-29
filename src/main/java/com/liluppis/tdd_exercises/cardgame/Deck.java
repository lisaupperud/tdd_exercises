package com.liluppis.tdd_exercises.cardgame;

import com.liluppis.tdd_exercises.cardgame.model.Card;
import com.liluppis.tdd_exercises.cardgame.model.suits.Clover;
import com.liluppis.tdd_exercises.cardgame.model.suits.Diamond;
import com.liluppis.tdd_exercises.cardgame.model.suits.Heart;
import com.liluppis.tdd_exercises.cardgame.model.suits.Spade;

import java.util.ArrayList;
import java.util.List;

public class Deck {
    Heart heart = new Heart();
    Clover clover = new Clover();
    Diamond diamond = new Diamond();
    Spade spade = new Spade();



    List<List<Card>> deck = new ArrayList<>();

    void addToDeck() {
        deck.add(heart.heartList);
        deck.add(clover.cloverList);
        deck.add(diamond.diamondList);
        deck.add(spade.spadeList);
    }

    void printDeck() {
        System.out.println(deck);
    }

    void test() {
        heart.addCard();
        clover.addCard();
        diamond.addCard();
        spade.addCard();
    }





}
