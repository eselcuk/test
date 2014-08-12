/*
    Oefening 16:
    Probeer deze oefening op te lossen zonder computer.
    Beschouw een class Punt. Deze bestaat uit :
    - twee membervariabelen int x en int y die de coördinaten van het punt voorstellen.
    - een method melding() die een bericht op scherm toont
    - een method schrijf() voor het tonen van de waarde van deze coördinaten.
    Beschouw een class GekleurdPunt, afgeleid van Punt. Deze heeft:
    - een extra membervariabele String kleur.
    - een method schrijf() voor het tonen van de waarde van de coördinaten en het kleur.
    Beschouw een class GekleurdPuntMetDikte, afgeleid van GekleurdPunt. Deze heeft:
    - een extra membervariabele int dikte.
    - een method schrijf() voor het tonen van de waarde van de coördinaten, het kleur en de dikte van het punt.
    - een method extra() voor het tonen van een extra bericht

    Beschouw nu het volgende programma. Stel vast en verklaar wat er gebeurt.
 */
package jpf.classesobjectsinheritance;

/**
 *
 * @author zi05
 */
public class Oefening16 {

    public static void main(String[] args) {
        Punt p1 = new Punt();
        Punt p2 = new Punt();
        
        Punt g1 = new GekleurdPunt();
        Punt g2 = new GekleurdPunt();
        
        GekleurdPuntMetDikte d1 = new GekleurdPuntMetDikte();
        GekleurdPuntMetDikte d2 = new GekleurdPuntMetDikte();
        
        Punt p3 = new GekleurdPuntMetDikte();

        System.out.println(p3.schrijf() );
        
        System.out.println(d1.schrijf() );
        
        g1 = d1;
        System.out.println(g1.schrijf() );
        
        p3.extra();
        
        g1.melding();
        //d1 = p1;
        d1.melding();
    }

}
