package DomaciRadOOP_NedeljaDruga_Br3;

public class Sastojak {

    /*
    Направити класу Састојак која садржи следеће:
    Назив састојка
    Цену састојка (По јединици мере, због једноставности)
    Јаје - Цена по Комаду
    Млеко - Цена по Милилитру
    Брашно - Цена по Граму
     */

    private String naziv;
    private double cena;


    public Sastojak(String naziv, double cena) {
        this.naziv = naziv;
        this.cena = cena;
    }

    public Sastojak() {
        this.naziv = "";
        this.cena = 0.0;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Naziv sastojka: ").append(naziv).append("\n");
        sb.append("Cena sastojka: ").append(cena);
        return sb.toString();
    }
}
