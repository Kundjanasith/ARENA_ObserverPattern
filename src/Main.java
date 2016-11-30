import java.util.Scanner;
/**
 * Main is the main class to run this application
 * @author Kundjanasith Thonglek 5720545023
 */
public class Main {
	public static void main(String[] args){
		System.out.println("Start");	
		GameBoard gameBoard = new GameBoard();
		MatchView matchView = new MatchView(gameBoard);	
		Scanner scanner = new Scanner(System.in);
		while(true){
			System.out.println("Please input your state : ");
			int input = scanner.nextInt();
			System.out.println("Input >> "+input);
			gameBoard.playMove();
			if(input==0) 
				break;
		}
		System.out.println("Finish");
	}
}
