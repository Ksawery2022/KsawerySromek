import java.util.Scanner;
public class kilometry {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Podaj ilość przejechanych kilometrów");
        int kilometryprzejechane = klawiatura.nextInt();
        klawiatura.nextLine();

        System.out.println("Podaj ilość spalonego paliwa");
        double fuelspalone = klawiatura.nextDouble();
        klawiatura.nextLine();
        System.out.println("Liczba przejechanych kilometrów"
            + kilometryprzejechane / fuelspalone + "km");
    }
}
