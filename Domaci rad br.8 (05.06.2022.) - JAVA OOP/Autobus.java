package OOPdomaci4.Zadatak1;

import java.util.ArrayList;

public class Autobus {
    /*
        Autobus poseduje naziv, vozaca, cenu karte i putnika koji se njime voze.
        Naziv i cena karte i zadaju se prilikom kreiranja.
        Moguce je dodati/ukloniti putnika kao i vozaca.

     */

    private String nazivAutobusa;
    private double cenaKarte;
    private Vozac vozacAutobusa;
    private ArrayList<Putnik> putnikAutobusa;

    public Autobus(String nazivAutobusa, double cenaKarte) {
        this.nazivAutobusa = nazivAutobusa;
        this.cenaKarte = cenaKarte;
        this.vozacAutobusa = null;
        this.putnikAutobusa = new ArrayList<>();
    }

    public Autobus() {
    }

    public String getNazivAutobusa() {
        return nazivAutobusa;
    }

    public void setNazivAutobusa(String nazivAutobusa) {
        this.nazivAutobusa = nazivAutobusa;
    }

    public double getCenaKarte() {
        return cenaKarte;
    }

    public void setCenaKarte(double cenaKarte) {
        this.cenaKarte = cenaKarte;
    }

    public Vozac getVozacAutobusa() {
        return vozacAutobusa;
    }

    public void setVozacAutobusa(Vozac vozacAutobusa) {
        this.vozacAutobusa = vozacAutobusa;
    }

    public ArrayList<Putnik> getPutnikAutobusa() {
        return putnikAutobusa;
    }

    public void setPutnikAutobusa(ArrayList<Putnik> putnikAutobusa) {
        this.putnikAutobusa = putnikAutobusa;
    }

    public void dodajPutnika(Putnik p1) {
        putnikAutobusa.add(p1);
    }

    public boolean daLiSuIsti(Putnik p, Putnik pp) {
        return p.getIme().equals(pp.getIme()) && p.getPrezime() == (pp.getPrezime()) && p.getNovacPutnika() == pp.getNovacPutnika();
    }

    public void ukloniPutnika(Putnik p1) {
        for (int i = 0; i < putnikAutobusa.size(); i++) {
            Putnik trenutni = putnikAutobusa.get(i);
            if (daLiSuIsti(trenutni, p1)) {
                putnikAutobusa.remove(i);
            }
        }

    }


    public void dodajVozaca(Vozac v) {
        if (this.vozacAutobusa == null) {
            this.vozacAutobusa = v;
        } else System.out.println("Vozac postoji!");
    }

    public void izbaciVozaca(Vozac v) {
        if (this.vozacAutobusa != null) {
            this.vozacAutobusa = null;
        } else System.out.println("Nema vozaca za izbacivanje");
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Naziv autobusa: ").append(nazivAutobusa).append("\n");
        sb.append("Cena karte: ").append(cenaKarte).append("\n");
        sb.append("Vozac: ").append(vozacAutobusa).append("\n");
        for (Putnik s : putnikAutobusa) {
            sb.append(s);
        }
        return sb.toString();
    }
}
