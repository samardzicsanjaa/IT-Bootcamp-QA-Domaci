package OOPdomaci1;

public class TestKlasa {
    public static void main(String[] args) {

        /*
        Bilo mi je zanimljivo, pa sam spojila i druge klase. To je na kraju.
        Koliko sam razumela, nije trebalo tako. Ali zbog ideje i  vezbe sam pokusala i ostavila da pogledate. :)
         */

        Knjige knjiga1 = new Knjige("Stan u Parizu", "Gijom Muso", 2017);
        Knjige knjiga2 = new Knjige("Tajni zivot pisaca", "Gijom Muso", 2020);
        Knjige knjiga3 = new Knjige("Nista nije vecno", "Sidni Seldon", 1994);
        Knjige knjiga4 = new Knjige("Pesak vremena", "Sidni Seldon", 1998);

        System.out.println("\t*** Knjige ***");
        System.out.println("Kako se zove autor knjige *" + knjiga1.imeKnjige + "*?");
        System.out.println("Autor knjige *" + knjiga1.imeKnjige + "* se zove " + knjiga1.autor + ".");
        System.out.println("-------------------------------------");
        System.out.println("Koje godine je izasla knjiga *" + knjiga3.imeKnjige + "*?");
        System.out.println("Knjiga *" + knjiga3.imeKnjige + "* je izasla " + knjiga3.godinaIzdanja + " godine.");
        System.out.println("--------------------------------------");
        System.out.println("Kako se zove knjiga autora " + knjiga4.autor + ", koja je izasla " + knjiga4.godinaIzdanja + " godine?");
        System.out.println("Naziv knjige, autora " + knjiga3.autor + " koja je izasla " + knjiga4.godinaIzdanja + " godine je " + "*" + knjiga3.imeKnjige + "*.");

        System.out.println("-------------------------------------------------");
        System.out.println("\t*** Torte ***");
        Torta torta1 = new Torta("Cheesecake", "vocna torta", "plazma, maline, secer, mladi sir");
        Torta torta2 = new Torta("Kinder bueno", "cokoladna torta", "lesnik, cokolada, jaja, secer");

        System.out.println("Da li je torta " + torta1.imeTorte + " " + torta1.vrstaTorti + " ili " + torta2.vrstaTorti + "?");
        System.out.println(torta1.imeTorte + " je " + torta1.vrstaTorti + ".");
        System.out.println("---------------------------------------");
        System.out.println("Koji sve sastojci trebaju za " + torta2.imeTorte + " tortu?");
        System.out.println("Sastojci koji trebaju za " + torta2.imeTorte + " tortu su: " + torta2.sastojci + ".");
        System.out.println("------------------------------------------");
        System.out.println("Kako se zove torta za koju trebaju sastojci: " + torta1.sastojci + "?");
        System.out.println("Torta za koju trebaju sastojci: " + torta1.sastojci + " zove se " + torta1.imeTorte + ".");

        System.out.println("-----------------------------------------");
        System.out.println("\t*** Profil ***");
        Profil profilKorisnika1 = new Profil("Jovan", "Jovanovic", 338, 20);
        Profil profilKorisnika2 = new Profil("Ivana", "Ivanovic", 590, 39);
        Profil profilKorisnika3 = new Profil("Bojana", "Bojanic", 222, 10);

        System.out.println("Koliko ima prijatelja " + profilKorisnika1.ime + " " + profilKorisnika1.prezime + " na svom profilu?");
        System.out.println(profilKorisnika1.ime + " " + profilKorisnika1.prezime + " ima " + profilKorisnika1.brojPrijatelja + " prijatelja.");
        System.out.println("--------------------------------------");
        System.out.println("Koliko ima zahteva za prijatljestvo " + profilKorisnika2.ime + " " + profilKorisnika2.prezime + "?");
        System.out.println(profilKorisnika2.ime + " " + profilKorisnika2.prezime + " ima " + profilKorisnika2.brojZahteva + " zahteva za prijateljstvo.");
        System.out.println("--------------------------------------");
        System.out.println("Ko od navedenih korisnika ima najmanje prijatelja na profilu i najmanje zahteva za prijateljstvo?");
        System.out.println("Najmanje prijatelja i zahteva za prijateljstvo ima " + profilKorisnika3.ime + " " + profilKorisnika3.prezime + ".");
        System.out.println("---------------------------------------");
        System.out.println("\t*** ***");
        System.out.println("Kom korisniku je omiljena torta " + torta1.imeTorte + "?");
        System.out.println(profilKorisnika3.ime + " " + profilKorisnika3.prezime + " obozava tortu " + torta1.imeTorte + ".");
        System.out.println("-----------------------------------");
        System.out.println(profilKorisnika2.ime + " " + profilKorisnika2.prezime + " voli da cita knjigu *" + knjiga3.imeKnjige + "* autora " + knjiga3.autor + ".");
        System.out.println("-----------------------------------");
        System.out.println("Dok je " + profilKorisnika1.ime + " " + profilKorisnika1.prezime + " danas jeo " + torta2.imeTorte + " tortu (" + torta2.vrstaTorti + "),"
        + "\nslucajno je na telefonu video da je izasla najnovija knjiga autora " + knjiga1.autor + " koja se zove *" + knjiga2.imeKnjige + "*.");


    }


}
