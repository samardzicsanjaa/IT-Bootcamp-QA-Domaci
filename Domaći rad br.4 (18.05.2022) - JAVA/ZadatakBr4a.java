package domacirad.Funkcije;

import java.util.Scanner;

public class ZadatakBr4a {

    /*
        4. Написати функцију која:
        Проверава да ли низ има дупликата

        hasDuplicates([1,2,3,4,5]) -> false
        hasDuplicates([1,2,3,1]) -> true
        hasDuplicates([1,1,1,1,1]) -> true
        hasDuplicates([]) -> false
     */

    public static boolean duplikati(int[] niz) {
        boolean duplikat = false;
        for (int i = 0; i < niz.length; i++) {
            for (int j = i + 1; j < niz.length; j++) {
                if (niz[i] == niz[j]) {
                    return true;
                }
            }
        }

        return duplikat;
    }


    public static void main(String[] args) {

        int[] niz = {1, 33, 33, 5, 13};
        System.out.println(duplikati(niz));
    }


}
