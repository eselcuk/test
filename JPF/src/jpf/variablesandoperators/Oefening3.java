/*
    Oefening 3:
    Gegeven : een te betalen bedrag voor een snoep uit een snoepautomaat. De kostprijs van de verschillende snoepen varieert tussen € 0,30 en € 1,20. De klant kan enkel betalen met een stuk van € 2. Het programma moet het wisselgeld uitrekenen : hoeveel stukken van € 1, € 0,50, € 0,20, € 0,10, € 0,05, € 0,02 en € 0,01 moeten er teruggegeven worden. Steeds met zo weinig mogelijk munten !
    Test het programma voor een aankoop die € 0,42 kost, voor een aankoop die € 1,02 kost, …
    Opgelet: bij bewerkingen met decimale getallen (float, double) geven bewerkingen niet altijd een correct resultaat: 10.0 / 2.0 = 4.9999993 (of zo iets). Gebruik dus de gepaste datatypes.
*/
package jpf.variablesandoperators;

/**
 *
 * @author zi05
 */
public class Oefening3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float teBetalen = 0.42F;
        int teBetalenInCent = (int) (teBetalen * 100);
        int terugTeGevenInCent = 200 - teBetalenInCent;
        System.out.println("Te betalen : " + teBetalen);
        System.out.println("Terug te geven : " + terugTeGevenInCent / 100.);
        int stukkenVanEenEuro = terugTeGevenInCent / 100;
        System.out.println("Stukken van 1 euro : " + stukkenVanEenEuro);
        terugTeGevenInCent -= stukkenVanEenEuro * 100;
        int stukkenVanVijftigCent = terugTeGevenInCent / 50;
        System.out.println("Stukken van 50 cent : " + stukkenVanVijftigCent);
        terugTeGevenInCent -= stukkenVanVijftigCent * 50;
        int stukkenVanTwintigCent = terugTeGevenInCent / 20;
        System.out.println("Stukken van 20 cent : " + stukkenVanTwintigCent);
        terugTeGevenInCent -= stukkenVanTwintigCent * 20;
        int stukkenVanTienCent = terugTeGevenInCent / 10;
        System.out.println("Stukken van 10 cent : " + stukkenVanTienCent);
        terugTeGevenInCent -= stukkenVanTienCent * 10;
        int stukkenVanVijfCent = terugTeGevenInCent / 5;
        System.out.println("Stukken van 5 cent : " + stukkenVanVijfCent);
        terugTeGevenInCent -= stukkenVanVijfCent * 5;
        int stukkenVanTweeCent = terugTeGevenInCent / 2;
        System.out.println("Stukken van 2 cent : " + stukkenVanTweeCent);
        terugTeGevenInCent -= stukkenVanTweeCent * 2;
        int stukkenVanEenCent = terugTeGevenInCent;
        System.out.println("Stukken van 1 cent : " + stukkenVanEenCent);
    }

}
