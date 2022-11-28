package model;

public class Game {
    //instance variables
    private int gameID;
    private String gameState;
    private String dateOfCreation;
    private Player[] players;
    private Player gameLeader;
    private GameTable gt = new GameTable();
    private Deck deck = new Deck();


    //constructor
    public Game(int gameID, Player gameLeader) {
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

    public void play(Player player1, Player player2){
      while(checkForWinner() == false) {
          deck.createDeck();
          gt.createGameTable(deck);
          deck.printDeck();
//        player.giveCardsToPlayer(player, deck);
          for (int i = 0; i<6; i++){
              player1.giveCardsToPlayer(player1, deck);
              player2.giveCardsToPlayer(player2, deck);
              for (int j = 0; j < 3; j++) {
                  player1.playerMove(player1.getSelectedCard());
                  player1.updateUncalculatedScores();
                  player2.playerMove(player2.getSelectedCard());
                  player2.updateUnCalculatedScores();
              }
          }
          player1.updateScore();
          player2.updateScroe();
          checkForWinner();
      }
    }

    private boolean checkForWinner() {
    }

}
