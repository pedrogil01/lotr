public class Lotr {

    private Round round;
    private Board board;
    private Army army;
    private Battle battle;

    public Lotr() {
    
        initGame();
        play();
    
    }

    private void play() {
        round.execute();
    }

    private void initGame() {

        System.out.println("|||||||||||||||||||||||||||||");
        System.out.println("WELCOME TO THE LOTR GAME");
        
        army = new Army();
        battle = new Battle(army);
        board = new Board(army);
        round = new Round(board, army, battle);
    
    }
    


}
