import java.util.ArrayList;
public class Board {
    
    private Army army;
    private ArrayList<ISoldier> heroes = new ArrayList<ISoldier>(); 
    private ArrayList<ISoldier> beasts = new ArrayList<ISoldier>(); 
    private String string;

    
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

            if(heroes.get(i).getHeal()>0){
                string = " |" + heroes.get(i).getName() + " vida = " + heroes.get(i).getHeal();
                System.out.print( string);
            } else {
                string = " | " + heroes.get(i).getName() + " DEAD"  ;
                System.out.print(string);
            }

            for (int j =0; j<25 - string.length(); j++)
                System.out.print(" ");
            System.out.print("|");


            System.out.print("           vs            ");

            if(beasts.get(i).getHeal()>0){
                string =" |" + beasts.get(i).getName() + " vida = " + beasts.get(i).getHeal();
                System.out.print(string);
            } else {
                string =" | " + beasts.get(i).getName() + " DEAD" ; 
                System.out.print(string);                
            }

            for (int j =0; j<25 - string.length(); j++)
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
