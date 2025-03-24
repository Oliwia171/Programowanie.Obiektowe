import java.util.Scanner;

public class Zadanie7 {
    public static void wykonaj() {
        Scanner scanner = new Scanner(System.in);
        String[] tekst1 = {"cukierki","lizak","czekolada"};
        String[] tekst2 = {"cukierki","lizak","czekolada"};
        boolean saTakieSame = true;
        for(int i=0;i< 3;i++){
            if(tekst1[i].length()!=tekst2[i].length()){
                saTakieSame=false;
                break;
            }
            for(int j=0;j<tekst1[i].length();j++){
                if(tekst2[i].charAt(j) != tekst1[i].charAt(j)){
                    saTakieSame=false;
                    break;
                }
            }
            if(saTakieSame){
                break;
            }
        }
        if(saTakieSame){
            System.out.print("teksty sa takie same.");

        }else{
            System.out.print("Teksty nie sa takie same");
        }
    }
}

