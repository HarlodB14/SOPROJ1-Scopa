package model;

import model.Card;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private ArrayList<Card> playdeck;

    public Deck() {
        playdeck = new ArrayList<>();
        createDeck();
//         printDeck();
    }



    public void createDeck() {
        int k = 0;
        String[] suits = new String[4];
        suits[0] = "Coin";
        suits[1] = "Club";
        suits[2] = "Sword";
        suits[3] = "Goblet";
        for (String suit : suits) {
            for (int j = 0; j < 10; j++) {
                playdeck.add(new Card(k, j + 1, suit));
                k++;
            }
        }
        Collections.shuffle(playdeck);
        for (Card deck : playdeck) {
            deck.printCard();
        }
    }

    public Card getTopCardFromDeck() {
        Card topCard = playdeck.get(0);
        playdeck.remove(0);
        return topCard;
    }

    public void printDeck() {
        for (Card deck : playdeck) {
            deck.printCard();
        }
    }


}