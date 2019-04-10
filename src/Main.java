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
    Scene scene;
    Group root;

    private final double STD_CARD_WIDTH = 150.0;
    private final double STD_CARD_HEIGHT = 210.0;

    @Override
    public void start(Stage primaryStage) throws Exception {
        gui = new SampleUIController();
        root = new Group();
        Text text = new Text();
        text.setFont(new Font(45));
        text.setX(200);
        text.setY(100);
        text.setText("Card Game Project Title");
        root.getChildren().add(text);
        scene = new Scene(root, 1280, 720);
        scene.setFill(Color.NAVY);
        primaryStage.setTitle("Card Game Project");
        primaryStage.setScene(scene);
        primaryStage.show();
        drawCard(StandardCard.ALL_CARDS.get(0), false, 350, 315);
        drawCard(StandardCard.ALL_CARDS.get(0), true, 300, 300);
        drawDeck(StandardCard.ALL_CARDS, false, 500, 300);
    }

    public static void main(String args[]){
        launch(args);
    }
    public void drawDeck(List<StandardCard> deck, boolean topVisible, double posx, double posy, double width, double height) throws FileNotFoundException {
        for(int i = deck.size() - 1; i > 0; i--){
            drawCard(deck.get(i), false, posx+i*3, posy+i, width, height);
        }
        drawCard(deck.get(0), topVisible, posx, posy, width, height);
    }
    public void drawDeck(List<StandardCard> deck, boolean topVisible, double posx, double posy) throws FileNotFoundException {
        drawDeck(deck, topVisible, posx, posy, STD_CARD_WIDTH, STD_CARD_HEIGHT);
    }

    public void drawCard(Card card, boolean visible, double posx, double posy, double width, double height) throws FileNotFoundException {
        Image image = new Image(new FileInputStream(gui.getCardImage(card, visible)));
        ImageView view = new ImageView(image);
        view.setX(posx);
        view.setY(posy);
        view.setFitWidth(width);
        view.setFitHeight(height);
        root.getChildren().add(view);
    }

    public void drawCard(Card card, boolean visible, double posx, double posy) throws FileNotFoundException {
        drawCard(card, visible, posx, posy, STD_CARD_WIDTH, STD_CARD_HEIGHT);
    }
}
