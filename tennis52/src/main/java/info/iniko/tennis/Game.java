package info.iniko.tennis;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by enviablejimi on 18/07/17.
 */
public class Game {
    Player player1;
    Player player2;

    boolean gameOver = false;
    private List<Player> h = new ArrayList<Player>();
    public void winPoint(Player p) throws GameOverException {
        if(gameOver)
            throw new GameOverException();
        h.add(p);

    }

}
