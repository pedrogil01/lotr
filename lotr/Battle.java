public class Battle {

    private Army army;
    private ISoldier hero;
    private ISoldier beast;
    private int heroThrows = 1;
    private int beastThrows = 2;
    private int maxHeroesAttack = 100;
    private int maxBeastsAttack = 90;


    public Battle(Army army) {
        this.army = army;

    }

    public void makeBattle(int countRound) {
            hero = army.getHeroesArmy().get(army.getHeroesVsBeast().get(countRound));
            beast = army.getBeastsArmy().get(army.getBeastVsHeroes().get(countRound));  
            System.out.println("||||||||||||\nIs Heroes turn!!!");                   
            attack(hero, beast);
            System.out.println("||||||||||||\nIs Beasts turn!!!");
            attack(beast, hero);  

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

    private void attack(ISoldier attacker, ISoldier deffender){

        int power =  throwDice(attacker);     
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

    private int throwDice(ISoldier attacker) {

        int dice = 0;

        if(attacker instanceof Human || attacker instanceof Hobbit || attacker instanceof Elf){
            dice = heroThrowDice();
        } else {
            dice = beastThrowDice();
        }

        return dice;
    }

    private int heroThrowDice() {

        int max = 0;
        int min = 0;

        System.out.print("|||||||||||||||||| \nTo throw your dice ");

        for (int i =0; i<heroThrows; i++){
            Terminal.pressAKey("press any key:");
            min = (int) Math.floor(Math.random()*(maxHeroesAttack));
            System.out.println("|||||||||\nYour throw "+ (i+1) + " is: " + min );   
            if(max < min ){
                max = min;
            }
        }

        return max;

    }

    private int beastThrowDice() {
        
        int max = 0;
        int min = 0;

        System.out.print("|||||||||||||||||| \nTo throw your dice ");

        for (int i =0; i<beastThrows; i++){
            Terminal.pressAKey("press any key:");
            min = (int) Math.floor(Math.random()*(maxBeastsAttack));
            System.out.println("|||||||||\nYour throw "+ (i+1) + " is: " + min );   
            if(max < min ){
                max = min;
            }
        }

        return max;
    }

    
}
