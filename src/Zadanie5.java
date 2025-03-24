import java.util.Scanner;
import java.util.Arrays;
public class Zadanie5 {
    public static void wykonaj() {
        int [] tab = new int [8];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj 8 liczb calkowitych : \n");
        for(int k =0; k<= 7;k++) {
            System.out.println("Podaj liczbe "+(k+1)+ ":");
            tab[k] = scanner.nextInt();
        }
       Arrays.sort(tab);
        System.out.println("Posortowana tablica to :");
        System.out.println(Arrays.toString(tab));
    }
}
