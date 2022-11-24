public class Orc implements ISoldier {

    private int heal = 300;
    private int armor ;
    private String name;
    public String getName() {
        return name;
    }
    public Orc(String name,int heal, int armor) {
        this.heal = heal;
        this.armor = armor;
        this.name = name;
    }
    public int getHeal() {
        return heal;
    }
    public void setHeal(int heal) {
        this.heal = heal;
    }
    public int getArmor() {
        return armor;
    }
    public void setArmor(int armor) {
        this.armor = armor;
    }


}