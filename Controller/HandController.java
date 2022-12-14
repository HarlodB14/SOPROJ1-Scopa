package controller;

import View.HandPane;
import model.Card;
import model.Message;
import model.Player;

public class HandController {
    private Message message;
    private HandPane handPane;
    private Player player;
    private GameController gameController;


    public HandController(Player player1) {
        player = player1;

    }

  public String getCardInfoFromHand(int pos){
        return player.getPlayerCard(pos).getCardInfo();
//        return deck.getTopCardFromDeck().getCardInfo();
  }
  public Card getCardFromHand(int pos){
        return player.getPlayerCard(pos);
  }

  public void layCard(int pos){
        Card selectedCard = player.getPlayerCard(0);
        player.removeCard(selectedCard);
  }





    public String getPlayerHandCard(int location, Player player1){
        return player1.getPlayerHandCardString(location);
    }





}



