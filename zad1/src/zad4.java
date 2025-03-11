import java.util.Scanner;
public class zad4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe :");
        int liczba = scanner.nextInt();

        if ((liczba % 5 == 0 && liczba % 3 == 0)) {
            System.out.println("Liczba jest podzielna przez 3 i 5 " );
        } else {
            System.out.println("liczba nie jest podzielna przez 3 i 5");
        }
    }
}