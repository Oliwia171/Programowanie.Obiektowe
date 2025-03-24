import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Wybierz numer zadania (2-7): ");
        int wybor = scanner.nextInt();

        switch (wybor) {
            case 2:
                Zadanie2.wykonaj();
                break;
            case 3:
                Zadanie3.wykonaj();
                break;

            case 4:
                Zadanie4.wykonaj();
                break;
            case 5:
                Zadanie5.wykonaj();
                break;

            case 6:
                Zadanie6.wykonaj();
                break;
            case 7:
                Zadanie7.wykonaj();
                break;

            default:
                System.out.println("Niepoprawny numer zadania!");
        }

        scanner.close();  // Zamykamy Scanner, aby uniknąć wycieków pamięci
    }
}