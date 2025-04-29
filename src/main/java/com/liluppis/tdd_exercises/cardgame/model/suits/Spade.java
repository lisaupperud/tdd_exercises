package com.liluppis.tdd_exercises.cardgame.model.suits;

import com.liluppis.tdd_exercises.cardgame.model.Card;

import java.util.ArrayList;
import java.util.List;

public class Spade implements ISuit {

    public List<Card> spadeList = new ArrayList<Card>();

    @Override
    public void addCard() {
        for (int i = 1; i <= 13; i++) {
            Card spadeCard = new Card("spade", i);
            spadeList.add(spadeCard);
        }
    }

    @Override
    public void printSuitList() {
        System.out.println(spadeList);
    }
}
