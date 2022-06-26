package OOPdomaci4.Zadatak2;

public class Zadatak2 {

    /*
    Kreirati klasu Planina koja od privatnih atributa ima:
        - ime planine
        - naziv države u kojoj se nalazi
        - visinu planine.
    a od javnih metoda:
        - default-ni konstruktor (konstruktor bez argumenata) i konstuktor koji postavlja sve parametre
        - gettere i settere za sve atribute

    Kreirati apstraktnu klasu Planinar koja od zaštićenih atributa ima:
        - jedinstveni celobrojni identifikacioni broj
        - ime i prezime
    Dok od javnih metoda:
        - konstruktor koji postavlja sve atribute klase.
        - gettere
        - apstraktnu metodu štampaj
        - apstraktnu metodu koja vraca clanarinu planinara
        - apstraktnu metodu uspesanUspon koja vraća informaciju da li će se planinar upešno popeti na planinu.
          Metoda kao ulazni parametar prima objekat tipa Planina.

    Kreirati klasu RekreativniPlaninar koja nasleđuje klasu Planinar.
    Klasa dodatno pamti još neke informacije koje se ne mogu menjati nakon postavljanja u konstuktoru (znaci, nemaju setere):
        - težinu opreme (kg) koju nosi (celobrojna je vrednost npr: 20kg)
        - naziv okruga odakle je rekreativni planinar.
        - maksimalni uspon koji planinar može da savlada bez opreme (npr: 2000m)
        - napraviti konstruktor
        - da li će rekreativni planinar uspešno popeti na planinu zavisi da li je njegov najveći uspon manji od visine planine,
        s tim da oprema dodatno otežava penjanje i za svaki kilogram opreme koji nosi može da pređe 50 metara manje.
        - rekeativci placaju clanarinu u iznosu od 1000 rsd
        - metoda koja ispisuje podatke o planinaru ispisuje ih u sledećem formatu:
        Rekreativac, id: id
        ime: ime prezime Okrug: okrug

    Kreirati klasu Alpinista koja nasleđuje klasu Planinar.
    Klasa sadrži atribut koji pamti koliko poena je alpinista ostvario (celobrojna vrednost)
    i poeni se mogu menjati (znaci, postojace seter).
    Napraviti konstruktor.
    Alpinista može da savlada sve uspone do 4000 metara, placa clanarinu u iznosu od 1500 pritom za svaki poen ima popust od 50,
    a informacije o alpinisti se ispisuju u formatu:
        Alpinista, id: id
        ime: ime i prezime
        Broj poena: poeni

    Kreirati glavnu klasu I u njoj:
        - instancirati jednu planinu
        - napraviti niz koji ce sadrzati tri rekrativna planinara I tri alpiniste
        - ispisati podatke o svim planinarima I za svakog od planinara ispisati da li ce se popeti na instanciranu planinu
        - ispisati kolika je zbir svih clanarina planinara iz niza

     */

}
