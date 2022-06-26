package domacirad.Funkcije;

import java.util.Scanner;

public class ZadatakCodeWars {


    // https://www.codewars.com/kata/55ecd718f46fba02e5000029/java


    public static int[] between(int a, int b) {
        int duzinaNiza = b - a + 1;
        int[] niz = new int[duzinaNiza];
        int j = 0;
        for (int i = a; i <= b; i++) {
            niz[j] = i;
            System.out.print(niz[j] + " ");
            j++;
        }

        return niz;
    }


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();

        between(a, b);


    }


}





