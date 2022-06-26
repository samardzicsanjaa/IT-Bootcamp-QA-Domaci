package OOPdomaci4.Zadatak2;

public abstract class Planinar {

    /*
    Kreirati apstraktnu klasu Planinar koja od zaštićenih atributa ima:
        - jedinstveni celobrojni identifikacioni broj
        - ime i prezime
    Dok od javnih metoda:
        - konstruktor koji postavlja sve atribute klase.
        - gettere
        - apstraktnu metodu štampaj
        - apstraktnu metodu koja vraca clanarinu planinara
        - apstraktnu metodu uspesanUspon koja vraća informaciju da li će se planinar upešno popeti na planinu.
          Metoda kao ulazni parametar prima objekat tipa Planina.
     */


    private static int brojObjekata = 0;
    protected int id;
    protected String ime;
    protected String prezime;


    private void postaviId() {
        brojObjekata++;
        this.id = brojObjekata;
    }

    public Planinar(String ime, String prezime) {
        postaviId();
        this.ime = ime;
        this.prezime = prezime;

    }


    public int getId() {
        return id;
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public abstract void stampaj();

    public abstract int clanarine();

    public abstract String uspesanUspon(Planina uspon);


}

