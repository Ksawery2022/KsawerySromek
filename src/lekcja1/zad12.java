package lekcja1;

import java.util.Scanner;
public class zad12 {
    public static void main(String[] args) {

        Scanner klawiatura = new Scanner(System.in);

            System.out.println("Podaj ilość zjedzonych ciasteczek:");
        int ciasteczkailość = klawiatura.nextInt();
        klawiatura.nextLine();

        int box,boxportion,calories,calories2;
        box = 40;
        boxportion = 4;
        calories = 300;
        calories2 = 300/4;
        System.out.println("Ilość spożytych kalorii " + ciasteczkailość * calories2);


    }
}
