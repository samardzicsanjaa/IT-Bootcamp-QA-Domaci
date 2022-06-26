package OOPdomaci4.Zadatak1;

public class Vozac extends Covek {

    /*
        Vozac je covek koji poseduje i zvanje (zanimanje -> sofer).
    */

    private String zvanje;

    public Vozac(String ime, String prezime) {
        super(ime, prezime);
        this.zvanje = "Sofer";
    }


    public String getZvanje() {
        return zvanje;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Zvanje: ").append(zvanje).append("\n");
        sb.append("---------------------");
        return sb.toString();
    }
}

