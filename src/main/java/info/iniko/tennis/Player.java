package info.iniko.tennis;

import java.util.Random;

/**
 * Created by enviablejimi on 18/07/17.
 */
public class Player {
    String name;
    int atpRank;
    GameEnum ge = GameEnum.Love;
    int currentSet = 0;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAtpRank() {
        return atpRank;
    }

    public void setAtpRank(int atpRank) {
        this.atpRank = atpRank;
    }

    public GameEnum getGe() {
        return ge;
    }

    public void setGe(GameEnum ge) {
        this.ge = ge;
    }

    public Player(String name){
        this.name = name;
        atpRank = (new Random()).nextInt(50);
    }

	public int getCurrentSet() {
		return currentSet;
	}

	public void setCurrentSet(int currentSet) {
		this.currentSet = currentSet;
	}
    
}
