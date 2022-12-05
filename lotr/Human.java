public class Human implements ISoldier {
    private int heal = 180;
    private int armor = 40;
    private String name = "Human";
    private int position;
    private Boolean status = false;

    
    public Human (int position){
        this.position =position;
    }

    public Human(String name,int heal, int armor) {
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
    public Boolean getStatus() {
        // TODO Auto-generated method stub
        return status;
    }

    @Override
    public void setStatus(Boolean status) {
        this.status = status;
        // TODO Auto-generated method stub
        
    }

    @Override
    public int getPosition() {
        // TODO Auto-generated method stub
        return position;
    }

}