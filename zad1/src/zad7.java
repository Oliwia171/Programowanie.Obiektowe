import java.util.Scanner;
import static java.lang.Math.*;
public class zad7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj a ( przyprostokatna): ");
        int a = scanner.nextInt();
        if (a<=0){
            System.out.println("nieprawidlowa liczba");
        }
        System.out.println("Podaj b (przyprostokatna) : ");
        int b = scanner.nextInt();
        if (b<=0){
            System.out.println("Nieprawidlowa liczba");
        }
        System.out.println("Podaj c (przeciwprostokatna) : " );
        int c = scanner.nextInt();
        if (c<=0) {
            System.out.println("Nieprawidlowa liczba");
        }
        if (a*a + b*b == c*c){
            System.out.println("True");
        }
        else{
            System.out.println("false");
        }

    }
}
