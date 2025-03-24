public class Zadanie2 {

    public static void wykonaj() {
        int[] tab1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] tab2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

        for (int i = 0; i != tab1.length; i++) {
            if (i % 2 == 0) {
                System.out.print("\n" + i + " element tablicy 'tab1': " + tab1[i]);
            }
        }
        System.out.print("\n----------------------------------------------------");
        for (int i = 0; i != tab2.length; i++) {
            if (i % 2 == 0) {
                System.out.print("\n" + i + " element tablicy 'tab2': " + tab2[i]);
            }
        }
    }
}
