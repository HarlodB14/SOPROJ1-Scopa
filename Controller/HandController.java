package controller;

import View.HandPane;
import javafx.beans.property.SimpleObjectProperty;
import javafx.scene.layout.HBox;
import model.Card;
import model.Message;
import model.Player;

public class HandController {
    private Message message;
    private HandPane handPane;
    private Player player;
    private GameController gameController;
    private HBox card;


    public HandController(Player player1) {
        card = new HBox();
        player = player1;

    }

  public String getCardInfoFromHand(int pos){
        return player.getPlayerCard(pos).getCardInfo();
//        return deck.getTopCardFromDeck().getCardInfo();
  }
  public Card getCardFromHand(int pos){
        return player.getPlayerCard(pos);
  }

  public void layCard(Card card){
        Card selectedCard = player.getPlayerCard(0);
        player.removeCard(selectedCard);
  }

  public void setCardHBox(HBox Card){
        card = Card;
  }
  
  public HBox getCardHbox(){
        return this.card;
  }





    public String getPlayerHandCard(int location, Player player1){
        return player1.getPlayerHandCardString(location);
    }





}



