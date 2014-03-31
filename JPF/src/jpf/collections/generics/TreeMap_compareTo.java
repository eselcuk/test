/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpf.collections.generics;

import java.util.*;

public class TreeMap_compareTo {

    public static void main(String[] args) {
        //**** Eigen class Cursus gebruiken om volgorde van de key 
        // aan te tonen: compareTo() !! 
        //Map<Cursus, String> cursussen = new TreeMap<Cursus, String>();
        TreeMap<Cursus, String> cursussen = new TreeMap<Cursus, String>(); //make usage of extra methods available
        cursussen.put(new Cursus(5, "Word", 100), "Je leert omgaan met een tekstverwerker");
        cursussen.put(new Cursus(3, "Excel", 110), "Je leert omgaan met een spreadsheetprogramma");
        cursussen.put(new Cursus(1, "Windows", 90), "Je leert omgaan met windows");
        cursussen.put(new Cursus(4, "Access", 120), "Je leert omgaan met een databasetoepassing");
        cursussen.put(new Cursus(2, "Powerpoint", 80), "Je leert omgaan met een presentatieprogramma");
        cursussen.put(new Cursus(6, "PhotoShop", 100), "Je leert omgaan met een fotobewerkingsprogramma");
        System.out.println("** View van de Cursussen volgens Keys **");
        Iterator<Cursus> itCursus = cursussen.keySet().iterator();
        while (itCursus.hasNext()) {
            Cursus eenCursus = itCursus.next();
            String infoCursus = cursussen.get(eenCursus);
            System.out.println(eenCursus + " heeft als info: " + infoCursus);
        }
        // Extra methods by asigning cursussen to TreeMap 
        System.out.println("*** Extra methods Cursus ***");
        System.out.println("Eerste key: " + cursussen.firstKey());
        System.out.println("Laatste key: " + cursussen.lastKey());
        
        //SortedMap
        SortedMap<Cursus, String> cursussenSub = cursussen.subMap(new Cursus(0, "", 90), new Cursus(0, "", 120));
        System.out.print("*** View van de Key-Value-paren van de submap");
        System.out.println(" met prijs tss 90-120 ***");
        Iterator<Map.Entry<Cursus, String>> itSub = cursussenSub.entrySet().iterator();
        while (itSub.hasNext()) {
            System.out.println(itSub.next());
        }
    }
}
