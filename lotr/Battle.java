import java.util.ArrayList;


public class Battle {
    private Player player1;
    private Player player2;
    private int numberOfDice;
    private Army army;
    private ISoldier hero;
    private ISoldier beast;
    private int attack;


    public Battle(Army army, Player player1, Player player2) {
        this.army = army;
        this.player1 = player1;
        this.player2 = player2;
    }

    public void makeBattle(int countRound) {
        hero = army.getHeroesArmy().get(countRound);
        beast = army.getBeastsArmy().get(countRound);                      
        attack(hero, beast, player1);
        attack(beast, hero, player2);   
    
    }

    private int getExtra(ISoldier attacker, ISoldier deffender) {

        return 0;
    }

    private void attack(ISoldier attacker, ISoldier deffender, Player player){
        int power =  player.throwDice();     
        int newHeal = 0;
        if( power > deffender.getArmor()){
            newHeal = deffender.getHeal() - (attack + getExtra(attacker, deffender));
            deffender.setHeal(newHeal);
            System.out.println("New heal of " + deffender.getName() + " .");
        } else {
            System.out.println("Not enough power, good luck on the next one");
        }

    }
    
}
