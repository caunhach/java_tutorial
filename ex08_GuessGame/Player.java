package ex08_GuessGame;

public class Player {
	int number;
	public Player(){
		this.number = guess();
	}
	public int guess(){
		return((int) (Math.random() * 9));
	}
}
