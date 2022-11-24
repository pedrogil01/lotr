import java.util.ArrayList;

public class Army {

    
    
    ArrayList <ISoldier> heroes = new ArrayList<ISoldier>();
    ArrayList <ISoldier> beasts = new ArrayList<ISoldier>();



    public void makeArmys() {

        heroes.add( new Elf("Elf", 250,100 ));
        heroes.add( new Hobbit("Hobbit",200, 100));
        heroes.add( new Human("Human" , 180, 100));
        beasts.add( new Orc("Orc",300, 100));
        beasts.add( new Trasgos("Trasgos",325, 100));
    }
    public void attack(){
        
    }

    
}
