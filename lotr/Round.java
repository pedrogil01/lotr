public class Round {
    private Board board;
    private Army army;
    private Battle battle;
    private boolean noWinner = true;
    private int countRound =0;



    public Round(Board board, Army army,Battle battle) {
        this.board = board;
        this.army = army; 
        this.battle = battle;
    }


    public void execute() {
        
        army.makeArmys();

        while(noWinner){
            board.printBoard(countRound);
            battle.makeBattle( countRound );
            board.printBoard(countRound);
            System.out.println("\n\n\n||||||||NEW TURN||||||||||");
            noWinner = board.isAnyWinner();
            countRound ++;
            if(countRound >4)
                countRound = 0;
        }
    
    }
    
}
