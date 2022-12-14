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

    private ArrayList<Card> playerHand;


    //constructor
    public Player(int playerid, String userName, String password, int playerHandSize) {
        this.playerid = playerid;
        this.userName = userName;
        this.password = password;
        playerHand = new ArrayList<Card>();
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

    //Selects card and adds it on the table
    public void playerMove(Player player, int CardLocation, GameTable gt) {
        Card selectedCard = playerHand.get(CardLocation);
        playerHand.set(CardLocation, null);
        gt.addCardToGameTable(selectedCard);
        System.out.println("GameTable:");
        gt.printGameTable();
        System.out.println("PlayerHand");
        player.printPlayerHand();


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
        return playerHand.get(location);
    }

    public void removeCard(Card card) {
        playerHand.remove(card);
    }

    public String getPlayerHandCardString(int location) {
        return playerHand.get(location).getValue() + " " + playerHand.get(location).getSuit();
    }


    public void addCardToPlayerHand(Card card) {
        playerHand.add(card);
    }


    public int getNumberOfPoints() {
        return NumberOfPoints;
    }


}
