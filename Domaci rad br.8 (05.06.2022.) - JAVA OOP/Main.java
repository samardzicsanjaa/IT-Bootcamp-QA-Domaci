package OOPdomaci4.Zadatak1;


public class Main {

    public static void main(String[] args) {

        Putnik putnik = new Putnik("Jovan", "Jovanovic", 350);
        putnik.dodajNovac(100);
        System.out.println(putnik.getNovacPutnika());
        System.out.println("---------------------------");
        Putnik putnik0 = new Putnik("Jovana", "Jovic", 0);
        putnik0.oduzmiNovac(200);
        System.out.println(putnik0.getNovacPutnika());

        // putnik.oduzmiNovac();
        // System.out.println(putnik.getNovacPutnika());
        System.out.println("-------------------------------");

        Autobus banbus = new Autobus("Banbus", 530);
        Vozac vozacAutobusa = new Vozac("Nikola", "Nikolic");
        banbus.dodajVozaca(vozacAutobusa);
        Putnik putnik1 = new Putnik("Marija", "Nikolic", 2430);
        banbus.dodajPutnika(putnik1);
        Putnik putnik2 = new Putnik("Bojan", "Bojanic", 550);
        banbus.dodajPutnika(putnik2);
        Putnik putnik3 = new Putnik("Ivana", "Ivanovic", 500);
        banbus.dodajPutnika(putnik3);

        System.out.println(banbus);


    }


}
