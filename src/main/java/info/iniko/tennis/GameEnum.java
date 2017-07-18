package info.iniko.tennis;

/**
 * Created by enviablejimi on 18/07/17.
 */
public enum GameEnum {
	Love(0),Fifteen(1),Thirty(2),Forty(3),Deuce(4),Advantage(5),Disadvantage(5),Won(6),Lost(7);
	
	private int score;
    GameEnum(int s){
        this.setScore(s);
    }
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
}
