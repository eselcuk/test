/*
    Oefening 23:
    In deze oefening werk je de oplossing van oefening 22 verder uit.
    Stop de objecten als volgt in een package-structuur:
    Package be.vdab.util bevat:
    - de interface Voorwerp
    Package be.vdab.voorwerpen bevat:
    - de class Boekenrek
    - de class Boek
    - de class Leesboek
    - de class Woordenboek
    Het hoofdprogramma zit in de package be.vdab.
 */

package be.vdab;

import be.vdab.util.Voorwerp;
import be.vdab.voorwerpen.BoekenRek;
import be.vdab.voorwerpen.LeesBoek;
import be.vdab.voorwerpen.WoordenBoek;

/**
 *
 * @author zi05
 */
public class Oefening23ExtendsImplements {
      
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
