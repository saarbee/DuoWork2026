public class Enemy extends Character{

    private int damage;

    public Enemy(String name,int health,int level,int damage){
        super(name,health,level);
        if(!(damage>=1 && damage<=5)){
            System.out.println("Damage is out of range, set to default 0.");
            this.damage = 0;
        } else {
            this.damage = damage;
        }
    }
    public int getDamage(){
        return damage;
    }
    @Override
    public String toString(){
        return super.toString() + "\n" + "Damage: " + damage;
    }

}
