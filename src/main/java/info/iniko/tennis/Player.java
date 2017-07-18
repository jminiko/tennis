package info.iniko.tennis;

import java.util.Random;

/**
 * Created by enviablejimi on 18/07/17.
 */
public class Player {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAtpRank() {
        return atpRank;
    }

    public void setAtpRank(String atpRank) {
        this.atpRank = atpRank;
    }

    public GameEnum getGe() {
        return ge;
    }

    public void setGe(GameEnum ge) {
        this.ge = ge;
    }

    String atpRank;
    GameEnum ge = GameEnum.Love;
    public Player(String name){
        this.name = name;
        atpRank = (new Random()).nextInt(50);
    }
}
