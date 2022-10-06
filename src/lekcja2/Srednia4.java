package lekcja2;

import java.util.Scanner;

public class Srednia4 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        System.out.println("podaj dowolną liczbę z przedziału 1-10");
        int l1 = klawiatura.nextInt();
        klawiatura.nextLine();



        String liczba1 = "I",liczba2 = "II", liczba3 = "III", liczba4 = "IV", liczba5 = "V", liczba6 = "VI", liczba7 = "VII", liczba8 = "VIII", liczba9 = "IX",liczba10 = "X";


        if(l1 == 1) {
            System.out.println("Liczba rzymska " + liczba1);
        } else if(l1 == 2)  {
            System.out.println("Liczba rzymska" + liczba2);
        } else if(l1 == 3) {
            System.out.println("Liczba rzymska" + liczba3);
        } else if(l1 == 4) {
            System.out.println("Liczba rzymska" + liczba4);
        } else if(l1 == 5) {
            System.out.println("Liczba rzymska" + liczba5);
        } else if(l1 == 6) {
            System.out.println("Liczba rzymska" + liczba6);
        } else if(l1 == 7) {
            System.out.println("Liczba rzymska" + liczba7);
        } else if(l1 == 8) {
            System.out.println("Liczba rzymska" + liczba8);
        } else if(l1 == 9) {
            System.out.println("Liczba rzymska" + liczba9);
        } else if(l1 == 10) {
            System.out.println("Liczba rzymska" + liczba10);
        }
            else {
                System.out.println("Nieprzewidziane dane błąd 404" );
         }
    }
}



