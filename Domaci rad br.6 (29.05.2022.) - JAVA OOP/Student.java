package OOPdomaci2;

public class Student {

    /*
    Kreirati klasu Student, koja ce imati sledece podatke:
    - ime i prezime studenta
    - broj indexa
    - smer
    - rezultate ispita izrazeni u procentima (51% za polozen ispit)

    U svom programu koristiti klasu i sve navedene parametre gde ce korisnik programa unositi rezultat ispita
    i na osnovu njih poruku da li je student polozio ispit ili ne.
    Mozete koristiti nizove ili liste, ali i ne morate.
    Za najhrabrije dodatak: Unosom samo broja indexa treba da izbaci sve podatke o studentu.
    Naravno, ovaj deo trazi da se koristi lista.
     */

    private String ime;
    private String prezime;
    private String smer;
    private int brIndexa;
    private double rezultatiUProcentima;

    // Konstruktor


    public Student(String ime, String prezime, String smer, int brIndexa, double rezultatiUProcentima) {
        this.ime = ime;
        this.prezime = prezime;
        this.smer = smer;
        this.rezultatiUProcentima = rezultatiUProcentima;
        this.brIndexa = brIndexa;
    }

// Prazan konstruktor

    public Student() {
        this.ime = "";
        this.prezime = "";
        this.smer = "";
        this.brIndexa = 0;
        this.rezultatiUProcentima = 0.0;

    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getSmer() {
        return smer;
    }

    public void setSmer(String smer) {
        this.smer = smer;
    }

    public double getRezultatiUProcentima() {
        return rezultatiUProcentima;
    }

    public void setRezultatiUProcentima(double rezultatiUProcentima) {
        this.rezultatiUProcentima = rezultatiUProcentima;
    }


    public int getBrIndexa() {
        return brIndexa;
    }

    public void setBrIndexa(int brIndexa) {
        this.brIndexa = brIndexa;
    }

    public String rezultatiIspita() {
        if (rezultatiUProcentima > 100 || rezultatiUProcentima < 0) {
            return "Pogresan unos!";
        } else if (this.rezultatiUProcentima >= 51) {
            return "Polozili ste ispit!";
        } else {
            return "Pali ste ispit!";

        }

    }


    public String informacijeOStudentu() {
        String inf = "Ime studenta je: ".concat(this.ime).concat("\n");
        inf = inf.concat("Prezime studenta je: ").concat(this.prezime).concat("\n");
        inf = inf.concat("Smer: ").concat(this.smer).concat("\n");
        inf = inf.concat("Broj indexa je: ").concat(String.valueOf(brIndexa)).concat("\n");
        inf = inf.concat("Rezultat ispita: ").concat(String.valueOf(this.rezultatiUProcentima)).concat("\n");
        inf = inf.concat(rezultatiIspita());

        return inf;
    }

}
