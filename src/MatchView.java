import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MatchView extends Observer{
	private GameBoard gameBoard;
	public MatchView(GameBoard gameBoard){
		this.gameBoard = gameBoard;
		this.gameBoard.subscribe(this);
		
	}
	@Override
	public void update() {
		System.out.println("GameBoard State >> "+this.gameBoard.getState());
	}
}
