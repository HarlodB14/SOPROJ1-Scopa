package model;

import model.Card;

public class Main {

    public static void main(String[] args) {
        Deck deck = new Deck();
        GameTable gt = new GameTable();
        deck.createDeck();
        System.out.print("The gametable is:");
        gt.createGameTable();
    }


}
