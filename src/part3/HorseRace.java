package part3;

import java.util.Scanner;

public class HorseRace {
    public static void main(String[] args) {
        FinishingLine a = new FinishingLine();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter distance:");
        int distance = sc.nextInt();
        Horse[] horses = {
                new Horse("Saar", a, distance),
                new Horse("Daniel", a, distance),
                new Horse("Ilay", a, distance),
                new Horse("Vadim", a, distance),
                new Horse("Noa", a, distance),
                new Horse("Noam", a, distance),
                new Horse("Natalie", a, distance),
                new Horse("Sabin", a, distance),
                new Horse("Ayal", a, distance),
                new Horse("Matan", a, distance)
        };
        for (Horse horse: horses)
        horse.start();
    }
}
