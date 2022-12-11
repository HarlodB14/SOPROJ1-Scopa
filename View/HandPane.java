package View;

import Controller.HandController;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
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
    private Text cardInfo1;
    private Text cardInfo2;
    private Text cardInfo3;
    private String cardText1;
    private Message message;

    private Deck deck;
    private Player player1;
   // private HandPane handPane;

    public HandPane(HandController handController) {
        this.handController = handController;
//        deck = new Deck();
//        deck.createDeck();
       // handPane = new HandPane(this);

//        player1 = new Player(1, "Harlod", "ewa");
//        player1.giveCardsToPlayer(player1, deck);
//        System.out.println("playerhand: ");.

//        cardInfo1 = new Text(handController.getCard1());
//        cardInfo2 = new Text(handController.getCard2());
//        cardInfo3 = new Text(handController.getCard3());
        createHandView();

    }

    public void createHandView() {
        card1 = new HBox();
        card1.setPrefSize(200, 250);
        card1.setBackground(new Background(new BackgroundFill(Color.SANDYBROWN, null, null)));
        card1.getChildren().add(cardInfo1);

        card2 = new HBox();
        card2.setPrefSize(200, 250);
        card2.setBackground(new Background(new BackgroundFill(Color.SANDYBROWN, null, null)));
       card2.getChildren().add(cardInfo2);

        card3 = new HBox();
        card3.setPrefSize(200, 250);
        card3.setBackground(new Background(new BackgroundFill(Color.SANDYBROWN, null, null)));
        card3.getChildren().add(cardInfo3);
        tabelView.getChildren().addAll(card1, card2, card3);
        tabelView.setSpacing(20);
        tabelView.setAlignment(Pos.CENTER);
        this.getChildren().add(tabelView);
        this.setAlignment(Pos.CENTER);
    }

//    public void setCardProperty(Message message) {
//        cardInfo1.textProperty().bind(message.messagetextProperty());
////        cardInfo2.textProperty().bind(message.messagetextProperty());
////        cardInfo3.textProperty().bind(message.messagetextProperty());
//    }




}
