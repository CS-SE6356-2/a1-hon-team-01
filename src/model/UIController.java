package model;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;

import javafx.scene.text.Font;
import javafx.scene.text.Text;
import main.Main;

public interface UIController{
    double STD_CARD_WIDTH = 150.0;
    double STD_CARD_HEIGHT = 210.0;
    String DEFAULT_FONT_FAMILY = Font.getDefault().getFamily();
    double DEFAULT_FONT_SIZE = 30.0;

    String getCardImage(Card card, boolean visible);
    void drawGameState(GameState gameState, Player currentPlayer);
    default void drawDeck(List<StandardCard> deck, boolean topVisible, double posx, double posy, double width, double height) throws FileNotFoundException {
        for(int i = deck.size() - 1; i > 0; i--){
            drawCard(deck.get(i), false, posx+i*3, posy+i, width, height);
        }
        drawCard(deck.get(0), topVisible, posx, posy, width, height);
    }
    default void drawDeck(List<StandardCard> deck, boolean topVisible, double posx, double posy) throws FileNotFoundException {
        drawDeck(deck, topVisible, posx, posy, STD_CARD_WIDTH, STD_CARD_HEIGHT);
    }

    default void drawCard(Card card, boolean visible, double posx, double posy, double width, double height) throws FileNotFoundException {
        Image image = new Image(new FileInputStream(getCardImage(card, visible)));
        ImageView view = new ImageView(image);
        view.setX(posx);
        view.setY(posy);
        view.setFitWidth(width);
        view.setFitHeight(height);
        Main.root.getChildren().add(view);
    }

    default void drawCard(Card card, boolean visible, double posx, double posy) throws FileNotFoundException {
        drawCard(card, visible, posx, posy, STD_CARD_WIDTH, STD_CARD_HEIGHT);
    }

    default void drawText(String message, double posx, double posy, String family, double fontSize){
        Text text = new Text();
        text.setFont(new Font(family, fontSize));
        text.setX(posx);
        text.setY(posy);
        text.setText(message);
        Main.root.getChildren().add(text);
    }

    default void drawText(String message, double posx, double posy, int fontSize){
        drawText(message, posx, posy, DEFAULT_FONT_FAMILY, fontSize);
    }

    default void drawText(String message, double posx, double posy){
        drawText(message, posx, posy, DEFAULT_FONT_FAMILY, DEFAULT_FONT_SIZE);
    }


//	public abstract void handleUIObject(Component c);
//	public abstract void handleCardClick(Card card);
//	public abstract void drawComponent(Component c, Function clickHandler);
}
