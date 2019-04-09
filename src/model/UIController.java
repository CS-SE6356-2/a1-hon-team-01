package model;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class UIController extends Application{
    @Override
    public void start(Stage primaryStage) throws Exception {
        BorderPane root = new BorderPane();
        Scene scene = new Scene(root, 1280, 720);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String args[]){
        launch(args);
    }

	/*public abstract void handleUIObject(Component c);
	public abstract void handleCardClick(Card card);
	public abstract void drawCard(Point p, Card card);
	public abstract void drawGameState(Game g, Player currentPlayer);
	public abstract void drawComponent(Component c, Function clickHandler);*/
}
