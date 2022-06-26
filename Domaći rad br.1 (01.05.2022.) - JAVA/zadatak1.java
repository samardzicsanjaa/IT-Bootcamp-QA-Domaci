package domacirad;

import java.util.Scanner;

public class zadatak1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dobrodosli u pivnicu ITBC, koliko imate godina?");

        int x = sc.nextInt();


        if (x < 18 && x > 0) {
            System.out.println("Za Vas imamo bezalkoholna pica.");
        } else if (x >= 18 && x < 100) {
            System.out.println("Za Vas imamo odlicno psenicno pivo.");
        }
        else {
            System.out.println("Unos nije korektan!");
        }

    }
}
