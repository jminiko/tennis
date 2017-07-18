package info.iniko.tennis;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by enviablejimi on 18/07/17.
 */
public class Set {

	Player p1;
	Player p2;

	boolean setOver = false;

	public Set(Player player1, Player player2) {
		p1=player1;
		p2=player2;
	}

	public void winGame(Player p) throws SetOverException {
		if (setOver)
			throw new SetOverException();
		int s = p.getCurrentSet(); 
		if (s <=5 ) {
			p.setCurrentSet(s+1);
			return;
		}
		if(p1==p && s>=5 && p2.getCurrentSet()<=4) {
			p1.setCurrentSet(s+1);
			setOver = true;
			return;
		}
		if(p2==p && s>=5 && p1.getCurrentSet()<=4) {
			p2.setCurrentSet(s+1);
			setOver = true;
			return;
		}
		// entering tie break
		if(p==p1&&s==5&&p2.getCurrentSet()==6) {
			p.setCurrentSet(s+1);
			return;
		}
		// entering tie break
		if(p==p2&&s==5&&p1.getCurrentSet()==6) {
			p.setCurrentSet(s+1);
			return;
		}
		if(p1.getCurrentSet()>=6&&p2.getCurrentSet()>=6) {
			p.setCurrentSet(s+1);
			if(p==p2&&(p2.getCurrentSet()-p1.getCurrentSet())>=2) {
				setOver = true;
				return;
			}
			if(p==p1&&(p1.getCurrentSet()-p2.getCurrentSet())>=2) {
				setOver = true;
				return;
			}
		}
	}
}