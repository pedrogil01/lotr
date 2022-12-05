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

        boolean isAnyWinner = false;

        for (int i =0 ; i<heroes.size(); i++){
            if(heroes.get(i).getHeal()<=0){
                isAnyWinner=false;
            }
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

        for(int i =0; i<heroes.size();i++){
        
            System.out.print(" |" + heroes.get(i).getName() + " vida = " + heroes.get(i).getHeal() );

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


        }

    }
    
}
