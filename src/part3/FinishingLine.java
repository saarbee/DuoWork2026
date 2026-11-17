package part3;

public class FinishingLine {
private int finishedPlayers = 1;
    public synchronized void arrive(Horse h){
        if(finishedPlayers==1) {
            finishedPlayers++;
            System.out.println("**********************");
            System.out.println("========> " + h.name + " Finished first!");
            System.out.println("**********************");
        } else {

            System.out.println("========> "+h.name+" finished on the "+ finishedPlayers++ +"-th place");

         //   finishedPlayers++;
        }
    }
}
