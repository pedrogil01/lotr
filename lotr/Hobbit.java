public class Hobbit implements ISoldier{
    private int heal = 200;
    private int armor = 100;
    private String name = "Hobbit";


    
    public Hobbit() {
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
}
