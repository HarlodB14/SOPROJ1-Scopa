package View;

import controller.GameController;
import controller.HandController;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import model.Game;

public class GameScene extends Scene {

    private BorderPane rootPane;
    private  GamePane gamePane;
    private GameController gameController;
    private HandController handController;

    public GameScene(GameController gameController, HandController handController){
        super(new Pane());
        this.gameController = gameController;
        this.handController = handController;
        rootPane = new BorderPane();
        gamePane = new GamePane(gameController,handController);
        gamePane.setPrefSize(1000,900);
        rootPane.setCenter(gamePane);
        setRoot(rootPane);
    }

}
