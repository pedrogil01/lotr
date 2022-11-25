import java.util.ArrayList;

public class Player {
    private int option;
    private int numberOfHerosThrows = 1;
    private int numberOfBeastsThrows = 2;
    private int maxHeroesAttack = 100;
    private int maxBeastsAttack = 100;
    private ArrayList<Integer> hereosDices = new ArrayList<>();
    private ArrayList<Integer> beastDices = new ArrayList<>();
    


    public Player(int option) {
        this.option = option;
        initDices();
    }



    public int throwDice() {
        
        if (option == 1){
            System.out.print("To throw your dice ");
            for (int i =0; i<numberOfHerosThrows; i++){
                Terminal.pressAKey("press any key:");
                hereosDices.add((int) Math.floor(Math.random()*(maxHeroesAttack)));
                System.out.println("Your throw =" + hereosDices.get(i));   
            }
            return getMax(hereosDices);
        } else {
            System.out.print("To throw your dice ");
            for (int i =0; i<numberOfBeastsThrows; i++){
                Terminal.pressAKey("press any key:");
                beastDices.add((int) Math.floor(Math.random()*(maxBeastsAttack)));
                System.out.println("Your throw =" + beastDices.get(i));   
            }
            return getMax(beastDices);
        }
        
    }



    private int getMax(ArrayList<Integer> numbers) {

        int max = 0;

        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i) > max) {
                max = numbers.get(i);
            }
        }    
        return max;
    }



    private void initDices() {

        if (option ==1){
            for(int i =0 ;i<numberOfHerosThrows; i++){
                hereosDices.add(0);
            }
        } else {
            for(int i =0 ;i<numberOfBeastsThrows; i++){
                beastDices.add(0);
            }
            
        }

    }

}
