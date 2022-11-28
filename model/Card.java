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

    public void setCardID(int cardID) {
        this.cardID = cardID;
    }


    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public void printCard() {
        System.out.println(this.cardID + "," + "Value: " + this.value + "," + this.suit);
    }
}

//    public static List<String> getValidSuits(){
//        return Arrays.asList{"Sword", "Coin"};
//    }
//}
