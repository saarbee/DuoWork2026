public class GameWorld  {
   private String name;
   private Player[] players;
   private Enemy[] enemies;
   private int difficulty;


    public GameWorld(String name, Player[] players,Enemy[] enemies,int difficulty){
        this.name = name;
        this.players = players;
        this.enemies = enemies;
        this.difficulty = difficulty;
    }

    public GameWorld(){
        this.name = "Crystalpath";
        this.players = new Player[0];
        this.enemies = new Enemy[0];
        this.difficulty = 1;
    }

    public void addPlayer(Player player){
        Player[] newp = new Player[players.length+1];
        for (int i = 0; i < players.length; i++) {
            newp[i] = players[i];
        }
        newp[players.length] = player;
        players = newp;
    }


    public void printAllPlayers(){
        for (int i = 0; i < players.length; i++) {
            if(players[i] != null){
                System.out.println("------Player " + (i + 1) + "------");
                System.out.println(players[i]);
            }
    }
    }

    public int getTotalValueOfWorld(){
        int sum = 0;
        for (int i = 0; i < players.length; i++) {
            if(players[i]!=null)
                sum+=players[i].calculateInventoryValue();
        }
        return sum;
    }

    public String toString(){
        int numOfPlayers = 0;
        for (int i = 0; i <players.length; i++) {
            if(players[i]!=null)
                numOfPlayers++;
        }
        return "World name: "+ name + "\n" + "Difficulty: " + difficulty + "\n" + "Number of players: " + numOfPlayers;
    }
}