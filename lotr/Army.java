import java.util.ArrayList;

public class Army {

    private ArrayList <ISoldier> heroes = new ArrayList<ISoldier>();
    private ArrayList <ISoldier> beasts = new ArrayList<ISoldier>();
    private ArrayList <ISoldier> backHeroes = new ArrayList<ISoldier>();
    private ArrayList <ISoldier> backBeasts = new ArrayList<ISoldier>();
    
    private int sizeOfArmy;



    

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


        sizeOfArmy = heroes.size();
    
    }


    //new method to get acces to both armys
    public ArrayList<ISoldier> getHeroesArmy() {
        return heroes;
    }

    public ArrayList<ISoldier> getBeastsArmy() {
        return beasts;
    }



    public int getSizeOfArmy() {
        return sizeOfArmy;
    }


    public void setSizeOfArmy(int sizeOfArmy) {
        this.sizeOfArmy = sizeOfArmy;
    }


    public ArrayList<ISoldier> getBackHeroes() {
        return backHeroes;
    }


    public void setBackHeroes(ArrayList<ISoldier> backHeroes) {
        this.backHeroes = backHeroes;
    }


    public ArrayList<ISoldier> getBackBeasts() {
        return backBeasts;
    }


    public void setBackBeasts(ArrayList<ISoldier> backBeasts) {
        this.backBeasts = backBeasts;
    }
    




    
}
