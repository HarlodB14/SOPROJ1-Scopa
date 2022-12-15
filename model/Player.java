package model;

import model.Card;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Player {


    private int playerid;
    private String userName;
    private String password;
    private int team;
    private String playStatus;
    private int scopas;
    private int sequenceNumber;
    private final int MAXPLAYERHANDLENGTH = 3;


    private int NumberOfPoints;
    private ArrayList<Card> swipedCards = new ArrayList<>();

    private Card[] playerHand;


    //constructor
    public Player(int playerid, String userName, String password) {
        this.playerid = playerid;
        this.userName = userName;
        this.password = password;
        playerHand = new Card[MAXPLAYERHANDLENGTH];
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

    public void addToSwipedCards(Player player, int location, Deck deck, GameTable gt) {
        swipedCards.add(gt.swipeCard(location, deck));

    }


    //checks move and decide whether it has a duplicate value on the board already, if so, the cards get added to the swiped cards, otherwise the card gets added to the table
//    public void checkPlayerMove() {
//
//    }
    public void printPlayerHand() {
        for (Card cards : playerHand) {
            if (cards != null) {
                cards.printCard();
            }
        }
    }

    public Card getPlayerCard(int location) {
        return playerHand[location];
    }

    public void removeCard(Card card) {
        for (int i = 0; i < playerHand.length; i++) {
            if(playerHand[i] == card){
                playerHand[i] = null;
        }
            
        }
                
    }

    public String getPlayerHandCardString(int location) {
        return playerHand[location].getValue() + " " + playerHand[location].getSuit();
    }


    public void addCardToPlayerHand(Card card) {
        for (int i = 0; i < playerHand.length; i++) {
            if(playerHand[i] == null){
                playerHand[i] = card;
                return;
            }

        }
    }


    public int getNumberOfPoints() {
        return NumberOfPoints;
    }


}
