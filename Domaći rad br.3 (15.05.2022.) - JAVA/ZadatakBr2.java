package domacirad.domaciRadZaNedelju;

import java.util.Scanner;

public class ZadatakBr2 {

    public static void main(String[] args) {

        /* 2. Ovaj zadatak je vezba i ne morate da ga uradite ukoliko vam je tezak:
         * Napisati program koji ce ispisati n brojeva Fibonacijevog niza.
         * Sta je Fibonacijev niz, slobodno proverite na internetu.
         *  */

        Scanner s = new Scanner(System.in);

        System.out.print("Unesite broj: ");
        int n = s.nextInt();
        int[] fniz = new int[n];

        System.out.println("Fibonacijev niz");

        fniz[0] = 0;
        System.out.println(fniz[0]);
        fniz[1] = 1;
        System.out.println(fniz[1]);

        for (int i = 2; i < fniz.length; i++) {
            fniz[i] = fniz[i - 1] + fniz[i - 2];
            System.out.println(fniz[i]);
        }

    }

}
