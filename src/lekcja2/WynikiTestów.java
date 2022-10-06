package lekcja2;

import java.util.Scanner;

public class WynikiTestów {
    public static void main(String[] args) {

        int ocena1, ocena2, ocena3;
        int iloscOcen = 3;
        double srednia1, srednia2;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj ocenę 1");
        ocena1 = scanner.nextInt();
        System.out.println("Podaj ocenę 2");
        ocena2 = scanner.nextInt();
        System.out.println("Podaj ocenę 3");
        ocena3 = scanner.nextInt();

        srednia1 = (((ocena1 + ocena2 + ocena3) / iloscOcen) * 100);
        srednia2 = (srednia1 / 5);
        System.out.println("Twoja średnia wynosi:" + srednia2 + "%");
        if (srednia2 >= 90)
            System.out.println("Elegancko, ocena 5");
        else if (srednia2 >= 80)
            System.out.println("Dobrze, ocena 4");
        else if (srednia2 >= 70)
            System.out.println("ocena 3");
        else if (srednia2 >= 60)
            System.out.println("słabo, ocena 2");
        else if (srednia2 < 60)
            System.out.println("źle, ocena 1");
    }
}

