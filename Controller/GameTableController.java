package controller;

import javafx.scene.layout.HBox;
import model.GameTable;

public class GameTableController {
    private HBox card;
    private GameTable gameTable;

    public GameTableController(GameTable gameTable1){
        gameTable = gameTable1;
    }

    public GameTableController(){
    card = new HBox();
    }
    public void setHBox(HBox Card){
       card = Card;
    }

    public HBox getHBox(){
        return card;
    }

    public String getCardInfoFromGameTable(int pos){
        return gameTable.returnCard(pos).getCardInfo();
    }


}
