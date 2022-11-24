public class Trasgos implements ISoldier {

    private int heal = 325;
    private int armor;
    private String name;

    public Trasgos(String name, int heal, int armor) {
        this.heal = heal;
        this.armor = armor;
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
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
