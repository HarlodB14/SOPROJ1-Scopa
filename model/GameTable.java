package model;

import java.util.ArrayList;

public class GameTable {
    private ArrayList<Card> gameTable = new ArrayList<>();
    private Deck deck = new Deck();

    public GameTable(){
        gameTable = new ArrayList<>();
    }

    public void createGameTable(){
        for(int i = 0; i < 4; i++ ){
            gameTable.add(deck.getTopCardFromDeck());
            System.out.println(gameTable.get(i));
        }
    }

    public Card swipeCard(int location){
        Card swipedCard = gameTable.get(location);
        gameTable.remove(location);
        return swipedCard;
    }

//    public void getCardFromGameTable(int location){
//        gameTable[location]
//    }




}
