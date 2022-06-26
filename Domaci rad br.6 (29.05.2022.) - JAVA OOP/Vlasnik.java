package OOPdomaci2;

public class Vlasnik {

    private String ime;
    private String prezime;

    public Vlasnik(String ime, String prezime) {
        this.ime = ime;
        this.prezime = prezime;

    }

    public Vlasnik() {
        this.ime = "";
        this.prezime = "";
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

    @Override
    public String toString() {
        String informVlasnik = "Ime i prezime vlasnika je: ".concat(this.ime).concat(" ").concat(this.prezime).concat("\n");

        return informVlasnik;
    }
}
