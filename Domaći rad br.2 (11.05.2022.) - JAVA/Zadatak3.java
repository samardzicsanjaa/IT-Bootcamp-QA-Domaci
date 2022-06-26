package domacirad.DrugaNedelja;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {

        // 3. Написати програм који исписује збир свих унетих бројева док се не унесе 0.

        Scanner s = new Scanner(System.in);

        System.out.print("Unesite broj: ");

        int n = s.nextInt();
        int sum = 0;

        while (n != 0) {

            sum = sum + n;
            System.out.print("Zbir je: " + sum + ". " + "\nUnesite sledeci broj: ");
            n = s.nextInt();
        }
        System.out.println("Kraj.");

    }

}
















