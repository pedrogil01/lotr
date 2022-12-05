public class Battle {
    private Player player1;
    private Player player2;
    private Army army;
    private ISoldier hero;
    private ISoldier beast;


    public Battle(Army army, Player player1, Player player2) {
        this.army = army;
        this.player1 = player1;
        this.player2 = player2;
    }

    public void makeBattle(int countRound) {
            hero = army.getHeroesArmy().get(countRound);
            beast = army.getBeastsArmy().get(countRound);  
            System.out.println("||||||||||||\nIs Heroes turn!!!");                   
            attack(hero, beast, player1);
            System.out.println("||||||||||||\nIs Beasts turn!!!");
            attack(beast, hero, player2);       
    }

    private int getExtraAttack(ISoldier attacker, ISoldier deffender) {
        
        int extra = 0;
        
        if(attacker instanceof Elf && deffender instanceof Orc){            
            extra = 10;
        }

        if(attacker instanceof Hobbit && deffender instanceof Orc){            
            extra = -5;
        }

        return extra;
    }

    private float getExtraArmor(ISoldier attacker){
        
        float extraArmor = 1;

        if(attacker instanceof Orc){
            extraArmor = (float) 0.1;
        } 
        return extraArmor;

    }

    private void attack(ISoldier attacker, ISoldier deffender, Player player){

        int power =  player.throwDice();     
        int newHeal = 0;
        if( power > deffender.getArmor()){
            newHeal = (int) (deffender.getHeal() - (power + getExtraAttack(attacker, deffender) - (deffender.getArmor()-deffender.getArmor()*getExtraArmor(attacker))));
            if(newHeal <=0){
                deffender.setHeal(0);
                System.out.println("The " + deffender.getName() + " is DEAD");
            } else {
                deffender.setHeal(newHeal);
                System.out.println("New heal of " + deffender.getName() + " = " +deffender.getHeal() + " ");
            }
        } else {
            System.out.println("Not enough power, good luck on the next one");
        }

    }
    
}
