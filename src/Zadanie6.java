import java.util.Scanner;
import java.util.Arrays;
public class Zadanie6 {
    public static void wykonaj() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Obliczanie silni z kazdej z podanych liczb ");
        int[] tab = new int[5];

        for (int i = 0; i <= 4; i++) {
            System.out.println("Podaj liczbe " + (i + 1) + ":");
            tab[i] = scanner.nextInt();
        }
        for (int j = 0; j < tab.length; j++) {
            int silnia = 1;
            for (int m = 1; m <= tab[j]; m++) {
                silnia = silnia * m;
            }
            System.out.println("Silnia liczby "+tab[j]+" wynosi:  " + silnia);


        }
    }
}
