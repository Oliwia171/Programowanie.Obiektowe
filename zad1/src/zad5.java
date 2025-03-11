import java.util.Scanner;
import static java.lang.Math.pow;

public class zad5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbe :");
        int liczba = scanner.nextInt();
        System.out.println(pow(liczba,3)); // drugi sposob
        System.out.println(pow(liczba,9));
        System.out.println("Liczba do potęgi 3 wynosi : " + (liczba * liczba * liczba));
    }
}
