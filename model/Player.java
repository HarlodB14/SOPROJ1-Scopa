package model;

import model.Card;

import java.util.ArrayList;

public class Player {

    //instance variables
    private int playerid;
    private String userName;
    private String password;
    private int team;
    private String playStatus;
    private int scopas;
    private int sequenceNumber;

    private int NumberOfPoints;
    private ArrayList<Card> swipedCards = new ArrayList<>();

    private Card[] playerHand;



    //constructor
    public Player(int playerid, String userName, String password) {
        this.playerid = playerid;
        this.userName = userName;
        this.password = password;
        Card[] playerHand = new Card[3];
    }

    //getters/setters
    public int getPlayerid() {
        return playerid;
    }

    public void setPlayerid(int playerid) {
        this.playerid = playerid;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getTeam() {
        return team;
    }

    public String getPlayStatus() {
        return playStatus;
    }

    public int getScopas() {
        return scopas;
    }

    public int getSequenceNumber() {
        return sequenceNumber;
    }

    public ArrayList<Card> getSwipedCards() {
        return swipedCards;
    }

    public void addToSwipedCards(Player player, int location, Deck deck, GameTable gt){
        swipedCards.add(gt.swipeCard(location, deck));

    }

    public void giveCardsToPlayer(Player player, Deck deck){
        System.out.println("layer (" + player.getUserName() + "'s) hand:");
        for (int i = 0; i < playerHand.length; i++){
            playerHand[i] = deck.getTopCardFromDeck();
            playerHand[i].printCard();
        }

    }

    //Selects card and adds it on the table
    public void playerMove(Card card){

    }
    //checks move and decide whether it has a duplicate value on the board already, if so, the cards get added to the swiped cards, otherwise the card gets added to the table
    public void checkPlayerMove(){

    }

    public Card getSelectedCard() {
        Card selectedCard = null;
        return selectedCard;
    }

    public int getNumberOfPoints() {
        return NumberOfPoints;
    }
}
