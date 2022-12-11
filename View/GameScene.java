package View;

import Controller.GameController;
import Controller.HandController;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;

public class GameScene extends Scene {

    private BorderPane rootPane;
    private  GamePane gamePane;
    private GameController gameController;

    public GameScene(){
        super(new Pane());
        rootPane = new BorderPane();
        gameController = new GameController();
        gamePane = new GamePane(gameController);
        gamePane.setPrefSize(1000,900);
        rootPane.setCenter(gamePane);
        setRoot(rootPane);
    }

}
