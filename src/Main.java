import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {

//        //2. feladat
//        // A main függvényben írasd ki a hárommal osztható páros számokat egy sorba!(5p)
//        System.out.print("A számok: ");
//        for (int i = 6; i <= 100; i += 6) {
//            System.out.print(i + ", ");
//        }

//        //3. feladat
//        /* Készíts egy függvényt, amely egy számokat tároló tömbötvár paraméterül,
//         és logikai értékkel tér vissza annak függvényében,
//         hogy a paraméterül kapott tömb tartalmaz-e negatív számot! (containsNegative) (10p)
//         */
//        int[] array = new int[10];        //random tömb a 3-as és 4-es feladathoz
//        for (int i = 0; i < 10; i++) {
//            array[i] = ThreadLocalRandom.current().nextInt(-10, 100);
//        }
//        System.out.println(Arrays.toString(array));     //The random array for test
//
//        System.out.println("Tartalmaz a tömb negatív számot: " + containsNegative(array));

//        //4. feladat
//        /* Készíts egy függvényt, ami egy számokkal feltöltött tömböt vár paraméterül.
//         A függvény adja vissza a tömbben található legnagyobb páros számot! (10p)
//         */
//        System.out.println("A tömb legnagyobb páros száma: " + biggestEven(array));
//
//        //5. feladat
//        System.out.println("Add meg a két öszeadandó számot!:");
//        Scanner ac = new Scanner(System.in);
//        int a = ac.nextInt();
//        Scanner bc = new Scanner(System.in);
//        int b = bc.nextInt();
//        int d = (int) Calculator.sum(a,b);
//        System.out.println("Az eredmény: " + d);

        //6. feladat
        System.out.println("Add meg a tömb n x m méretét!");
        Scanner cc = new Scanner(System.in);
        System.out.print("n = ");
        int n = cc.nextInt();
        System.out.print("m = ");
        int m = cc.nextInt();
        long [][] arr3 = new long[n][m];
        long k = 1l;
        for (int i = 0; i < arr3.length; i++) {
            System.out.println(" ");
            for (int j = 0; j < arr3[i].length; j++) {
                arr3[i][j] = k;
                System.out.print(arr3[i][j] + " ");
                k *= 3;
            }
        }



    }

    /**
     * Megadja, hogy van-e a tömbben negatív szám.
     *
     * @param array
     * @return true, ha nincs false
     */
    public static boolean containsNegative(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                return true;
            }
        }
        return false;
    }

    /**
     * Megadja a tömb legnagyobb páros számát
     *
     * @param array - bemeneti 1D tömb
     * @return ha nincs páros szám  tömbben akkor -1, amúgy a legnagyobb páros szám
     */
    public static int biggestEven(int[] array) {
        int j = -1;

        for (int i = 0; i < array.length; i++) {        //első páros elem értéke
            if (array[i] % 2 == 0) {
                j = array[i];
                break;
            }
        }

        for (int i = 1; i < array.length; i++) {
            if (array[i] % 2 == 0 && array[i] > j) {
                j = array[i];
            }
        }

        j = (j % 2 == 0 ? j : -1);
        return j;
    }

}