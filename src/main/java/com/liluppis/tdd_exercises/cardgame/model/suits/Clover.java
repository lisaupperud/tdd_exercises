package com.liluppis.tdd_exercises.cardgame.model.suits;

import com.liluppis.tdd_exercises.cardgame.model.Card;

import java.util.ArrayList;
import java.util.List;

public class Clover implements ISuit {

    public List<Card> cloverList = new ArrayList<Card>();

    @Override
    public void addCard() {
        for (int i = 1; i <= 13; i++) {
            Card cloverCard = new Card("clover", i);
            cloverList.add(cloverCard);
        }
    }

    @Override
    public void printSuitList() {
        System.out.println(cloverList);
    }
}
