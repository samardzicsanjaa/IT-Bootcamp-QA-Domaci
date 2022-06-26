package domacirad.DrugaNedelja;

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {

        /* 2. Написати збир целих бројева од N до M (Укључујући оба)
         * N и M се уносе са тастатуре
         * Напомена: N може бити и мање од M */

        Scanner sk = new Scanner(System.in);

        System.out.print("Unesi N: ");
        int n = sk.nextInt();
        System.out.print("Unesi M: ");
        int m = sk.nextInt();

        int sum = 0;

        if (n <= m) {
            for (int i = n; i <= m; i++) {
                sum += i;
            }
        } else {
            for (int i = m; i <= n; i++) {
                sum += i;
            }
        }

        System.out.println("Zbir N i M je: " + sum);


    }

}

