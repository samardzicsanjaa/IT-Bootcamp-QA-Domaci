package OOPdomaci4.Zadatak2;

import java.util.ArrayList;

public class GlavnaKlasa {

    public static void main(String[] args) {

        /*
        Kreirati glavnu klasu I u njoj:
        - instancirati jednu planinu
        - napraviti niz koji ce sadrzati tri rekrativna planinara I tri alpiniste
        - ispisati podatke o svim planinarima I za svakog od planinara ispisati da li ce se popeti na instanciranu planinu
        - ispisati kolika je zbir svih clanarina planinara iz niza
         */

        Planina tara = new Planina("Tara", "Srbija", 1496);
        RekretivniPlaninar planinar1 = new RekretivniPlaninar("Jovan", "Jovanovic", 20, "Sremski okrug", 1000);
        RekretivniPlaninar planinar2 = new RekretivniPlaninar("Ivana", "Ivanovic", 10, "Zlatiborski okrug", 900);
        RekretivniPlaninar planinar3 = new RekretivniPlaninar("Nikola", "Nikolic", 18, "Macvanski okrug", 1500);

        Alpinista alpinista1 = new Alpinista("Marija", "Maric", 3);
        Alpinista alpinista2 = new Alpinista("Nenad", "Boskovic", 2);
        Alpinista alpinista3 = new Alpinista("Bojan", "Bojanic", 1);

        ArrayList<Planinar> lista = new ArrayList<>();
        lista.add(planinar1);
        lista.add(planinar2);
        lista.add(planinar3);
        lista.add(alpinista1);
        lista.add(alpinista2);
        lista.add(alpinista3);

        int zbir = 0;
        for (Planinar p : lista) {
            p.stampaj();
            System.out.println(p.uspesanUspon(tara));
            zbir += p.clanarine();
        }
        System.out.println("Zbir svih clanarina planinara je: " + zbir);


    }


}
