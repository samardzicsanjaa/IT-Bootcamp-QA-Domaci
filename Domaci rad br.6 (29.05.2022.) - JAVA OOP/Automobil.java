package OOPdomaci2;

public class Automobil {

    /*
    Napisati klasu Automobil. Automobil ima:
    - marku (polje tipa String) koje moze da se dohvati, ali ne i postavi
    - model (polje tipa String) koje moze da se dohvati ali ne i postavi
    - serijski broj (polje tipa int) koje moze da se dohvati ali ne i postavi
    Automobil moze da ima vlasnika, i vlasnik moze da se dohvati i postavi u svakom trenutku

    Napisati glavni program koji kreira tri automobila.
    U glavnom programu iskoristiti (proizvoljan broj puta) sve tipove metoda napisanih u klasi Automobil.
     */

    private Vlasnik vlasnik;
    private String marka;
    private String model;
    private static int brojObjekata = 100;
    private int serijskiBroj;

    private void postaviSerijskiBroj() {
        brojObjekata++;
        this.serijskiBroj = brojObjekata;
    }

    // Konstruktor
    public Automobil(Vlasnik vlasnik, String marka, String model) {
        this.vlasnik = new Vlasnik(vlasnik.getIme(), vlasnik.getPrezime());
        this.marka = marka;
        this.model = model;
        this.serijskiBroj = serijskiBroj;
        postaviSerijskiBroj();
    }

    // Prazan konstruktor
    public Automobil(String jovan, String jovanovic, String audi, String a3) {
        this.vlasnik = new Vlasnik();
        this.marka = "";
        this.model = "";
        postaviSerijskiBroj();

    }

    public Vlasnik getVlasnik() {
        return vlasnik;
    }

    public void setVlasnik(Vlasnik vlasnik) {
        this.vlasnik = new Vlasnik(getVlasnik().getIme(), getVlasnik().getPrezime());
    }

    public String getMarka() {
        return marka;
    }

    public String getModel() {
        return model;
    }

    public int getSerijskiBroj() {
        return serijskiBroj;
    }


    public String informacije() {

        String inform = "Marka ovog automobila je: ".concat(this.marka).concat("\n");
        inform = inform.concat("Model ovog automobila je: ").concat(this.model).concat("\n");
        inform = inform.concat("Serijski broj ovog automobila je: ").concat(String.valueOf(this.serijskiBroj));

        return inform;
    }

    @Override
    public String toString() {
        String inform = (this.vlasnik.toString());
        inform = inform.concat("Marka ovog automobila je: ".concat(this.marka).concat("\n"));
        inform = inform.concat("Model ovog automobila je: ").concat(this.model).concat("\n");
        inform = inform.concat("Serijski broj ovog automobila je: ").concat(String.valueOf(this.serijskiBroj));

        return inform;
    }
}
