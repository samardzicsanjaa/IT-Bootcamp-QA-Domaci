package domacirad.DrugaNedelja;

import java.util.Scanner;

public class Zadatak1 {

    public static void main(String[] args) {

        /* 1. Написати програм који исписује парне природне бројеве до унетог броја
        Природни бројеви су сви цели бројеви већи од 0 - {1,2,...} */


        Scanner sc = new Scanner(System.in);
        System.out.println("Prirodni brojevi");

        System.out.print("Unesi n: ");
        int n = sc.nextInt();
        int i = 0;

        while (i <= n) {
            if (i % 2 == 0)
                System.out.println(i);
            i++;

        }
    }

}
