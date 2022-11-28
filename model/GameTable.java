package model;

import java.util.ArrayList;

public class GameTable {
    private ArrayList<Card> gameTable = new ArrayList<>();
    int locationOfDuplicateCard;
    int locationOfSecondDuplicateCard;
    int locationOfThirdDuplicateCard;
//    private Deck deck = new Deck();

    public GameTable(){
        gameTable = new ArrayList<>();
    }

    public void createGameTable(Deck deck){
        System.out.println("Cards on the table are:");
        for(int i = 0; i < 4; i++ ){
            gameTable.add(deck.getTopCardFromDeck());
            gameTable.get(i).printCard();
        }
    }

    public void addCardToGameTable(Card card){
        gameTable.add(card);
    }

    public Card swipeCard(int location, Deck deck){
        Card swipedCard = gameTable.get(location);
        gameTable.remove(location);
        return swipedCard;
    }

    public void CheckGameTable(Card card){
        int location = 0;
        boolean OneDuplicateFound;
        boolean TwoDuplicatesFound;
        for(int i = 0; i < gameTable.size(); i++){
            if (card == gameTable.get(i)){
                locationOfDuplicateCard = i;
                location = i;
                OneDuplicateFound = true;
                break;
            }
            else {
                locationOfDuplicateCard = 20;
                OneDuplicateFound = false;
            }
        }
        if(OneDuplicateFound = true)
            while (location < gameTable.size()) {
                if (card == gameTable.get(location)) {
                    locationOfSecondDuplicateCard = location;
                    TwoDuplicatesFound = true;
                    break;
                }
                else{
                    locationOfSecondDuplicateCard = 20;
                    TwoDuplicatesFound = false;
                }
                location++;
            }
        if (TwoDuplicatesFound = true){
            while (location < gameTable.size()) {
                if (card == gameTable.get(location)) {
                    locationOfThirdDuplicateCard = location;
                    break;
                }
                else{
                    locationOfThirdDuplicateCard = 20;
                }
                location++;
            }
        }
    }

    public void printGameTable(){
        for (Card cards : gameTable){
            cards.printCard();
        }
    }

//    public void getCardFromGameTable(int location){
//        gameTable[location]
//    }




}
