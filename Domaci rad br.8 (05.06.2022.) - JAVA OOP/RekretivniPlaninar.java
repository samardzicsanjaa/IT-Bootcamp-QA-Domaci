package OOPdomaci4.Zadatak2;

public class RekretivniPlaninar extends Planinar {

    /*
    Kreirati klasu RekreativniPlaninar koja nasleđuje klasu Planinar.
    Klasa dodatno pamti još neke informacije koje se ne mogu menjati nakon postavljanja u konstuktoru (znaci, nemaju setere):
        - težinu opreme (kg) koju nosi (celobrojna je vrednost npr: 20kg)
        - naziv okruga odakle je rekreativni planinar.
        - maksimalni uspon koji planinar može da savlada bez opreme (npr: 2000m)
        - napraviti konstruktor
        - da li će rekreativni planinar uspešno popeti na planinu zavisi da li je njegov najveći uspon manji od visine planine,
        s tim da oprema dodatno otežava penjanje i za svaki kilogram opreme koji nosi može da pređe 50 metara manje.
        - rekeativci placaju clanarinu u iznosu od 1000 rsd
        - metoda koja ispisuje podatke o planinaru ispisuje ih u sledećem formatu:
        Rekreativac, id: id
        ime: ime prezime Okrug: okrug
     */

    private int tezinaOpreme;
    private String nazivOkruga;
    private int maximalniUspon;

    public RekretivniPlaninar(String ime, String prezime, int tezinaOpreme, String nazivOkruga, int maximalniUspon) {
        super(ime, prezime);
        this.tezinaOpreme = tezinaOpreme;
        this.nazivOkruga = nazivOkruga;
        this.maximalniUspon = maximalniUspon;
    }

    public int getTezinaOpreme() {
        return tezinaOpreme;
    }

    public String getNazivOkruga() {
        return nazivOkruga;
    }

    public int getMaximalniUsponBezOpreme() {
        return maximalniUspon;
    }


    @Override
    public void stampaj() {
        System.out.println("Rekreativac, id: " + getId() + ("\n").concat("Ime: ").concat(getIme())
                .concat(" ").concat(getPrezime()).concat("\n").concat("Okrug: ").concat(nazivOkruga).concat(" ")
                .concat("Tezina Opreme: ").concat(String.valueOf(tezinaOpreme)).concat(" ")
                .concat("Maksimalan uspon je: ").concat(String.valueOf(maximalniUspon)));

    }

    @Override
    public int clanarine() {
        int clanarina = 1000;
        return clanarina;
    }

    @Override
    public String uspesanUspon(Planina uspon) {
        if (maximalniUspon - tezinaOpreme * 50 > uspon.getVisinaPlanine()) {
            return "Uspesno!\n---------------------------";
        }

        return "Neuspesno!\n-----------------------------";
    }

    public void suma() {
        System.out.println();
    }

}
