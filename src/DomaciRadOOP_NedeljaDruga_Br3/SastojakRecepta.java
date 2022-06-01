package DomaciRadOOP_NedeljaDruga_Br3;

//import java.util.ArrayList;

public class SastojakRecepta extends Sastojak {

    /*
    Направити класу СастојакРецепта која наслеђује Састојак и има додатно:
    Количина састојка (У јединици мере, као изнад)
    Описује колико нам састојка треба за неки конкретан рецепт
    Метода: ukupnaCena()
    Враћа укупну цену састојка
    */

    private int kolicina;

    public SastojakRecepta(String naziv, double cena, int kolicina) {
        super(naziv, cena);
        this.kolicina = kolicina;
    }

    public SastojakRecepta(String naziv, double cena) {
        super(naziv, cena);
    }

    public SastojakRecepta() {
    }

    public int getKolicina() {
        return kolicina;
    }

    public void setKolicina(int kolicina) {
        this.kolicina = kolicina;
    }

    public double ukupnaCena() {
        double ukCena;
        ukCena = getCena() * getKolicina();
        return ukCena;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString()).append("\n");
        //  sb.append("Naziv sastojka: ").append(getNaziv()).append("\n");
        sb.append("Kolicina sastojka: ").append(kolicina).append("\n");
        sb.append("Ukupna cena je: ").append(ukupnaCena());
        return sb.toString();
    }
}

