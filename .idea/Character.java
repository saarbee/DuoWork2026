public class Character {
    private String name;
    private int health;
    private int level;

    public Character() {
        this.name = "Unknown";
        this.health = 0;
        this.level = 0;
    }

    public Character(String name, int health, int level) {
        this.name = name;
        this.health = checkRange(health, 0, 10);
        this.level = checkRange(level, 0, 5);
    }


    private int checkRange(int num, int min, int max) {
        if (num < min) return min;
        if (num > max) return max;
        return num;
    }

    public String getName()  { return name; }
    public int getHealth()   { return health; }
    public int getLevel()    { return level; }

    public void levelUp() {
        if (level < 5) {
            level++;
        }
    }

    public void heal(int amount) {
        health = checkRange(health + amount, 0, 10);
    }

    public String toString() {
        return "Name: " + name + "\n" + "Health: " + health + "\n" + "Level: " + level;
    }
}