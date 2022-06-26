package domacirad.DrugaNedelja;

import java.util.Scanner;

public class Zadatak4a {
    public static void main(String[] args) {

        /* 4a. Написати програм који исписује следеће структуре:
         * Квадрат */


        Scanner s = new Scanner(System.in);

        System.out.print("Unesite N: ");
        int n = s.nextInt(); // n = 4, n = 3

        String sum = "#";

        System.out.println();
        System.out.println("Kvadrat");

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(sum);
            }

            System.out.println();
        }

    }
}

