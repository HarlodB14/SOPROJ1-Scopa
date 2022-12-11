package View;

import Controller.GameController;
import Controller.HandController;
import javafx.geometry.Pos;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;


public class GamePane extends BorderPane {

    private HBox scoreTable;
    private HBox cardTableView;
    private HandPane handPane;
    private HandController handController;
    private Text cardInfo1;
    private Text cardInfo2;
    private Text cardInfo3;

    public GamePane(GameController gameController) {
        this.handController = handController;
        scoreTable = new HBox();
        createScoreTable();
        cardTableView = new HBox();
//        cardInfo1 = new Text(handController.getCard1());
//        cardInfo2 = new Text(handController.getCard2());
//        cardInfo3 = new Text(handController.getCard3());
        sethandView();
        createGameTableView();
        this.setBackground(new Background(new BackgroundFill(Color.BEIGE, null, null)));
        setAlignment(scoreTable, Pos.CENTER);
    }

    public void createScoreTable() {
        Text carta = new Text("Carta: 0");
        Text denari = new Text("Denari: 0");
        Text settebello = new Text("settebello: 0");
        Text primiera = new Text("Primiera: 0");
        Text scopa = new Text("Scopa: 0");
        scoreTable.getChildren().addAll(carta, denari, settebello, primiera, scopa);
        scoreTable.setSpacing(20);
        scoreTable.setAlignment(Pos.CENTER);
        scoreTable.setPrefHeight(150);
        this.setTop(scoreTable);
    }

    public void createGameTableView() {
        Rectangle gameCard1 = new Rectangle(200, 250);
        Rectangle gameCard2 = new Rectangle(200, 250);
        Rectangle gameCard3 = new Rectangle(200, 250);
        Rectangle gameCard4 = new Rectangle(200, 250);

        gameCard1.setFill(Color.SANDYBROWN);
        gameCard2.setFill(Color.SANDYBROWN);
        gameCard3.setFill(Color.SANDYBROWN);
        gameCard4.setFill(Color.SANDYBROWN);
        cardTableView.getChildren().addAll(gameCard1, gameCard2, gameCard3, gameCard4);
        cardTableView.setSpacing(20);
        cardTableView.setAlignment(Pos.CENTER);
        cardTableView.setPrefHeight(150);
        this.setCenter(cardTableView);
    }

    public void sethandView(){
        handPane = new HandPane(handController);
        this.setBottom(handPane);
    }


}
