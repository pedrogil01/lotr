public class Hobbit implements ISoldier{
    private int heal = 200;
    private int armor = 40;
    private String name = "Hobbit";
    private int position;


    
    public Hobbit (int position){
        this.position =position;
    }

    public Hobbit(String name, int heal, int armor) {
        this.name = name;
        this.heal = heal;
        this.armor = armor;
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
