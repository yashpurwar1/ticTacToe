package ticTacToe;

public class TicTacToeGame {
	
	public void GameBoard() {
		char board[] = new char[10];
		for (int index=1; index<=9; index++) {
			board[index]=' ';
		}
		
	}
	public static void main(String args[]) {
		System.out.println("Welcome to tic tac toe");
		TicTacToeGame obj = new TicTacToeGame();
		obj.GameBoard();
	}

}
