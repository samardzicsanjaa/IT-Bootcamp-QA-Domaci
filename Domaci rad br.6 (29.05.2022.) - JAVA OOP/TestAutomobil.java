package OOPdomaci2;

public class TestAutomobil {

    public static void main(String[] args) {

        Vlasnik vlasnikAudia = new Vlasnik("Jovan", "Jovanovic");
        Automobil audi = new Automobil(vlasnikAudia, "Audi", "A3");
        System.out.println(audi.toString());
        System.out.println("-------------------------");
        // vlasnikAudia.setIme("Jovana ");
        // System.out.print(vlasnikAudia.getIme());
        //  vlasnikAudia.setPrezime("Peric");
        //  System.out.println(vlasnikAudia.getPrezime());
        //  System.out.println("--------------------------");
        audi.getVlasnik().setIme("Jovana ");
        audi.getVlasnik().setPrezime("Peric");
        System.out.print(audi.getVlasnik().getIme());
        System.out.println(audi.getVlasnik().getPrezime());
        System.out.println("-------------------------");
        System.out.println(audi);
        System.out.println("\n---------------------------------");
        Vlasnik vlasnikMerceda = new Vlasnik("Ivana", "Ivanovic");
        Automobil merceders = new Automobil(vlasnikMerceda, "Mercedes", "A180");
        System.out.println(merceders.toString());
        System.out.println("-----------------------");
        System.out.println("Model ovog automobila je: " + merceders.getModel());
        System.out.println("\n----------------------------");
        Vlasnik vlasnikBMW = new Vlasnik("Nikola", "Nikolic");
        Automobil BMW = new Automobil(vlasnikBMW, "BMW", "X6");
        System.out.println(BMW.toString());
        System.out.println("-----------------------");
        System.out.println("Marka ovog automobila je: " + BMW.getMarka());
        System.out.println("----------------");
        BMW.getVlasnik().setPrezime("Pancic");
        System.out.println(BMW.getVlasnik().getPrezime());
        System.out.println(BMW.toString());
        System.out.println("-----------------------------");
        System.out.println("--------------------------");
        System.out.println("Kako se zove vlasnik mercedesa?\nIme vlasnika je: " + merceders.getVlasnik().getIme());
        System.out.println("Koji auto vozi Nikola Pancic?\nNikola Pancic vozi: " + BMW.getMarka());
        System.out.println("----------------------");
        System.out.println("Koji model audia ima Jovan Jovanovic?\nModel audia je: " + audi.getModel());
        System.out.println("------------------------");
        System.out.println("Serijski broj audia " + audi.getSerijskiBroj());
        System.out.println("Serijski broj mercedesa: " + merceders.getSerijskiBroj());
        System.out.println("Serijski broj BMWa: " + BMW.getSerijskiBroj());


    }

}
