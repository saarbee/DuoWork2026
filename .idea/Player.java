public class Player extends Character {
    private Item[] inventory;


public Player(String name, int health, int level) {
    super(name,health,level);
    inventory = new Item[0];
}

public Player(String name,int health,int level,Item[] inventory){
    super(name,health,level);
    this.inventory = inventory;
}
public void addItem(Item item){
    for (int i = 0; i < inventory.length; i++) {
        if(inventory[i] == null) {
            inventory[i] = item;
            return;
        }
    }
}
public int calculateInventoryValue(){
        int sum=0;
        for (int i = 0; i <inventory.length; i++) {
            if(inventory[i]!=null)
                sum+=inventory[i].getValue();
        }
        return sum;
    }
    public boolean hasMagicalItem(){
        for (int i = 0; i <inventory.length; i++) {
            if(inventory[i]!=null){
            if(inventory[i].isMagical() == true)
                return true;
        }
    }
        return false;
}

    public String toString(){
        String stringToBuild = super.toString() + "\nInventory:";
        for (int i = 0; i < inventory.length; i++) {
            if(inventory[i]!=null)
                stringToBuild += "\n"+ inventory[i].getName();
        }
        return stringToBuild;
    }
}
