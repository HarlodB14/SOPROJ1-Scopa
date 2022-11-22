package model;

import model.Card;

import java.util.ArrayList;

public class Deck {
    private ArrayList<Card> deck;

    public Deck(){
        deck = new ArrayList<>();
        createDeck();
    }

    public void createDeck() {
        int k = 0;
        String[] suits= new String[4];
        suits[0] = "Coin";
        suits[1] = "Club";
        suits[2] = "Sword";
        suits[3] = "Goblet";
        for (String suit : suits) {
            for (int j = 0; j < 10; j++) {
                deck.add(new Card(k, j + 1, suit));
                deck.get(k).printCard();
                k++;
            }
        }
    }


}