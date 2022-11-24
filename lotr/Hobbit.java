public class Hobbit implements ISoldier{
    private int heal;
    private int armor;
    public Hobbit(int heal, int armor) {
        this.heal = heal;
        this.armor = armor;
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
