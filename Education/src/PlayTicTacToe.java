import com.games.TicTacToe;

public class PlayTicTacToe {
	public static void main(String[] args) {
		TicTacToe newBoard = new TicTacToe();
		int[] move = new int[2];
		
		move[0]=0;
		move[1]=0;
		if (newBoard.makeMove(move, 'X')) {
			System.out.println("Winner, Winner, Chicken Dinner!");			
		}		
		newBoard.printBoard();
		
		move[0]=1;
		move[1]=0;		
		if (newBoard.makeMove(move, 'O')) {
			System.out.println("Winner, Winner, Chicken Dinner!");			
		}	
		newBoard.printBoard();
		
		move[0]=2;
		move[1]=0;		
		if (newBoard.makeMove(move, 'O')) {
			System.out.println("Winner, Winner, Chicken Dinner!");			
		}	
		newBoard.printBoard();
		
		
		move[0]=2;
		move[1]=0;		
		if (newBoard.makeMove(move, 'X')) {
			System.out.println("Winner, Winner, Chicken Dinner!");			
		}	
		newBoard.printBoard();
		
		
		move[0]=1;
		move[1]=1;		
		if (newBoard.makeMove(move, 'O')) {
			System.out.println("Winner, Winner, Chicken Dinner!");			
		}	
		newBoard.printBoard();
		
		move[0]=0;
		move[1]=2;		
		if (newBoard.makeMove(move, 'X')) {
			System.out.println("Winner, Winner, Chicken Dinner!");			
		}	
		newBoard.printBoard();

		//O For the win!
		move[0]=1;
		move[1]=2;		
		if (newBoard.makeMove(move, 'O')) {
			System.out.println("Winner, Winner, Chicken Dinner!");			
		}	
		newBoard.printBoard();
		
		//X for another win!
		move[0]=1;
		move[1]=0;		
		if (newBoard.makeMove(move, 'X')) {
			System.out.println("Winner, Winner, Chicken Dinner!");			
		}	
		newBoard.printBoard();
		
	}
}
