/*
    Oefening 21:
    In deze oefening breiden we oefening 20 nog verder uit.
    Maak twee interfaces : Privaat en Milieu. In de interface Privaat voorzie je een void-method geefPrivateData(), 
    in de interface Milieu een void-method geefMilieuData().
    Werk deze interfaces uit in Voertuig door in de method geefPrivateData () enkel de polishouder en de 
    nummerplaat uit te voeren naar het scherm. Maak ook een method geefMilieuData() waarin je de properties pk, 
    kostprijs en verbruik uitvoert.
    In het hoofdprogramma maak je een array van Privaat. Stop een aantal voertuigen (vrachtwagens en personenwagens)
    in deze array en laat in een lus alle private gegevens zien. Probeer ook eens een array van Milieu te maken met 
    eveneens een aantal voertuigen erin en ga eens na welke methods er nu beschikbaar zijn. 
*/
package jpf.interfaces;

import jpf.classesobjectsinheritance.Privaat;
import jpf.classesobjectsinheritance.Milieu;
import jpf.classesobjectsinheritance.Vrachtwagen;
import jpf.classesobjectsinheritance.Personenwagen;
import jpf.classesobjectsinheritance.Voertuig;

/**
 *
 * @author zi05
 */
public class Oefening21Bestuurder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Met polimorhpism
        Voertuig opel1 = new Personenwagen();
        opel1.toon();
        System.out.println(opel1);

        Voertuig volvo1 = new Vrachtwagen();
        volvo1.toon();
        System.out.println(volvo1);

        //Zonder Polimorphism
        Personenwagen opel2 = new Personenwagen("Jan Klaase",
                14599.0F, 105, 6.8F, "KLM099", 5, 5);
        opel2.toon();
        System.out.println(opel2);

        Vrachtwagen volvo2 = new Vrachtwagen("Michel Dewolf", 214599.0F, 440, 33.1F, "PRD441", 6000.0F);
        volvo2.toon();
        System.out.println(volvo2);

        //met interface gebruik
        Privaat auto[] = new Privaat[]{opel1, opel2, volvo1, volvo2};
        for (Privaat eenAuto:auto)
            eenAuto.geefPrivateData();
        
        Milieu auto2[] = new Milieu[]{opel1, opel2, volvo1, volvo2};
        for(Milieu eenAuto:auto2)
            eenAuto.geefMilieuData();
    }

}
