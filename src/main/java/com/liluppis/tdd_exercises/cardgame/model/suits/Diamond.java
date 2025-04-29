package com.liluppis.tdd_exercises.cardgame.model.suits;

import com.liluppis.tdd_exercises.cardgame.model.Card;

import java.util.ArrayList;
import java.util.List;

public class Diamond implements ISuit {

    public List<Card> diamondList = new ArrayList<Card>();

    @Override
    public void addCard() {
        for (int i = 1; i <= 13; i++) {
            Card diamondCard = new Card("diamond", i);
            diamondList.add(diamondCard);
        }

    }

    @Override
    public void printSuitList() {
        System.out.println(diamondList);
    }
}
