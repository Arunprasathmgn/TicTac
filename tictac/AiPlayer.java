package tictac;
//comment
import java.util.Random;

class AiPlayer extends Player{
	AiPlayer(String name,char mark) {
		this.name=name;
		this.mark=mark;
	}
	void makeMove() {
		int row;
		int col;
		do {
			Random r=new Random();
			row=r.nextInt(3);				
			col=r.nextInt(3);				
		}while(!isValidMove(row,col));
		TicTac.placeMark(row, col, mark);
	}
}
