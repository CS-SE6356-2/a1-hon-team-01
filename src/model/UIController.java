package model;

import java.awt.Component;
import java.awt.Point;
import java.util.function.Function;

public interface UIController {
	
	public abstract void handleUIObject(Component c);
	public abstract void handleCardClick(Card card);
	public abstract void drawCard(Point p, Card card);
	public abstract void drawGameState(Game g, Player currentPlayer);
	public abstract void drawComponent(Component c, Function clickHandler);
}
