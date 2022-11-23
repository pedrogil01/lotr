public class Round {
    private Player player1;
    private Player player2;
    private Board board;
    private Army army;
    private Battle battle;
    private boolean noWinner = true;
    private int countRound =0;



    public Round(Board board, Army army) {
        this.board = board;
        this.army = army; 
    }


    public void execute() {
        
        army.makeArmys();

        while(noWinner){

            battle.makeBattle( countRound );
            board.printBoard();
            noWinner = board.isAnyWinner();
            countRound ++;
            if(countRound >4)
                countRound = 0;
        }
    
    }
    
}
