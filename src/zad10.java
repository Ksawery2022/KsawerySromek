import java.util.Scanner;
public class zad10 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        System.out.println("Podaj cenę");
        int cena = klawiatura.nextInt();
        klawiatura.nextLine();

        int podateklokalny, podatekstanowy;
        podateklokalny = 2;
        podatekstanowy = 4;
        int podatki = (podateklokalny + podatekstanowy + 100);
        System.out.println("cena:" + (cena * podatki));
        System.out.println("cena bez podatków" + cena);

    }
}