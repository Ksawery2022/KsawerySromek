package lekcja2;

import java.util.Scanner;

public class MagiczneDaty {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("numer dnia (forma 00): ");
        int numerdnia = keyboard.nextInt();

        System.out.println("numer miesiąca(forma 00): ");
        int numermiesiąca = keyboard.nextInt();

        System.out.println("Podaj dwie ostanit cyfry roku (forma 00): ");
        int ostatniecyfryroku = keyboard.nextInt();

        if(numerdnia * numermiesiąca == ostatniecyfryroku) {
            System.out.println("Data magiczna");
        }
        else {
            System.out.println("Data nie magiczna");
        }
    }
}
