package domacirad.DrugaNedelja;

import java.util.Scanner;

public class Zadatak4b {
    public static void main(String[] args) {

        /* 4b. Написати програм који исписује следеће структуре:
         * Правоугаоник */

        Scanner s = new Scanner(System.in);

        System.out.print("Unesite b: ");
        int n = s.nextInt(); // b = 4, b = 6

        System.out.print("Unesite a: ");
        int m = s.nextInt(); // a = 5, a = 2

        String sum = "#";

        System.out.println();
        System.out.println("Pravougaonik");

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                System.out.print(sum);
            }
            System.out.println();
        }


    }
}

