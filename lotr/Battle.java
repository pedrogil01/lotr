import java.util.ArrayList;


public class Battle {
    private Player player1;
    private Player player2;
    private int numberOfDice;
    private Army army;
    private ArrayList<ISoldier> heroes = new ArrayList<ISoldier>(); 
    private ArrayList<ISoldier> beasts = new ArrayList<ISoldier>(); 

    private int attack;


    public Battle(Army army, Player player1, Player player2) {
        this.army = army;
        this.player1 = player1;
        this.player2 = player2;
        this.heroes = army.getHeroesArmy();
        this.heroes = army.getBeastsArmy();
    }

    public void makeBattle(int countRound) {
        ISoldier hero = heroes.get(countRound);
        ISoldier beast = beasts.get(countRound);
        numberOfDice = 1 ;                          //number of dices
        attack =  player1.throwDice(numberOfDice);

        if( attack > beast.getArmor()){
            int newHeal = hero.getHeal() - (attack + getExtra());
            hero.setHeal(newHeal);
        }

        

    }

    private int getExtra() {
            
        return 0;
    }
    
}
