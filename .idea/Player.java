public class Player extends Character {
    private Item[] inventory;
}

public Player(String name, int health, int level) {
    super(name,health,level);
    inventory = new Item[0];
}

public Player(String name,int health,int level,Item[] inventory){
    super(name,health,level);
    this.inventory = inventory;
}