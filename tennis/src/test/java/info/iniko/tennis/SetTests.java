package info.iniko.tennis;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertSame;

public class SetTests {

	Player player1;
	Player player2;
	Set s;
	
	@Before
	public void setup() {
		player1 = new Player("Nadal");
		player2 = new Player("Federer");
		s = new Set(player1,player2);
	}
	
	@Test
	public void testTieBreak() throws SetOverException {
		s.winGame(player1);
		s.winGame(player2);
		s.winGame(player1);
		s.winGame(player2);
		s.winGame(player1);
		s.winGame(player2);
		s.winGame(player1);
		s.winGame(player2);
		s.winGame(player1);
		s.winGame(player2);
		s.winGame(player1);
		s.winGame(player2);
		s.winGame(player1);
		s.winGame(player2);
		s.winGame(player2);
		s.winGame(player2);
		assertSame("Set won by player 1",player2.getCurrentSet(),9);
		assertSame("Set won by player 1", s.setOver,true);
	}
	@Test
	public void simpleSet() throws SetOverException {
		s.winGame(player1);
		s.winGame(player1);
		s.winGame(player1);
		s.winGame(player1);
		s.winGame(player1);
		s.winGame(player1);
		assertSame("Set won by player 1", 6,player1.getCurrentSet());
	}
	
	@Test
	public void simpleSetMixed() throws SetOverException {
		s.winGame(player1);
		s.winGame(player1);
		s.winGame(player2);
		s.winGame(player1);
		s.winGame(player2);
		s.winGame(player1);
		s.winGame(player2);
		s.winGame(player1);
		s.winGame(player1);
		assertSame("Set won by player 1", 6,player1.getCurrentSet());
		assertSame("Set lost by player 2", 3,player2.getCurrentSet());
	}
	
	
}
