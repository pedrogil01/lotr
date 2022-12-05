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
            if(!(heroes.get(i).getHeal()> 0 ^ beasts.get(i).getHeal()> 0 )){
                string = " |" + heroes.get(i).getName() + " vida = " + heroes.get(i).getHeal();
                System.out.print(string + getSpace(string) + "|");
                System.out.print("           vs            ");
                string =" |" + beasts.get(i).getName() + " vida = " + beasts.get(i).getHeal();
                System.out.print(string + getSpace(string));
                printArrow(countRound, i);       
            } else {
                if (heroes.get(i).getHeal()>0){
                    string = " | HERO SENT TO BACK ARMY ";
                    System.out.print(string + getSpace(string) + "|");
                    System.out.print("           vs            ");
                } else {
                    string = " | HERO DEAD";
                    System.out.print(string + getSpace(string) + "|");
                    System.out.print("           vs            ");
                
                }
           
                if (beasts.get(i).getHeal()>0){
                    string = " | BEAST SENT TO BACK ARMY ";
                    System.out.print(string + getSpace(string));
                    printArrow(countRound, i);       
                } else {
                    string = " | BEAST DEAD";
                    System.out.print(string + getSpace(string));
                    printArrow(countRound, i);       
                }
           
            }


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
