package model;

import java.util.ArrayList;

public class Game {
    //instance variables
    private int gameID;
    private String gameState;
    private String dateOfCreation;
    private ArrayList<Player> players;
    private GameTable gameTable;
    private Deck deck;
    private final int MAXPLAYERHANDLENGTH = 3;


    //constructor
    public Game(int gameID) {
        this.gameID = gameID;
        players = new ArrayList<Player>();
        players.add(new Player(1, "Harlod", "Ham", MAXPLAYERHANDLENGTH));
        players.add(new Player(2, "Marijn", "Kaas", MAXPLAYERHANDLENGTH));
        gameTable = new GameTable();
        deck = new Deck();
    }


    //getters/setters
    public int getGameID() {
        return gameID;
    }

    public void setGameID(int gameID) {
        this.gameID = gameID;
    }

    public String getGameState() {
        return gameState;
    }

    public void setGameState(String gameState) {
        this.gameState = gameState;
    }

    public String getDateOfCreation() {
        return dateOfCreation;
    }

    public void setDateOfCreation(String dateOfCreation) {
        this.dateOfCreation = dateOfCreation;
    }


    public void play() {
        int i = 0;
        boolean running = true;
        while(running) {
//            Player playerToDistribute = players.get(i);
            distributeCards();

        }
    }

    public void distributeCards(){
        for (int i=0; i < MAXPLAYERHANDLENGTH; i++){
            for(Player player : players){
                Card topCard = deck.getTopCardFromDeck();
                player.addCardToPlayerHand(topCard);
            }
        }
        for (int y = 0; y < 4; y++) {
            gameTable.addCardToGameTable(deck.getTopCardFromDeck());
        }
        for(Player player: players){
            for (int i = 0; i < MAXPLAYERHANDLENGTH; i++) {
                System.out.println(player.getUserName() + ": " + player.getPlayerHandCardString(i));
            }
        }
//        gameTable.printGameTable();
    }
}
