import java.util.Scanner;
public class zad3 {
    public static void main(String[] args) {
        int elementy = 0, liczba = 0, suma = 0;
        System.out.print("Podaj liczbe elementow ciagu (n>0): ");
        Scanner input = new Scanner(System.in);
        elementy = input.nextInt();
        do {
            System.out.print("\nPodaj liczbe ciagu: ");
            liczba = input.nextInt();
            if (liczba % 2 == 0) {
                suma += liczba;
            }
            elementy--;
        } while (elementy > 0);
        System.out.print("\nSrednia liczb parzystych ciagu to: " + suma);
    }

}

