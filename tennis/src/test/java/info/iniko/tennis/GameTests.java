package info.iniko.tennis;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertSame;

/**
 * Created by enviablejimi on 18/07/17.
 */

public class GameTests {
    Player p1,p2;
    Game g1 ;
    @Before
    public void setup(){
        p1 = new Player("Nadal");
        p2 = new Player("Federer");
        g1 = new Game(p1,p2);
    }
    @Test
    public void testGameSimple(){
    	assertSame("Name should be same","Nadal",p1.getName());
    	assertSame("Name should be same","Federer",p2.getName());
    }
    @Test
    public void testGamePlayers() {
    	assertSame("Player should be same",g1.player1,p1);    
    	assertSame("Player should be same",g1.player2,p2);
    }
    @Test
    public void testPoints() {
    
    	g1.winPoint(p1);
    	g1.winPoint(p2);
    	g1.winPoint(p2);
    	g1.winPoint(p2);
    	g1.winPoint(p2);
    	assertSame("Point should be same",g1.player2.ge,GameEnum.Won);
    }
}
