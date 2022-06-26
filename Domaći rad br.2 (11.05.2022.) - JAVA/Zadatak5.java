package domacirad.DrugaNedelja;

import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {

        /* 5. Написати програм који исписује природне бројеве до унетог броја на сл. начин
         * Ако је број дељив са 3 - Исписујемо Fizz
         * Ако је број дељив са 5 - Исписујемо Buzz
         * Ако је број дељив са 3 и са 5 - Исписујемо FizzBuzz
         * Ако није испуњен ни један услов изнад - Исписујемо тај броj. */

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite broj: ");
        int x = sc.nextInt();
        int i = 1;

        while (i <= x) {

            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
            i++;
        }

    }

}
