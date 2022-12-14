package View;

import controller.HandController;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import model.Deck;
import model.Message;
import model.Player;


public class HandPane extends HBox {

    private HBox tabelView = new HBox();
    private HBox card1;
    private HBox card2;
    private HBox card3;
    private HandController handController;
    private Label cardInfo1;
    private Label cardInfo2;
    private Label cardInfo3;


    public HandPane(HandController handController) {
        cardInfo1 = new Label(handController.getCardInfoFromHand(0));
        cardInfo2 = new Label(handController.getCardInfoFromHand(1));
        cardInfo3 = new Label(handController.getCardInfoFromHand(2));
        this.handController = handController;
        createHandView();

    }

    public void createHandView() {
        card1 = new HBox();
        card1.setPrefSize(200, 250);
        card1.setBackground(new Background(new BackgroundFill(Color.SANDYBROWN, null, null)));
        card1.getChildren().add(cardInfo1);
        card1.setOnMouseClicked(e -> removeCard(0));

        card2 = new HBox();
        card2.setPrefSize(200, 250);
        card2.setBackground(new Background(new BackgroundFill(Color.SANDYBROWN, null, null)));
        card2.getChildren().add(cardInfo2);
        card2.setOnMouseClicked(e -> removeCard(1));

        card3 = new HBox();
        card3.setPrefSize(200, 250);
        card3.setBackground(new Background(new BackgroundFill(Color.SANDYBROWN, null, null)));
        card3.getChildren().add(cardInfo3);
        card3.setOnMouseClicked(e -> removeCard(2));

        tabelView.getChildren().addAll(card1, card2, card3);
        tabelView.setSpacing(20);
        tabelView.setAlignment(Pos.CENTER);
        this.getChildren().add(tabelView);
        this.setAlignment(Pos.CENTER);
    }

    public void removeCard(int i){
        handController.layCard(i);
        System.out.println("removed" + handController.getCardInfoFromHand(i));
    }

}
