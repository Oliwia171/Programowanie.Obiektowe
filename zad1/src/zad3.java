import java.util.Scanner;
public class zad3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe : ");
        int liczba = scanner.nextInt();
        System.out.println("Czy liczba jest parzysta : " + (liczba % 2 ==0));

    }
}
