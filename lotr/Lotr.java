public class Lotr {

    private Round round;
    private Board board;
    private Army army;
    private Player player1;
    private Player player2;
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
        player1 = new Player(1);
        player2 = new Player(2);
        battle = new Battle(army,player1,player2);
        board = new Board(army);
        round = new Round(board, army, battle);
    
    }
    


}
