
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

    public void plusPlusCountRound(){
        this.countRound ++;
    }


    public void execute() {
        
        army.makeArmys();
        board.printBoard(countRound);
            
        while(noWinner){
            System.out.println("\n\n\n||||||||NEW TURN||||||||||");
            battle.makeBattle(countRound );
            army.updateArmys(countRound);
            board.printBoard( countRound);
            noWinner = board.isAnyWinner();
            countRound ++;
            if(countRound > army.getSizeOfArmy() - 1)
                countRound = 0;
            }

        System.out.println("Thanks for playing");
        
    }

}
