/*
    Oefening 12:
    Maak eerst een class Oefening12Waarnemer. Deze class kan een minimumtemperatuur, een maximumtemperatuur en een 
    gemiddelde temperatuur bijhouden (property’s) en weergeven (getter-methods). Verder heeft deze class een 
    method die deze 3 statistieken bijwerkt wanneer er een nieuwe temperatuur geregistreerd werd.
    Maak een tweede class (met main-method) die geregistreerde temperaturen inleest. Het programma stopt met 
    de ingave van de temperatuur 999. Voer dan het aantal ingegeven waarden uit, de hoogste waarde, 
    de laagste waarde en de gemiddelde waarde. De in te geven waarden zijn integers. Het berekend gemiddelde 
    is een decimaal getal. Vergeet niet in de class Oefening12Waarnemer de temperaturen te initialiseren.
 */
package jpf.classesobjectsinheritance;

import java.util.Scanner;

/**
 *
 * @author zi05
 */
public class Oefening12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Oefening12Waarnemer w = new Oefening12Waarnemer();
        System.out.print("Geef een temperatuur:");
        int ingelezenTemperatuur = sc.nextInt();
        while (ingelezenTemperatuur != 999) {
            w.nieuweRegistratie(ingelezenTemperatuur);
            System.out.print("Geef een nieuwe temperatuur:");
            ingelezenTemperatuur = sc.nextInt();
        }
        System.out.println("Het resultaat van " + w.getAantalWaarnemingen() + " waarnemingen:");
        System.out.println("Minimum:" + w.getMinimumTemperatuur());
        System.out.println("Maximum:" + w.getMaximumTemperatuur());
        System.out.println("Gemiddelde:" + w.getGemiddeldeTemperatuur());
    }
}
