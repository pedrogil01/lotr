import java.util.ArrayList;

public class Army {

    private ArrayList <ISoldier> heroes = new ArrayList<ISoldier>();
    private ArrayList <ISoldier> beasts = new ArrayList<ISoldier>();



    public void makeArmys() {

        heroes.add( new Elf("Elf", 250,100 ));
        heroes.add( new Hobbit("Hobbit",200, 100));
        heroes.add( new Human("Human" , 180, 100));
        beasts.add( new Orc("Orc",300, 100));
        beasts.add( new Trasgos("Trasgos",325, 100));
    }



    public void attack(){

        
    }


    //new method to get acces to both armys
    public ArrayList<ISoldier> getHeroesArmy() {
        return heroes;
    }

    public ArrayList<ISoldier> getBeastsArmy() {
        return beasts;
    }

    
}
