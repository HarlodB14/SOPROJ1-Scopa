package View;

import controller.GameTableController;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;

public class GameTablePane extends HBox {
    private HBox cardTableView;
    private int gameCardAmount = 13;
    private GameTableController gtc;


    public GameTablePane(GameTableController gametablecontroller) {
        gtc = gametablecontroller;
        cardTableView = new HBox();
        createGameCards();
    }

    private void createGameCards() {
        for (int i = 0; i < gameCardAmount; i++) {
            HBox card = new HBox();
            Label cardLabel = new Label();
            card.setPrefSize(100, 150);
            card.getChildren().add(cardLabel);
            card.setPrefSize(100,150);
            card.setBackground(new Background(new BackgroundFill(Color.SANDYBROWN, null, null)));
            cardTableView.getChildren().add(card);
            cardTableView.setAlignment(Pos.CENTER);
        }
        cardTableView.getChildren().add(gtc.getHBox());
    }



}
