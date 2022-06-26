package OOPdomaci2;

import java.util.Scanner;

public class TestStudent {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        //  Student student01 = new Student("Jovan","Jovanovic","Prirodni smer", 123, 52);
        // System.out.println(student01.informacijeOStudentu());
        Student student02 = new Student();
        // student02.setRezultatiUProcentima(34);
        // System.out.println(student02.rezultatiIspita());
        System.out.print("Unesite svoje ime: ");
        student02.setIme(s.nextLine());
        System.out.print("Unesite svoje prezime: ");
        student02.setPrezime(s.nextLine());
        System.out.print("Unesite smer: ");
        student02.setSmer(s.nextLine());
        System.out.print("Unesite broj indexa: ");
        student02.setBrIndexa(s.nextInt());
        System.out.print("Unesite rezultat ispita: ");
        student02.setRezultatiUProcentima(s.nextDouble());
        System.out.println(student02.rezultatiIspita());
        System.out.println("------------------------");
        System.out.println(student02.informacijeOStudentu());


    }

}
