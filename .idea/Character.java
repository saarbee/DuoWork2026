public class Character {
    private String name;
    private int health;
    private int level;

public Character(String name, int health, int level) {
    this.name = name;
    this.health = health;
    this.level = level;
}

public Character(){
    this.name = "Unknown";
    this.health = 0;
    this.level = 0;
};

public Character(int health, int level){
    this.name = "Unknown";
    if(health >= 0 && health <= 10){
        this.health = health;
    } else {
        System.out.println("Health number is not supported, it was instead set to default.");
        this.health = 0;
    }
        if(level >= 0 && level <= 5){
            this.level = level;
        } else {
            System.out.println("Level number is not supported,it was instead set to default");
            this.level = 0;
        }
}

public String getName(){
    return this.name;
}
public int getHealth(){
    return this.health;
}
public int getLevel(){
    return this.level;
}
public void levelUp(){
    if((this.level+1) > 5){
        System.out.println("Sorry you are already max level!");
    } else {
        this.level+=1;
    }
}

public void heal(int amount){
    if(amount<=0){
       return;
    }
    if((this.health+amount) > 10){
        System.out.println("You've been healed to the maximum amount!");
        this.health = 10;
    } else {
        this.health+=amount;
    }
}
@Override
public String toString() {
    return "Player stats:\nName:"+ this.name +"\nHealth:"+ this.health + "\nLevel:"+ this.level;
}}
