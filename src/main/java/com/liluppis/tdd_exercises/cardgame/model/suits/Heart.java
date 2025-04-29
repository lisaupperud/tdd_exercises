package com.liluppis.tdd_exercises.cardgame.model.suits;

import com.liluppis.tdd_exercises.cardgame.model.Card;
import jdk.jfr.Description;

import java.util.ArrayList;
import java.util.List;

public class Heart implements ISuit {

    public List<Card> heartList = new ArrayList<Card>();

    @Override
    public void addCard() {
        for (int i = 1; i <= 13; i++) {
            Card heartCard = new Card("heart", i);
            heartList.add(heartCard);
        }
    }

    @Override
    public void printSuitList() {
        System.out.println(heartList);
    }
}
