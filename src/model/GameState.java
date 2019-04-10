package model;

import java.util.ArrayList;

public class GameState {
    ArrayList<Team> teams = new ArrayList<>();
    ArrayList[] board;
    int round;
    Player turn;

    public GameState(int numBoardDecks) {
        board = new ArrayList[numBoardDecks];
    }

}
