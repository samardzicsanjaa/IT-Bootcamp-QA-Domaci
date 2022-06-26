package OOPdomaci4.Zadatak1;

public class Covek {

    /*
        Covek poseduje ime i prezime koji se dodeljuju prilikom kreiranja objekta.
        Svi podaci mogu da se dohvate, ali ne i postave.
    */

    private String ime;
    private String prezime;

    public Covek(String ime, String prezime) {
        this.ime = ime;
        this.prezime = prezime;
    }

    public Covek() {
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Ime i prezime vozaca: ").append(ime).append(" ").append(prezime).append("\n");
        return sb.toString();
    }
}

