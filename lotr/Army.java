import java.util.ArrayList;

public class Army {

    private ArrayList <ISoldier> heroes = new ArrayList<ISoldier>();
    private ArrayList <ISoldier> beasts = new ArrayList<ISoldier>();



    

    public Army() {
    }


    public void makeArmys() {

        heroes.add( new Elf());
        heroes.add( new Hobbit());
        heroes.add( new Human());
        heroes.add( new Elf());
        heroes.add( new Hobbit());

        //Here we create both armys.

        beasts.add( new Orc());
        beasts.add( new Orc());
        beasts.add( new Trasgos());
        beasts.add( new Orc());
        beasts.add( new Orc());

    
    }


    //new method to get acces to both armys
    public ArrayList<ISoldier> getHeroesArmy() {
        return heroes;
    }

    public ArrayList<ISoldier> getBeastsArmy() {
        return beasts;
    }

    
}
