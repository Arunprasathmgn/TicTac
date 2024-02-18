package tictac;

import java.util.Scanner;

class HumanPlayer extends Player{
	HumanPlayer(String name,char mark) {
		this.name=name;
		this.mark=mark;
	}
	void makeMove() {
		@SuppressWarnings("resource")
		Scanner input= new Scanner(System.in);
		int row;
		int col;
		do {
			System.out.println("Enter the row and col:");
			row=input.nextInt();
			col=input.nextInt();
		}while(!isValidMove(row,col));
		TicTac.placeMark(row, col, mark);
	}
}