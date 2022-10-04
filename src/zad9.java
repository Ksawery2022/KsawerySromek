public class zad9 {
    public static void main(String[] args) {
        String firstName, middleName, lastName;
        char firstInitial, middleInitial, lastInitial;

        firstName="Ksawery";
        middleName="Grzegorz";
        lastName="Sromek";
        firstInitial = firstName.charAt(0);
        middleInitial=middleName.charAt(0);
        lastInitial=lastName.charAt(0);
        System.out.print("imie " + firstName);
        System.out.print(" drugie.imie " + middleName);
        System.out.print(" Nazwisko " + lastName);
        System.out.print(firstInitial + middleInitial + lastInitial);
    }
}