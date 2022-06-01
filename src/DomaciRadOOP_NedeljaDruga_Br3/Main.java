package DomaciRadOOP_NedeljaDruga_Br3;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Sastojak mleko = new Sastojak("Mleko", 0.107);
        System.out.println(mleko.toString());
        Sastojak brasno = new Sastojak("Brasno", 0.0819);
        System.out.println("Cena brasna je " + (brasno.getCena()));
        mleko.setCena(0.110);
        System.out.println("Nova cena mleka je: " + mleko.getCena());

        System.out.println("---------------------------");
        SastojakRecepta spagete = new SastojakRecepta("Spagete", 54.3, 2);
        SastojakRecepta pavlakaZaKuvanje = new SastojakRecepta("Pavlaka za kuvanje", 110, 1);
        SastojakRecepta beliLuk = new SastojakRecepta("Beli luk", 0.096, 4);
        SastojakRecepta cureceMeso = new SastojakRecepta("Curece meso", 0.649, 500);
        SastojakRecepta maslac = new SastojakRecepta("Maslac", 150, 1);
        SastojakRecepta jaja = new SastojakRecepta("Jaja", 12.5, 5);
        SastojakRecepta biber = new SastojakRecepta("Biber", 10, 1);
        SastojakRecepta so = new SastojakRecepta("So", 9, 1);
        jaja.setKolicina(7);
        System.out.println("Za ovaj recept nam ipak treba " + jaja.getKolicina() + " jaja.");
        System.out.println("------------------------------------------");
        cureceMeso.setCena(0.689);
        System.out.println("Nova cena cureceg mesa je: " + cureceMeso.getCena() +
                (". 500g cureceg mesa je: ") + cureceMeso.ukupnaCena());
        System.out.println("---------------------------------");
        ArrayList<SastojakRecepta> sviSastojci = new ArrayList<>();
        sviSastojci.add(spagete);
        sviSastojci.add(pavlakaZaKuvanje);
        sviSastojci.add(beliLuk);
        sviSastojci.add(cureceMeso);
        sviSastojci.add(maslac);
        sviSastojci.add(jaja);
        sviSastojci.add(biber);
        sviSastojci.add(so);

        sviSastojci.remove(so);


        Recept spageteUBelomSosu = new Recept("Spagete u belom sosu", 3, sviSastojci);
        System.out.println(spageteUBelomSosu.toString());

        System.out.println(spageteUBelomSosu.toString());


    }

}
