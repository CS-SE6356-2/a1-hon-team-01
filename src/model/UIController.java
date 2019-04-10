package model;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;

import main.Main;

public interface UIController{
    double STD_CARD_WIDTH = 150.0;
    double STD_CARD_HEIGHT = 210.0;

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
//	public abstract void handleUIObject(Component c);
//	public abstract void handleCardClick(Card card);
//	public abstract void drawComponent(Component c, Function clickHandler);
}
