package Controller;

import View.HandPane;
import model.Deck;
import model.Message;
import model.Player;

public class HandController {
    private Message message;
    private HandPane handPane;
    private Player player;

    public HandController(Deck deck, Player player1) {
        handPane = new HandPane(this);
        player = player1;

    }



    public String getPlayerHandCard(int location, Player player1){
        return player1.getPlayerHandCardString(location);
    }





}



