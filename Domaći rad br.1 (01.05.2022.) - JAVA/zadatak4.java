package domacirad;

import java.util.Scanner;

public class zadatak4 {
    public static void main(String[] args) {
        Scanner sce = new Scanner(System.in);
        System.out.println("Koliko uneti mesec ima dana?");

        int x = sce.nextInt(); // mesec

        if (x == 2) {
            System.out.println("Unesite godinu");

            int y = sce.nextInt(); // godina

            if (y % 4 == 0 || y % (400 == 0 && y % 100 != 0)) {
                System.out.println("Ima 29 dana.");
            } else {
                System.out.println("Ima 28 dana.");
            }
        }
        else if (x == 4 || x == 6 || x == 9 || x == 11) {
            System.out.println("Ima 30 dana.");
        }
        else if (x > 0 && x <= 12) {
            System.out.println("Ima 31 dan.");
        }
        else {
            System.out.println("Unesite broj");
        }
    }

}
