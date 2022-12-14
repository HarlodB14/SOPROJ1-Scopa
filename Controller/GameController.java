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

    public GameController(GameTable gameTable){
        gt = gameTable;
    }

    public String getCardFromGameTable(int pos){
        return gt.returnCard(pos).getCardInfo();
    }
}
