
public class GameBoard extends Subject {
	private int state;	
	public GameBoard(){
		this.state = 0;
	}
	public int getState() {
		return this.state;
	}
	public void playMove() {
		System.out.println("Play Move");
		this.state = this.state + 1 ;
		this.notifyAllObservers();
	}
}
