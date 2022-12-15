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

    private HBox tableView = new HBox();
    private HBox card1;
    private HBox card2;
    private HBox card3;
    private HandController handController;
    private Label cardInfo1;
    private Label cardInfo2;
    private Label cardInfo3;


    public HandPane(HandController handController) {
        this.handController = handController;
        createHandView();

    }

    public Label createCardInfo(int pos){
        return new Label(handController.getCardInfoFromHand(pos));
    }

    public void createHandView() {
        card1 = new HBox();
        card1.setPrefSize(100, 150);
        card1.setBackground(new Background(new BackgroundFill(Color.SANDYBROWN, null, null)));
        card1.getChildren().add(createCardInfo(0));
        card1.setOnMouseClicked(e -> doOnClicked(0, card1));

        card2 = new HBox();
        card2.setPrefSize(100, 150);
        card2.setBackground(new Background(new BackgroundFill(Color.SANDYBROWN, null, null)));
        card2.getChildren().add(createCardInfo(1));
        card1.setOnMouseClicked(e -> doOnClicked(1, card2));

        card3 = new HBox();
        card3.setPrefSize(100, 150);
        card3.setBackground(new Background(new BackgroundFill(Color.SANDYBROWN, null, null)));
        card3.getChildren().add(createCardInfo(2));
        card1.setOnMouseClicked(e -> doOnClicked(2, card3));

        tableView.getChildren().addAll(card1, card2, card3);
        tableView.setSpacing(20);
        tableView.setAlignment(Pos.CENTER);
        this.getChildren().add(tableView);
        this.setAlignment(Pos.CENTER);
    }

    public void doOnClicked(int i, HBox Card){
        handController.layCard(handController.getCardFromHand(i));
        tableView.getChildren().remove(Card);
        handController.setCardHBox(Card);
    }
}
