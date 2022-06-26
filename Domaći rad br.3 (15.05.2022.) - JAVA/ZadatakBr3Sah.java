package domacirad.domaciRadZaNedelju;

import java.util.Scanner;

public class ZadatakBr3Sah {
    public static void main(String[] args) {
        /*
         * Navodimo figure svakog igraca
         * Figure su: Pesak, Lovac, Konj, Top, Kraljica
         * Vrednosti:  1       3     3     5      12
         *
         * 1. Korisnik unosi koliko igrac1 ima figura
         * 2. Unosi imena tih figura (igraca 1)
         * 3. Unosi koliko igrac2 ima figura
         * 4. Unosi mena tih figura (igraca 2)
         * 5. Ispisujete ko ima bolju poziciju. Bolju poziciju ima igrac sa vecom sumom vrednosti
         *       svojih figura
         *
         * Primer:
         * Igrac 1: Pesak, Konj, Pesak, Top  (10)
         * Igrac 2: Pesak, Kraljica, Top, Pesak, Lovac  (22)
         * Dakle, Igrac 2 ima bolju poziciju.
         * */

        Scanner s = new Scanner(System.in);

        System.out.print("Unesite koliko Igrac 1 ima figura: ");
        int n = s.nextInt();
        String[] figure = new String[n];
        System.out.println("Unesite ime figure:");
        int suma1 = 0;
        for (int i = 0; i < figure.length; i++) {
            figure[i] = s.next();

            switch (figure[i]) {
                case "pesak":
                    suma1 = suma1 + 1;
                    break;
                case "lovac":
                    suma1 = suma1 + 3;
                    break;
                case "konj":
                    suma1 = suma1 + 3;
                    break;
                case "top":
                    suma1 = suma1 + 5;
                    break;
            }

            System.out.println("Unesite ime figure: ");

        }

        System.out.print("Unesite koliko Igrac 2 ima figura: ");
        int m = s.nextInt();
        String[] figure2 = new String[m];

        System.out.println("Unesite ime figure: ");
        int suma2 = 0;

        for (int i = 0; i < figure2.length; i++) {
            figure2[i] = s.next();

            switch (figure2[i]) {
                case "pesak":
                    suma2 = suma2 + 1;
                    break;
                case "lovac":
                    suma2 = suma2 + 3;
                    break;
                case "konj":
                    suma2 = suma2 + 3;
                    break;
                case "top":
                    suma2 = suma2 + 5;
                    break;
                case "kraljica":
                    suma2 = suma2 + 10;
                    break;
            }
            System.out.println("Unesite ime figure: ");

        }

        if (suma2 > suma1) {
            System.out.println("Igrac 2 ima bolju poziciju.");
        } else if (suma1 > suma2) {
            System.out.println("Igrac 1 ima bolju poziciju.");
        } else {
            System.out.println("Imaju jednake vrednosti. ");
        }


    }


}











