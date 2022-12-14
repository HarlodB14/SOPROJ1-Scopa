package model;

import java.util.Arrays;
import java.util.List;

public class Card {
    //instance variables
    private int cardID;
    private int value;
    private String suit;

    //constructor
    public Card(int cardID, int value, String suit) {
        this.cardID = cardID;
        this.value = value;
        this.suit = suit;
    }

    //getters/setters
    public int getCardID() {
        return cardID;
    }

    public int getValue() {
        return value;
    }

    public String getSuit() {
        return suit;
    }

    public String getCardInfo(){
        return getValue() + " " + getSuit();
    }

    public void printCard() {
        System.out.println(this.cardID + "," + "Value: " + this.value + "," + this.suit);
    }
}


