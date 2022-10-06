package lekcja2;

import java.util.Scanner;

public class MasaICiężar {
    public static void main(String[] args) {
            Scanner keyboard = new Scanner(System.in);
            System.out.println("Podaj masę ");
            double masa = keyboard.nextDouble();

            if (masa<10){
                System.out.println("obiekt jest za lekki");

            } else if (masa>1000){
                System.out.println("obiekt jest zbyt cieżki");

            } else {
                System.out.println("OK");
            }

        }
    }

