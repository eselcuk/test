/*
    Oefening 20:
    Voor deze oefening werk je verder met de oplossing van oefening 15. We breiden deze oefening uit 
    met een interface Vervuiler :
    public interface Vervuiler {
    public double geefVervuiling();
    }
    Implementeer deze interface in de classes Vrachtwagen en Personenwagen. Voor de personenwagen is 
    de vervuiling gelijk aan de Kyotoscore maal 5, voor de vrachtwagen de Kyotoscore maal 20.
    Maak ook een nieuwe class Stookketel. Deze class heeft een float-property CONorm (met bijhorende getter 
    en setter). Laat deze class de interface Vervuiler implementeren. De vervuiling is de CONorm maal 100.
    In het hoofdprogramma maak je vervolgens een array van Vervuiler. Je plaatst hierin een aantal objecten die 
    de interface Vervuiler implementeren. Je overloopt de array en van elk object toon je het resultaat van de 
    method geefVervuiling().
 */
package jpf.interfaces;

import jpf.classesobjectsinheritance.Personenwagen;
import jpf.classesobjectsinheritance.Vervuiler;

/**
 *
 * @author zi05
 */
public class Oefening20Bestuurder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // toon met polymorphism:
        Vervuiler[] vervuiler = new Vervuiler[5];

        vervuiler[0] = new Personenwagen();
//        System.out.println("Personenwagen extends Voertuig implementeerd Vervuiler: " + vervuiler[0]);
//        System.out.println("Vervuiling: " + vervuiler[0].geefVervuiling());
        
        vervuiler[1] = new jpf.classesobjectsinheritance.Vrachtwagen();
//        System.out.println("Vrachtwagen extends Voertuig implementeerd Vervuiler: " + vervuiler[1]);
//        System.out.println("Vervuiling: " + vervuiler[1].geefVervuiling());
        
        vervuiler[2] = new Stookketel();
        System.out.println("Stookketel implementeerd Vervuiler: " + vervuiler[2].toString());
        System.out.println("Vervuiling: " + vervuiler[2].geefVervuiling());
  
   
 
//        opel.setKostprijs(-15000);
//        opel.setAantalDeuren(-7);
//        opel.setAantalDeuren(0);
//        System.out.println(opel);  //opel2 is niet gewijzigd

        jpf.classesobjectsinheritance.Vrachtwagen volvo = new jpf.classesobjectsinheritance.Vrachtwagen("Michel Dewolf", 214599.0F, 440, 33.1F, "PRD441", 6000.0F);
        volvo.toon();
        System.out.println(volvo);
        
        Vervuiler opel = new Personenwagen("Jan Klaase", 14599.0F, 105, 6.8F, "KLM099", 5, 5);
        System.out.println("Personenwagen extends Voertuig implementeerd Vervuiler: " + opel);
        System.out.println(opel);
        System.out.println("Vervuiling: " + opel.geefVervuiling());
 
        Vervuiler daf = new jpf.classesobjectsinheritance.Vrachtwagen("DAF", 214599.0F, 440, 33.1F, "PRD441", 6000.0F);
        System.out.println("Vrachtwagen extends Voertuig implementeerd Vervuiler: " + daf);
        System.out.println(daf);
        System.out.println("Vervuiling: " + daf.geefVervuiling());
        
        Vervuiler stookketel = new Stookketel(7.5F);
        System.out.println("Stookketel implementeerd Vervuiler: " + stookketel.toString());
        System.out.println("Vervuiling: " + stookketel.geefVervuiling());
  



        System.out.println();
//        System.out.println("Kyotoscore personenwagen 1: " + opel.getKyotoScore());
//        System.out.println("Kyotoscore personenwagen 2: " + opel.getKyotoScore());
//        System.out.println("Kyotoscore vrachtwagen 1: " + volvo.getKyotoScore());
//        System.out.println("Kyotoscore vrachtwagen 2: " + volvo.getKyotoScore());
    }

}
