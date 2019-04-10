import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import model.Card;
import model.SampleUIController;
import model.UIController;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Main extends Application {
    UIController gui;

    @Override
    public void start(Stage primaryStage) throws Exception {
        gui = new SampleUIController();
        Group root = new Group();
        Text text = new Text();
        text.setFont(new Font(45));
        text.setX(200);
        text.setY(100);
        text.setText("Card Game Project Title");
        root.getChildren().add(text);
        Scene scene = new Scene(root, 1280, 720);
        scene.setFill(Color.NAVY);
        primaryStage.setTitle("Card Game Project");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String args[]){
        launch(args);
    }

    public void drawCard(Card c, boolean visible, double posx, double posy) throws FileNotFoundException {
        Image image = new Image(new FileInputStream("NO"));
    }
}
