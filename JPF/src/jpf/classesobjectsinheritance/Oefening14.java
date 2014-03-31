/*
    Oefening 14:
    Schrijf een class Kaart.
    Een kaart heeft:
    - een kleur (harten, ruiten, klaveren of schoppen) en
    - een rang (2, 3, 4, 5, 6, 7, 8, 9, 10, boer, vrouw, heer, aas).
    Maak een constructor die een willekeurige kaart aanmaakt.
    Maak een method printKaart() die de kleur en de rang van een kaart weergeeft.
    Voeg aan de class Kaart een method isHogerDan() toe die de kaart vergelijkt met een andere kaart: 
    wanneer de kaart hoger in kleur en rang is dan de andere kaart, geeft deze method de waarde true terug, 
    anders false.
    De volgorde van de kleur en rang, die tussen de haakjes vermeld staat, is van klein naar groot opgesomd.
    Schrijf tevens een main()-programma waarin:
    - een eerste kaart wordt aangemaakt
    - de gegevens van deze kaart worden getoond op het scherm
    - een tweede kaart wordt aangemaakt
    - en ook hiervan de gegevens op het scherm worden getoond
    - de eerste kaart vergeleken wordt met de tweede kaart en aangeeft of deze kaart hoger in rang is dan 
      de tweede kaart.
    Tip: Je kan deze oefening op 2 manieren oplossen:
    a) zonder gebruik van enum voor kleur en rang
    b) met gebruik van enum voor kleur en rang: dan kan je gebruik maken van de ingebouwde compareTo() 
       method van een enum. Raadpleeg hiervoor eerst de documentatie.
 */
package jpf.classesobjectsinheritance;

/**
 *
 * @author zi05
 */
public class Oefening14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //KaartWithEnum eersteKaart = new KaartWithEnum();
        Oefening14KaartWithArray eersteKaart = new Oefening14KaartWithArray();
        eersteKaart.printKaart();
        System.out.println();
        
        //KaartWithEnum tweedeKaart = new KaartWithEnum();
        Oefening14KaartWithArray tweedeKaart = new Oefening14KaartWithArray();
        tweedeKaart.printKaart();
        System.out.println();
        
        eersteKaart.printKaart();
        System.out.print(" is");
        if (!eersteKaart.isHogerDan(tweedeKaart)) {
            System.out.print(" niet");
        }
        System.out.print(" groter dan ");
        tweedeKaart.printKaart();
    }

}
