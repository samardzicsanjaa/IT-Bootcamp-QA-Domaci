package domacirad;

import java.util.Scanner;

public class zadatak2 {
    public static void main(String[] args) {
        Scanner sken = new Scanner(System.in);

        System.out.println("Unesite redni broj dana");

        int x = sken.nextInt();

        if(x >= 1 && x <= 5) {
            System.out.println("Nije vikend :(");
        }
        else if(x == 6 || x == 7) {
            System.out.println("Vikend :)");
        }
        else {
            System.out.println("Unos nije korektan!");
        }

    }

}
