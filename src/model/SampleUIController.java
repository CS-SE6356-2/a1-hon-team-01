package model;

public class SampleUIController implements UIController {
    @Override
    public String getCardImage(Card card, boolean visible) {
        if(!visible){
            return "resources/red_back.png";
        }
        return "resources/" + card.toString() + ".png";
    }

    @Override
    public void drawGameState(GameState gameState, Player currentPlayer) {

    }
}
