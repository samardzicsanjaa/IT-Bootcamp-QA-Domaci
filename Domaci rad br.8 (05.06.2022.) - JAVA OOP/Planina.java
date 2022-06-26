package OOPdomaci4.Zadatak2;

public class Planina {

    /*
    Kreirati klasu Planina koja od privatnih atributa ima:
        - ime planine
        - naziv države u kojoj se nalazi
        - visinu planine.
    a od javnih metoda:
        - default-ni konstruktor (konstruktor bez argumenata) i konstuktor koji postavlja sve parametre
        - gettere i settere za sve atribute
     */


    private String ime;
    private String nazivDrzave;
    private double visinaPlanine;

    public Planina(String ime, String nazivDrzave, double visinaPlanine) {

        this.ime = ime;
        this.nazivDrzave = nazivDrzave;
        this.visinaPlanine = visinaPlanine;
    }

    public Planina() {
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getNazivDrzave() {
        return nazivDrzave;
    }

    public void setNazivDrzave(String nazivDrzave) {
        this.nazivDrzave = nazivDrzave;
    }

    public double getVisinaPlanine() {
        return visinaPlanine;
    }

    public void setVisinaPlanine(double visinaPlanine) {
        this.visinaPlanine = visinaPlanine;
    }
}
