import java.util.Scanner;

public class zad2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int liczbyd=0; int liczbyu=0;
        int i=1;
        while (i<=10) {
            System.out.println("Podaj liczbe :");
            int licz1 = scanner.nextInt();
            if(licz1>=0){
                liczbyd=liczbyd+licz1;
            }
            else {
                liczbyu=liczbyu+licz1;
            }
            i++;
        }
        System.out.println("Suma liczb ujemnych : " + (liczbyu));
        System.out.println("Suma liczb dodatnich : " + (liczbyd));


    }

}
