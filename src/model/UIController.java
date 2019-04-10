package model;

public interface UIController{

    String getCardImage(Card card, boolean visible);
    void drawGameState(GameState gameState, Player currentPlayer);
//	public abstract void handleUIObject(Component c);
//	public abstract void handleCardClick(Card card);
//	public abstract void drawComponent(Component c, Function clickHandler);
}
