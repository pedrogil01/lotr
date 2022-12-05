import java.util.ArrayList;
public class Board {
    
    private Army army;
    private ArrayList<ISoldier> heroes = new ArrayList<ISoldier>(); 
    private ArrayList<ISoldier> beasts = new ArrayList<ISoldier>(); 
    private ArrayList<Integer> heroesVs = new ArrayList<Integer>(); 
    private ArrayList<Integer> beastsVs = new ArrayList<Integer>(); 
    private String string;

    
    public Board(Army army) {
    this.army =army;
    }

   
    //Player1 - Heroes
    //Player2 - Beasts



	public boolean isAnyWinner() {

        boolean isAnyWinner = true;

        if(army.getHeroesVsBeast().isEmpty() || army.getBeastVsHeroes().isEmpty()){
            isAnyWinner = false;
        }

        return isAnyWinner;
	}
    


    //this is the print method, Reads all the heroes's or beast's estadistics and shows it in console

    public void printBoard(int countRound) {


        heroes = army.getHeroesArmy();
        beasts = army.getBeastsArmy();
        heroesVs = army.getHeroesVsBeast();
        beastsVs = army.getBeastVsHeroes();
        printBackArmy();

        for(int i =0; i<heroesVs.size();i++){
                string = " |" + heroes.get(heroesVs.get(i)).getName() + " vida = " + heroes.get(heroesVs.get(i)).getHeal();
                System.out.print(string + getSpace(string) + "|");
                System.out.print("           vs            ");
                string =" |" + beasts.get(beastsVs.get(i)).getName() + " vida = " + beasts.get(beastsVs.get(i)).getHeal();
                System.out.print(string + getSpace(string));
                printArrow(countRound, i);    
            }


    }

    
    private void printBackArmy() {
        ArrayList<ISoldier> heroesBackArmy = army.getBackHeroes();
        ArrayList<ISoldier> beastsBackArmy = army.getBackBeasts();
        
        if( heroesBackArmy.size()>0 || beastsBackArmy.size()>0){
            System.out.println("\n\n\n|||||||||||||||||||| back army|||||||||||||||");
            
            for(int i =0; i<heroesBackArmy.size();i++){
                System.out.println( "\n||||||Hero's back army|||||");    
                string = " |" + heroesBackArmy.get(i).getName() + " vida = " + heroesBackArmy.get(i).getHeal();
                System.out.println(string + getSpace(string) + "|\n\n\n");
            }
            for (int i = 0; i < beastsBackArmy.size(); i++) {
                System.out.println( "\n||||||Beast's back army|||||");
                string =" |" + beastsBackArmy.get(i).getName() + " vida = " + beastsBackArmy.get(i).getHeal() + " |";
                System.out.println(string + getSpace(string) +"\n\n\n");  
            }

        } else {
            System.out.println("\n\nNo back armys\n\n");
        }
    }


    private String getSpace(String string2) {

        String spaces = ""; 
        for (int j =0; j<30 - string2.length(); j++)
            spaces +=" ";

        return spaces;

    }

    private void printArrow(int countRound, int i) {
        if(countRound ==i){
            System.out.println("| <---------");
        }
        else{
            System.out.println("|");
        }

    }   




    
}
