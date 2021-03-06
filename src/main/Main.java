package main;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import model.Card;
import model.SampleUIController;
import model.StandardCard;
import model.UIController;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class Main extends Application {
    private UIController gui;
    public static Group root;

    @Override
    public void start(Stage primaryStage) throws Exception {
        root = new Group();
        Scene scene = new Scene(root, 1280, 720);
        scene.setFill(Color.NAVY);
        primaryStage.setTitle("Card Game Project");
        primaryStage.setScene(scene);
        primaryStage.show();

        //GUI Testing
        gui = new SampleUIController();
        gui.drawText(StandardCard.ALL_CARDS.get(0).toString(), 100, 100);
        gui.drawCard(StandardCard.ALL_CARDS.get(0), false, 350, 315);
        gui.drawCard(StandardCard.ALL_CARDS.get(0), true, 300, 300);
        gui.drawDeck(StandardCard.ALL_CARDS, false, 500, 300);
    }

    public static void main(String args[]){
        launch(args);
    }
}
