package DomaciRadOOP_NedeljaDruga_Br3;

import java.util.ArrayList;


public class Recept {

    /*
    Направити класу Рецепт која садржи следеће:
    Назив рецепта
    Тежину рецепта (Број од 1 до 5)
    Редом означавају следеће нивое: Почетни, Лак, Средњи, Тежак, Мајсторски
    Колекцију састојака (типа СастојакРецепта)
    Подразумевани конструктор, get и set методе за све
    dodajSastojak(SastojakRecepta sastojak)
    Додаје састојак у колекцију
    ukloniSastojak(SastojakRecepta sastojak)
    Брише састојак из колекције (Водити рачуна о референцама/вредностима)
    toString враћа String у следећем формату
     */

    private String naziv;
    private int tezina;
    private ArrayList<SastojakRecepta> kolekcijaSastojaka;

    public Recept(String naziv, int tezina, ArrayList<SastojakRecepta> kolekcijaSastojaka) {
        this.naziv = naziv;
        this.tezina = tezina;
        if (kolekcijaSastojaka == null)
            this.kolekcijaSastojaka = new ArrayList<>();
        else
            this.kolekcijaSastojaka = kolekcijaSastojaka;
    }

    public Recept() {
        kolekcijaSastojaka = new ArrayList<>();
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getTezina() {
        return tezina;
    }

    public void setTezina(int tezina) {
        this.tezina = tezina;
    }

    public ArrayList<SastojakRecepta> getSastojakRecepata() {
        return kolekcijaSastojaka;
    }

    public void setSastojakRecepata(ArrayList<SastojakRecepta> kolekcijaSastojaka) {
        this.kolekcijaSastojaka = kolekcijaSastojaka;
    }

    public String tezinaRecepta() {

        switch (tezina) {
            case 1:
                return "Pocetni nivo!";
            case 2:
                return "Lak nivo!";
            case 3:
                return "Srednji nivo!";
            case 4:
                return "Tezak nivo!";
            case 5:
                return "Majstorski nivo!";

        }
        return "";

    }

    public void dodajSastojak(SastojakRecepta s) {
        kolekcijaSastojaka.add(s);
    }

    public void dodajSastojak(SastojakRecepta s, int i) {
        kolekcijaSastojaka.add(i, s);
    }

    public void ukloniSastojak(SastojakRecepta s) {
        kolekcijaSastojaka.remove(s);
    }

    public void ukloniSastojak(int i) {
        kolekcijaSastojaka.remove(i);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(naziv).append(":").append("\n");
        sb.append("Tezina: ").append(tezinaRecepta()).append("\n");
        sb.append("\n");
        sb.append("***Sastojci: ").append("\n");
        for (SastojakRecepta s : kolekcijaSastojaka) {
            sb.append(s).append("\n").append("--------------").append("\n");
        }
        return sb.toString();
    }
}
