package OOPdomaci4.Zadatak2;

public class Alpinista extends Planinar {

    /*
    Kreirati klasu Alpinista koja nasleđuje klasu Planinar.
    Klasa sadrži atribut koji pamti koliko poena je alpinista ostvario (celobrojna vrednost)
    i poeni se mogu menjati (znaci, postojace seter).
    Napraviti konstruktor.
    Alpinista može da savlada sve uspone do 4000 metara, placa clanarinu u iznosu od 1500 pritom za svaki poen ima popust od 50,
    a informacije o alpinisti se ispisuju u formatu:
        Alpinista, id: id
        ime: ime i prezime
        Broj poena: poeni
     */

    private int poeni;

    public Alpinista(String ime, String prezime, int poeni) {
        super(ime, prezime);
        this.poeni = poeni;
    }

    public Alpinista(String ime, String prezime) {
        super(ime, prezime);
    }

    public int getPoeni() {
        return poeni;
    }

    public void setPoeni(int poeni) {
        this.poeni = poeni;
    }

    @Override
    public void stampaj() {
        System.out.println("Alpinista, id: " + getId() + ("\n").concat("Ime ").concat(ime)
                .concat(" ").concat(prezime).concat("\n").concat("Broj poena: ").concat(String.valueOf(poeni)));

    }

    @Override
    public int clanarine() {
        int clanarina = 1500 - (poeni * 50);
        return clanarina;
    }

    @Override
    public String uspesanUspon(Planina uspon) {
        if (uspon.getVisinaPlanine() < 4000) {
            return "Uspesno!\n----------------------------";
        }
        return "Neuspesno!\n------------------------------";

    }

}
