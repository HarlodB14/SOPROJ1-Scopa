package model;

import View.GameScene;
import controller.GameController;
import controller.HandController;
import javafx.application.Application;
import javafx.stage.Stage;
import model.Card;

public class Main extends Application{

    private Game game = new Game(0);
    private GameController  gameController = new GameController(game.getGameTable());
    private HandController handController = new HandController(game.getPlayer(0));

    public static void main(String[] args) {
        launch(args);

    }



    @Override
    public void start(Stage stage) throws Exception {
        GameScene gameScene = new GameScene(gameController, handController);
        stage.setScene(gameScene);
        stage.show();

    }
}
