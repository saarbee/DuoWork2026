package part3;

public class Horse extends Thread {
    String name;
    int distance;
    FinishingLine f;

    public Horse(String name,FinishingLine f,int distance) {
        this.name = name;
        this.distance = distance;
        this.f = f;
    }
    @Override
    public void run(){
        while(distance>=0){
        try {
            Thread.sleep(1000);
        }
        catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
            System.out.println(this.name + ":          "+ distance +" meters to finish");
        this.distance -= (int)(Math.random()*21);
        }
        this.f.arrive(this);
    }
    public String getHorseName(){ return this.name;
    }
}
