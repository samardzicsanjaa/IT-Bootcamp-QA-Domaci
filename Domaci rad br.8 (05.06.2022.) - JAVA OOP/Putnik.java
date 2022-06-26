package OOPdomaci4.Zadatak1;

public class Putnik extends Covek {

    /*
        Putnik je covek koji poseduje novac.
        Inicijalno poseduje odredjenu kolicinu novca koja mu se zadaje prilikom kreiranja.
        Odredjena svota novca moze da mu se doda i/ili oduzme.
     */

    private double novacPutnika;


    public Putnik(String ime, String prezime, double novacPutnika) {
        super(ime, prezime);
        this.novacPutnika = novacPutnika;
    }

    public Putnik() {

    }

    public double getNovacPutnika() {
        return novacPutnika;
    }

    public void dodajNovac(double novacPutnika) {
        this.novacPutnika += novacPutnika;
    }


    public void oduzmiNovac(double novac) {
        if(novacPutnika == 0){
            System.out.println("Putnik nema dovoljno novca!");
        }
        this.novacPutnika -= novacPutnika;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n").append("Ime i prezime putnika: ").append(getIme()).append(" ").append(getPrezime()).append("\n");
        sb.append("Novac putnika: ").append(novacPutnika).append("\n");
        sb.append("----------------------------");
        return sb.toString();
    }

}

