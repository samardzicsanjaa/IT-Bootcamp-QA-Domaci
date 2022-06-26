package domacirad.Funkcije;

import java.util.Scanner;

public class ZadatakBr2 {

    /*
        2. Написати функцију која враћа true/false у зависности од тога да ли је година преступна или није
        Искористити услове од раније
        isLeapYear(1996) -> true
        isLeapYear(2000) -> true
        isLeapYear(1997) -> false
        isLeapYear(1900) -> false

     */

    public static boolean daLiJeGodinaPrestpunaIliNije(int godina) {

        if (godina % 4 == 0 && (godina % 400 == 0 || godina % 100 != 0)) {
            return true;
        } else {
            return false;
        }
    }


    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Unesite godinu: ");
        int godina = s.nextInt();

        boolean prestupnaGodinailiNe = daLiJeGodinaPrestpunaIliNije(godina);

        if (prestupnaGodinailiNe) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }


    }

}
