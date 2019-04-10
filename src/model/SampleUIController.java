package model;

public class SampleUIController implements UIController {
    public String getCardImage(StandardCard c, boolean visible){
        if(!visible){
            return "red_back.png";
        }
        return c.getValue().toShortString() + c.getSuit().toCharacter() + ".png";
    }

    @Override
    public String getCardImage(Card card, boolean visible) {
        return "";
    }
}
