package domacirad;

import java.util.Scanner;

public class zadatak3 {

    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        System.out.println("Unesite godinu koju zelite da proverite.");

        int x = ss.nextInt();

        if(x % 4 == 0) {
            System.out.println("Godina jeste prestupna.");
        }
        else if(x % 400 == 0 && x % 100 != 0) {
          System.out.println("Godina jeste prestupna.");
        }
        else {
            System.out.println("Godina nije prestupna.");
        }






    }
}
