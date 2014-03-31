/*
    Oefening 15:
    a) de class Voertuig
    Maak een class Voertuig met setter en getter methods voor:
    - een property polishouder van het type String
    - een property kostprijs van het type float
    - een property pk van het type int
    - een property gemVerbruik van het type float
    - een property nummerplaat van het type String
    De default polishouder en nummerplaat zijn “onbepaald” en de kostprijs staat op 0, evenals het aantal pk en 
    het gemiddeld verbruik.
    Maak een constructor zonder parameters.
    Maak ook een constructor die de polishouder, de kostprijs, het aantal pk, het gemiddeld verbruik en 
    een nummerplaat aanvaardt.
    Return alle gegevens in één String in een toString() method. Eerst de polishouder dan de kostprijs, 
    het aantal pk, het verbruik en een nummerplaat. Voorzie ook een method toon(), die uiteraard alle gegevens 
    toont op het scherm.
    b) de class Vrachtwagen
    Maak een class Vrachtwagen, die is afgeleid van Voertuig en setter en getter methods heeft voor:
    - maxLading van het type float
    De default maxLading is 10000 kg en mag niet negatief zijn.
    Voorzie ook een constructor waarbij je alle waardes via parameters meegeeft.
    Zorg ervoor dat de gegevens van de Vrachtwagen kunnen getoond worden op het scherm en override 
    de toString()-method.
    c) de class Personenwagen
    Maak een class Personenwagen, die is afgeleid van Voertuig en setter en getter methods heeft voor:
    - aantalDeuren van het type int
    - aantalPassagiers van het type int
    Het default aantal deuren is 4, het default aantal passagiers is 5. Deze properties mogen niet negatief zijn.
    Voorzie ook een constructor waarbij je alle waardes via parameters meegeeft.
    Zorg ervoor dat de gegevens van de personenwagen kunnen getoond worden op het scherm en override de 
    toString()-method.
    d) de abstracte method getKyotoScore ()
    Maak de class Voertuig abstract en voeg de volgende abstracte method toe :
    public double getKyotoScore()
    Deze method returnt een Kyoto-score. Voor een personenwagen is de Kyoto-score gelijk aan het verbruik 
    vermenigvuldigd met het aantal pk, gedeeld door het aantal passagiers.
    Voor een vrachtwagen is de Kyoto-score gelijk aan het verbruik vermenigvuldigd met het aantal pk, 
    gedeeld door de lading in ton.
    Werk getKyotoScore() uit in de diverse classes.
    e) Hoofdprogramma
    Test alles uit in een hoofdprogramma.
*/
package jpf.classesobjectsinheritance;

/**
 *
 * @author zi05
 */
public class Oefening15Bestuurder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // toon met polymorphism:
        Voertuig[] voertuig = new Voertuig[10];

        voertuig[0] = new Personenwagen();
        voertuig[0].toon(); 
        System.out.println("Personenwagen met polimorphism: " + voertuig[0]);
        voertuig[1] = new Vrachtwagen();
        voertuig[1].toon();
        System.out.println("Vrachtwagen zonder polimorphism: " + voertuig[1]);

        Voertuig opel1 = new Personenwagen();
        opel1.toon();
        System.out.println(opel1);

        //Zonder polimorphism
        Vrachtwagen volvo1 = new Vrachtwagen();
        volvo1.toon();
        System.out.println(volvo1);

        Personenwagen opel2 = new Personenwagen("Jan Klaase",
                14599.0F, 105, 6.8F, "KLM099", 5, 5);
        opel2.toon();
        System.out.println(opel2);

        opel2.setKostprijs(-15000);
        opel2.setAantalDeuren(-7);
        opel2.setAantalDeuren(0);
        System.out.println(opel2);  //opel2 is niet gewijzigd

        Vrachtwagen volvo2 = new Vrachtwagen("Michel Dewolf", 214599.0F, 440, 33.1F, "PRD441", 6000.0F);
        volvo2.toon();
        System.out.println(volvo2);

        System.out.println();
        System.out.println("Kyotoscore personenwagen 1: " + opel1.getKyotoScore());
        System.out.println("Kyotoscore personenwagen 2: " + opel2.getKyotoScore());
        System.out.println("Kyotoscore vrachtwagen 1: " + volvo1.getKyotoScore());
        System.out.println("Kyotoscore vrachtwagen 2: " + volvo2.getKyotoScore());
    }

}
