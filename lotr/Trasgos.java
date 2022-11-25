public class Trasgos implements ISoldier {

    private int heal = 325;
    private int armor = 40;
    private String name = "Trasgos";


    
    public Trasgos() {
    }

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
