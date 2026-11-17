public class Main {
    public static void main(String[] args){
        Item[] items = new Item[2];
        items[0] = new Item("Long Sword",5,true);
        items[1] = new Item("Bow",3,false);
        Player[] players = new Player[2];
        players[0] = new Player("Saar",100,5,items);
        players[1] = new Player("Daniel",100,5);
        Enemy[] enemies = new Enemy[2];
        enemies[0] = new Enemy("Snake",5,3,3);
        enemies[1] = new Enemy("Lion",5,4,3);
        GameWorld world = new GameWorld("Earth",players,enemies,3);
        world.printAllPlayers();
        for (int i = 0; i < players.length; i++) {
            if(players[i]!=null){
                System.out.println(players[i].getName());
                System.out.println(players[i].calculateInventoryValue());
            }}
        simulateBattle(players[0],enemies[1]);
        simulateBattle(players[1],enemies[0]);
    }

    static void  simulateBattle(Player player,Enemy enemy){
        String winner;
        if(player.getLevel() == enemy.getLevel()){
            System.out.println("Could not simulate a fight, they are both level "+player.getLevel());
            return;
        }
        if(player.getLevel() > enemy.getLevel()){
            player.levelUp();
            winner = player.getName();
        } else {
            enemy.levelUp();
            winner = enemy.getName();
        }
        System.out.println(player.getName() +" Level "+ player.getLevel()+ " VS "+enemy.getName() +" " + "Level " +enemy.getLevel());
        System.out.println(winner+" Wins!");
    }

}
