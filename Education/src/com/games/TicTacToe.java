package com.games;

public class TicTacToe {
	char [][] board   = new char[3][3];
	int numMoves      = 0;
	int minMovesToWin = 5;
	int maxMoves      = 9;
	char lastMove;
	private boolean isWon = false;
	
	
	public void printBoard() {		
		System.out.println(board[2][0] + "|" + board[2][1] + "|" + board[2][2] );
		System.out.println(board[1][0] + "|" + board[1][1] + "|" + board[1][2] );
		System.out.println(board[0][0] + "|" + board[0][1] + "|" + board[0][2] );
		System.out.println();
		System.out.println();
	}
	
	public boolean makeMove(int[] move, char value) {		
		if ( isWon == true ) {
			//Exception!
			System.out.println("Game has already been won!");
		}
		if (isLegal(move, value)) {
			board[move[0]][move[1]]=value;
		} else {
			System.out.println("Invalid move!");
			return false;
		}
		numMoves++;
		lastMove = value;
		
		isWon = isWin();
		return isWon;
	}
	
	private boolean isLegal(int[] move, char value ) {
		//Is X Position index out of range for board
		if ( move[0] >= 0 && move[0] <= 3 )
			//Is Y Position index out of range for board
			if ( move[1] >= 0 && move[1] <= 3 ) 
				//Was the spot already marked?
				if ( board[move[0]][move[1]] != 'X' && board[move[0]][move[1]] != 'O' )
					//Same player must not move again!
					if ( value != lastMove )
								return true;
		return false;
	}
	
	private boolean isWin() {
		Boolean minMade = minMovesMade(); 
		if ( !minMade ) {
			return false;
		} else {
			//There are eight winning board configurations.
			//Start with vertical 
			if ( board[0][0] == board[1][0] && board[1][0] == board[2][0])
				return true;
			
			if ( board[1][0] == board[1][1] && board[1][1] == board[1][2])
				return true;
			
			if ( board[2][0] == board[2][1] && board[2][1] == board[2][2])
				return true;
			
			//Next, horizontal			
			if ( board[0][0] == board[0][1] && board[0][1] == board[0][2])
				return true;
			
			if ( board[1][0] == board[1][1] && board[1][1] == board[1][2])
				return true;
			
			if ( board[2][0] == board[2][1] && board[2][1] == board[2][2])
				return true;
			
			//Finally, two diagonals
			if ( board[0][0] == board[1][1] && board[1][1] == board[2][2])
				return true;
			
			if ( board[0][2] == board[1][1] && board[1][1] == board[2][0])
				return true;
		}
		return false;
	}
	
	private boolean minMovesMade() {
		return (numMoves >= minMovesToWin);
	}	
}
