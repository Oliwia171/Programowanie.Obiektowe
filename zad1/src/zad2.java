import java.util.Scanner;
public class zad2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwsza liczbe :");
        int licz1 = scanner.nextInt();
        System.out.println("Podaj druga liczbe :");
        int licz2 = scanner.nextInt();

        System.out.println("Suma wynosi : " + (licz1 + licz2));
        System.out.println("Różnica wynosi : " + (licz1 - licz2));
        System.out.println("Iloczyn wynosi :" + (licz1 * licz2));
    }
}
