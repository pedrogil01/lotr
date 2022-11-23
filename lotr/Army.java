import java.util.ArrayList;

public class Army {

    
    
    ArrayList <ISoldier> heroes = new ArrayList<ISoldier>();
    ArrayList <ISoldier> beasts = new ArrayList<ISoldier>();



    public void makeArmys() {

        heroes.add( new Elf());
        heroes.add( new Hobbit());



    }


    
}
