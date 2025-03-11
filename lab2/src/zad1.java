import java.util.Scanner;

public class zad1 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Podaj liczbe studentow :");
            int liczbas = scanner.nextInt();
            int srednia=0;
            int i=1;
            while(i<=liczbas)
            {
                System.out.println("Podaj punkty studenta :");
                int licz1 = scanner.nextInt();
                srednia=srednia+licz1;
                i++;
            }
            int srednia2;
            srednia2=srednia/liczbas;
            System.out.println("Srednia liczba punktow studentow wynosi : " + (srednia2));

    }
}
