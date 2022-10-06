package lekcja2;

import java.util.Scanner;

public class BMI {
    private static int BMI = 1;

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Podaj wagę ");
        double Waga = keyboard.nextDouble();
        System.out.println("Podaj wzrost ");
        double wzrost = keyboard.nextDouble();


       double bmi = Waga / (wzrost * wzrost);
       if (bmi<18.5){
           System.out.println("niedowaga");

       } else if (bmi>25){
            System.out.println("nadwaga");

       } else {
            System.out.println("OK");
       }

    }
}
