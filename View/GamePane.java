package View;


import controller.GameController;
import controller.GameTableController;
import controller.HandController;
import controller.HandController;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
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
    private GameController gamecontroller;

    private HBox gameCard1;
    private HBox gameCard2;
    private HBox gameCard3;
    private HBox gameCard4;

    private Label cardInfo1;
    private Label cardInfo2;
    private Label cardInfo3;
    private Label cardInfo4;
    private GameTableController gameTableController;

    public GamePane(GameController gameController,HandController handController, GameTableController gtc) {
        gameController = gameController;
        gameTableController = gtc;
        cardInfo1 = new Label(gameController.getCardFromGameTable(0));
        cardInfo2 = new Label(gameController.getCardFromGameTable(1));
        cardInfo3 = new Label(gameController.getCardFromGameTable(2));
        cardInfo4 = new Label(gameController.getCardFromGameTable(3));
        this.handController = handController;
        scoreTable = new HBox();
        createScoreTable();
        cardTableView = new HBox();
        handPane = new HandPane(handController);

        createGameTableView();
        this.setBottom(handPane);
        this.setBackground(new Background(new BackgroundFill(Color.BEIGE, null, null)));
        setAlignment(scoreTable, Pos.CENTER);
    }

    public Label createCardInfo(int pos){
        return new Label(gameTableController.getCardInfoFromGameTable(pos));
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

        gameCard1 = new HBox();
        gameCard1.setPrefSize(100, 125);
        gameCard1.setBackground(new Background(new BackgroundFill(Color.SANDYBROWN, null, null)));
        gameCard1.getChildren().add(createCardInfo(0));

        gameCard2 = new HBox();
        gameCard2.setPrefSize(100, 125);
        gameCard2.setBackground(new Background(new BackgroundFill(Color.SANDYBROWN, null, null)));
        gameCard2.getChildren().add(createCardInfo(1));

        gameCard3 = new HBox();
        gameCard3.setPrefSize(100, 125);
        gameCard3.setBackground(new Background(new BackgroundFill(Color.SANDYBROWN, null, null)));
        gameCard3.getChildren().add(createCardInfo(2));

        gameCard4 = new HBox();
        gameCard4.setPrefSize(100, 125);
        gameCard4.setBackground(new Background(new BackgroundFill(Color.SANDYBROWN, null, null)));
        gameCard4.getChildren().add(createCardInfo(3));



        cardTableView.getChildren().addAll(gameCard1, gameCard2, gameCard3, gameCard4);
        cardTableView.setSpacing(10);
        cardTableView.setAlignment(Pos.CENTER);
        cardTableView.setMaxSize(350,100);
        this.setCenter(cardTableView);
    }



}
