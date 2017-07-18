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
    public Game(Player p1, Player p2) {
    	player1 = p1;
    	p1.ge = GameEnum.Love;
    	player2 = p2;
    	p2.ge = GameEnum.Love;
    }
	public void winPoint(Player p) throws GameOverException {
        if(gameOver)
            throw new GameOverException();
        h.add(p);
        if(p.ge.equals(GameEnum.Love)) {
        	p.ge = GameEnum.Fifteen;
        	return;
        }
        if(p.ge.equals(GameEnum.Fifteen)) {
        	p.ge = GameEnum.Thirty;
        	return;
        }
        
        if(player1.ge.getScore()>=3&&player2.ge.getScore()>=3) {
        	if(player1.ge==player2.ge) {
        		if(p==player1) {
        			p.ge = GameEnum.Advantage;
        			player2.ge = GameEnum.Disadvantage;
        			return;
        		}else {
        			p.ge = GameEnum.Advantage;
        			player1.ge = GameEnum.Disadvantage;
        			return;
        		}
        	}	
        	if(player1.ge==GameEnum.Advantage&&player1==p) {
        		gameOver = true;
        		p.ge = GameEnum.Won;
        		player2.ge = GameEnum.Lost;
        		return;
        	}else if(player2.ge==GameEnum.Advantage&&player2==p){
        		p.ge = GameEnum.Won;
        		player1.ge = GameEnum.Lost;
        		gameOver = true;
        		return;
        	}else  {
        		player1.ge = GameEnum.Deuce;
        		player2.ge = GameEnum.Deuce;
        	}
        }
        if(p.ge.equals(GameEnum.Thirty)) {
        	p.ge=GameEnum.Forty;
        	return;
        }
        if(p.ge.equals(GameEnum.Forty)) {
        	if(player1==p){
        		player1.ge=GameEnum.Won;
        		player2.ge = GameEnum.Lost;
        	}else {
        		player1.ge = GameEnum.Lost;
        		player2.ge=GameEnum.Won;
        	}
        	gameOver = true;
        	return;
        }
    }

}
