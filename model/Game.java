package model;

public class Game {
    //instance variables
    private int gameID;
    private String gameState;
    private String dateOfCreation;
    private Player[] players;
    private Player gameLeader;

    //constructor
    public Game(int gameID, Player[] players, Player gameLeader) {
        this.gameID = gameID;
        this.players = players;
        this.gameLeader = gameLeader;
        players = new Player[4]; //now empty but will be filled with data from DB
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

    public Player[] getPlayers() {
        return players;
    }

    public void setPlayers(Player[] players) {
        this.players = players;
    }

    public Player getGameLeader() {
        return gameLeader;
    }

    public void setGameLeader(Player gameLeader) {
        this.gameLeader = gameLeader;
    }
}
