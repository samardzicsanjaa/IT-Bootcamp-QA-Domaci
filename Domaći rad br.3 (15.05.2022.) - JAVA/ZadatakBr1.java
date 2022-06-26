package domacirad.domaciRadZaNedelju;

import java.util.Scanner;

public class ZadatakBr1 {
    public static void main(String[] args) {

        /* 1. Napisati program koji od korisnika traži
         * da unese neki datum i da ispiše koji je to po redu dan u godini.
         * Za izračunavanje definisati i koristiti niz.
         */


        Scanner s = new Scanner(System.in);

        System.out.print("Unesite dan u mesecu: ");
        int[] daniUMesecu = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int d = s.nextInt(); // dani

        System.out.print("Unesite mesec u godini: ");
        int[] mesecUGodini = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        int m = s.nextInt(); // meseci

        int ukupanBrojDana = 0;
        for (int i = 1; i < m; i++) {
            ukupanBrojDana = ukupanBrojDana + daniUMesecu[i];
        }
        ukupanBrojDana = ukupanBrojDana + d;

        System.out.println("Rezultat: Izabrani dan je " + ukupanBrojDana + " dan u godini.");


    }


}
