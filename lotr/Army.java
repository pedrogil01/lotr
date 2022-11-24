import java.util.ArrayList;

public class Army {

    
    
    ArrayList <ISoldier> heroes = new ArrayList<ISoldier>();
    ArrayList <ISoldier> beasts = new ArrayList<ISoldier>();



    public void makeArmys() {

        heroes.add( new Elf(250,100));
        heroes.add( new Hobbit(200, 100));
        heroes.add( new Human(180, 100));
        beasts.add( new Orc(300, 100));
        beasts.add( new Trasgos(325, 100));





    }


    
}
