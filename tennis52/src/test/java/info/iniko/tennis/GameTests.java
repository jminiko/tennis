package info.iniko.tennis;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;



/**
 * Created by enviablejimi on 18/07/17.
 */

public class GameTests {
    Player p1,p2;
    @Before
    public void setup(){
        p1 = new Player("Nadal");
        p1 = new Player("Federer");
    }
    @Test
    public testGameSimple(){
        assert ("Nadal".equals(p1.getName()));
    }

}
