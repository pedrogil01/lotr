import java.util.ArrayList;
public class Board {
    
    private Army army;
    private ArrayList<ISoldier> heroes = new ArrayList<ISoldier>(); 
    private ArrayList<ISoldier> beasts = new ArrayList<ISoldier>(); 

    
    public Board(Army army) {
    this.army =army;
    }

   
    //Player1 - Heroes
    //Player2 - Beasts



	public boolean isAnyWinner() {

        boolean isAnyWinner = false;

        for (int i =0 ; i<heroes.size(); i++){
            if(heroes.get(i).getHeal()>0){
                isAnyWinner=true;
        
        }
        
    }

    for (int i =0 ; i<beasts.size(); i++){
        if(beasts.get(i).getHeal()>0){
            isAnyWinner=true;
    
        }
    
    }
    return isAnyWinner;
	}
    


    //this is the print method, Reads all the heroes's or beast's estadistics and shows it in console

    public void printBoard(int countRound) {

        heroes = army.getHeroesArmy();
        beasts = army.getBeastsArmy();

        for(int i =0; i<heroes.size();i++){
        
            System.out.print(" |" + heroes.get(i).getName() + " vida = " + heroes.get(i).getHeal() );

            for (int j =0; j<13 - heroes.get(i).getName().length(); j++)
                System.out.print(" ");
            System.out.print("|");


            System.out.print("           vs            ");
        
            System.out.print(" |" + beasts.get(i).getName() + " vida = " + beasts.get(i).getHeal() );
            for (int j =0; j<12 - beasts.get(i).getName().length(); j++)
                System.out.print(" ");
            
            if(countRound ==i){
                System.out.println("| <---------");
            }
            else{
                System.out.println("|");
            }


        }

    }
    
}
