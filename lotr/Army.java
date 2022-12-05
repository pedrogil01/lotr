import java.util.ArrayList;

public class Army {

    private ArrayList <ISoldier> heroes = new ArrayList<ISoldier>();
    private ArrayList <ISoldier> beasts = new ArrayList<ISoldier>();
    private ArrayList <ISoldier> backHeroes = new ArrayList<ISoldier>();
    private ArrayList <ISoldier> backBeasts = new ArrayList<ISoldier>();
    private ArrayList <Integer> heroesVsBeast = new ArrayList<>();
    private ArrayList <Integer> beastsVsHeroes = new ArrayList<>();
    private int sizeOfArmy;

    public Army() {
    }


    public void makeArmys() {

        heroes.add( new Elf(0));
        heroes.add( new Hobbit(1));
        heroes.add( new Human(2));
        heroes.add( new Elf(3));
        heroes.add( new Hobbit(4));

        //Here we create both armys.

        beasts.add( new Orc(0));
        beasts.add( new Orc(1));
        beasts.add( new Trasgos(2));
        beasts.add( new Orc(3));
        beasts.add( new Orc(4));

        sizeOfArmy = heroes.size();

        for (int i = 0; i < sizeOfArmy; i++) {
            heroesVsBeast.add(i);
            beastsVsHeroes.add(i);            
        }
    
    }


    public void updateArmys(int countRound){
        ISoldier hero = heroes.get(heroesVsBeast.get(countRound));
        ISoldier beast = beasts.get(beastsVsHeroes.get(countRound));


        if(hero.getHeal()<=0 || beast.getHeal()<=0 ){
        
            if(hero.getHeal()>0 && backBeasts.size()<=0){
                backHeroes.add(hero);
                heroesVsBeast.remove(countRound);
                beastsVsHeroes.remove(countRound);
            } 
            
            if(beast.getHeal()>0 && backHeroes.size()<=0){
                backBeasts.add(beast);
                heroesVsBeast.remove(countRound);
                beastsVsHeroes.remove(countRound);
            }
        
            if(hero.getHeal()>0 && !backBeasts.isEmpty()){
                beastsVsHeroes.set(countRound, backBeasts.get(0).getPosition());
                backBeasts.remove(0);
            }
            if(beast.getHeal()>0 && !backHeroes.isEmpty()){
                heroesVsBeast.set(countRound, backHeroes.get(0).getPosition());
                backHeroes.remove(0);
            }
    
        }

    }


    //new method to get acces to both armys
    public ArrayList<ISoldier> getHeroesArmy() {
        return heroes;
    }

    public ArrayList<ISoldier> getBeastsArmy() {
        return beasts;
    }

    public ArrayList<Integer> getHeroesVsBeast() {
        return heroesVsBeast;
    }

    public ArrayList<Integer> getBeastVsHeroes() {
        return beastsVsHeroes;
    }
    


    public int getSizeOfArmy() {
        return heroesVsBeast.size();
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
