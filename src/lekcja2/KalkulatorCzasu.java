package lekcja2;

import java.io.PrintStream;
import java.util.Scanner;

public class KalkulatorCzasu {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Podaj sekundy:");
        double time = keyboard.nextDouble();
        double time1,time2,time3;
        time1=0;
        time2=0;
        time3=0;
        if (time >59){
            time1 = time/60;
        }
        if  (time > 3599){
            time2 = time/3600;
        }
        if (time > 86400){
            time3 = time/86400;
        }
        System.out.println("Ilość Czasu to: " + (int)time + "sek");
        System.out.println("Ilość Czasu to: " + (int)time1 + "min");
        System.out.println("Ilość Czasu to: " + (int)time2 + "h");
        System.out.println("Ilość Czasu to: " + (int) time3 + "dni");
    }
}