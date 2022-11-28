package View;

import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;

public class GameScene extends Scene {

    private BorderPane rootPane;
    private  GamePane gamePane;

    public GameScene(){
        super(new Pane());
        rootPane = new BorderPane();
        gamePane = new GamePane();
        gamePane.setPrefSize(1000,900);
        rootPane.setCenter(gamePane);
        setRoot(rootPane);
    }

}
