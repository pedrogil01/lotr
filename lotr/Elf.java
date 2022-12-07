public class Elf implements ISoldier{
    
    private int heal = 250;
    private int armor = 40;
    private String name = "Elf";
    private int position;
    
    public Elf(String name, int heal, int armor) {
        this.name = name;
        this.heal = heal;
        this.armor = armor;
    }
    public Elf (int position){
        this.position =position;
    }

    @Override
    public String getName() {
        return name;
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
    public void setName(String name) {
        this.name =name;
    }

    @Override
    public int getPosition() {
        // TODO Auto-generated method stub
        return position;
    }

    


    
    
    
}
