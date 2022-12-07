public class Orc implements ISoldier {

    private int heal = 300;
    private int armor = 40;
    private String name = "Orc";
    private int position;


    
    public Orc (int position){
        this.position =position;
    }


    public Orc(String name,int heal, int armor) {
        this.heal = heal;
        this.armor = armor;
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
    
    
    @Override
    public void setName(String name) {
        this.name =name;
    }


    @Override
    public int getHeal() {
        return heal;
    }
    @Override
    public void setHeal(int heal) {
        this.heal = heal;
    }
    @Override
    public int getArmor() {
        return armor;
    }
    @Override
    public void setArmor(int armor) {
        this.armor = armor;
    }

    @Override
    public int getPosition() {
        // TODO Auto-generated method stub
        return position;
    }



}