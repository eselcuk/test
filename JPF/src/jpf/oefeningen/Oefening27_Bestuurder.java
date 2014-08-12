/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpf.oefeningen;

import jpf.classesobjectsinheritance.Vrachtwagen;
import jpf.classesobjectsinheritance.Personenwagen;
import jpf.classesobjectsinheritance.Voertuig;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author zi05
 */
public class Oefening27_Bestuurder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Met polimorhpism
        Voertuig opel1 = new Personenwagen();
        Voertuig volvo1 = new Vrachtwagen();
        //Zonder Polimorphism
        Personenwagen opel2 = new Personenwagen("Jan Klaase", 14599.0F, 105, 6.8F, "KLM099", 5, 5);
        Vrachtwagen volvo2 = new Vrachtwagen("Michel Dewolf", 214599.0F, 440, 33.1F, "PRD441", 6000.0F);

        Personenwagen opel3 = new Personenwagen("Jan Klaase", 14599.0F, 105, 6.8F, "KLM0999", 5, 5);
        Vrachtwagen volvo3 = new Vrachtwagen("Michel Dewolf", 214599.0F, 440, 33.1F, "PRD4412", 6000.0F);

        Set<Voertuig> tsWagens = new TreeSet<Voertuig>();
        tsWagens.add(opel1);
        tsWagens.add(opel2);
        tsWagens.add(volvo1);
        tsWagens.add(volvo2);
        tsWagens.add(volvo3);
        tsWagens.add(opel3);

        for (Object obj : tsWagens) {
            //for (Iterator it = tsWagens.iterator(); it.hasNext();) {
            //Object obj = it.next();
            Voertuig eenWagen = (Voertuig) obj;
            System.out.println(eenWagen);
        }

    }

}
