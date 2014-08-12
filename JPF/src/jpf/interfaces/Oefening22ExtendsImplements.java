/*
    Oefening 22:
    Maak een interface Voorwerp. Deze interface beschrijft een void-method gegevensTonen() en een double-method winstBerekenen().
    Maak volgende classes die allen de interface Voorwerp implementeren :
    - Een class boekenrek met properties hoogte, breedte, aankoopprijs en winst. Deze winst is gelijk aan de aankoopprijs x 2.
    - Een class boek met properties titel, auteur, eigenaar, aankoopprijs en een genre. Alle boeken hebben als eigenaar “VDAB”.
    - Een class leesboek, afgeleid van boek, met property onderwerp en een winst die gelijk is aan de aankoopprijs x 1,5
    - Een class woordenboek, afgeleid van boek, met property taal en een winst gelijk aan de aankoopprijs x 1,75
    Voorzie voor alle classes een toString()-method.
    In het hoofdprogramma maak je 2 leesboeken, 2 woordenboeken en 2 boeken-rekken. Telkens één keer gebruik makend 
    van een defaultconstructor en één keer aan de hand van een constructor met parameters.
    Stop deze objecten in een array van het interfacetype Voorwerp. Doorloop deze array en toon alle gegevens van de 
    arrayelementen. Totaliseer de winst en voer deze uit. 
*/
package jpf.interfaces;

import be.vdab.voorwerpen.WoordenBoek;
import be.vdab.voorwerpen.LeesBoek;
import be.vdab.voorwerpen.BoekenRek;
import be.vdab.util.Voorwerp;

/**
 *
 * @author zi05
 */
public class Oefening22ExtendsImplements {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Voorwerp voorwerpen[] = new Voorwerp[6];
        voorwerpen[0] = new LeesBoek();
        voorwerpen[1] = new LeesBoek("Java by example", "J.P. Dupont", 18.85, "Informatica", "Java");
        voorwerpen[2] = new WoordenBoek();
        voorwerpen[3] = new WoordenBoek("Wolters N-F", "A.D.P. Vandervoort", 25.50, "Naslagwerken", "N-F");
        voorwerpen[4] = new BoekenRek();
        voorwerpen[5] = new BoekenRek(200.0F, 75.5F, 75.0F);
        double totaleWinst = 0.0;
        for (Voorwerp eenVoorwerp : voorwerpen) {
            totaleWinst += eenVoorwerp.winstBerekenen();
            eenVoorwerp.gegevensTonen();
        }
        System.out.println("Totale winst : " + totaleWinst);
    }
}
