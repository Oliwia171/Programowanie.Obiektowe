import java.util.Scanner;
import static java.lang.Math.*;
public class zad6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe : ");
        int liczba = scanner.nextInt();
        System.out.println("Pierwiastek kwadratowy wynosi : " + Math.sqrt(liczba));
}
}