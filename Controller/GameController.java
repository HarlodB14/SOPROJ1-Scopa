package controller;

import model.Deck;
import model.Game;
import model.GameTable;
import model.Player;

public class GameController {
    private Game game;
    private Deck deck;
    private Player player;
    private HandController handController;
    private GameTableController gameTableController;
    private GameTable gt;

    public GameController(GameTable gameTable, HandController handcontroller, GameTableController gametablecontroller){
        handController = handcontroller;
        gameTableController = gametablecontroller;
        gt = gameTable;
    }

    public void passHBoxCard(){
        gameTableController.setHBox(handController.getCardHbox());
    }

    public String getCardFromGameTable(int pos){
        return gt.returnCard(pos).getCardInfo();
    }
}
