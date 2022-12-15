package model;

import View.GameScene;
import controller.GameController;
import controller.GameTableController;
import controller.HandController;
import javafx.application.Application;
import javafx.stage.Stage;
import model.Card;

public class Main extends Application{

    private Game game = new Game(0);
    private HandController handController = new HandController(game.getPlayer(0));
    private GameTableController gameTableController = new GameTableController(game.getGameTable());
    private GameController  gameController = new GameController(game.getGameTable(), handController, gameTableController);

    public static void main(String[] args) {
        launch(args);

    }



    @Override
    public void start(Stage stage) throws Exception {
        GameScene gameScene = new GameScene(gameController, handController, gameTableController);
        stage.setScene(gameScene);
        stage.show();

    }
}
