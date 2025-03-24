import java.util.Scanner;

public class Zadanie4 {
    public static void wykonaj() {
        String[] tab = new String[5];
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj piec slow\n    \n");
        for (int i = 0; i < 5; i++) {
            System.out.print("\nPodaj slowo: ");
            tab[i] = scanner.next();
        }
        for (int i = 4; i >= 0; i--) {
            for (int j = tab[i].length() - 1; j >= 0; j--) {
                System.out.print(tab[i].charAt(j));
            }
            System.out.println();
        }
    }
}


