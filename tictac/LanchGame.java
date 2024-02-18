package tictac;
class LanchGame {
	public static void main(String[] args) {
		new TicTac();
		HumanPlayer p1=new HumanPlayer("Arun",'X');
		AiPlayer p2=new AiPlayer("AI",'O');
		Player cp;
		cp=p1;
		TicTac.displayBoard();
		while(true) {
			System.out.println(cp.name+"'s turn");
			cp.makeMove();
			TicTac.displayBoard();
			if(TicTac.colWin() ||TicTac.rowWin() || TicTac.diognalWin()) {
				System.out.println(cp.name +" has won the game!!");
				break;
			}
			else if(TicTac.checkDraw()) {
				System.out.println("Oops! The game is draw");
				break;
			}
			else {
				if(cp==p1) {
					cp=p2;
				}
				else
					cp=p1;
			}
		}


	}
}
