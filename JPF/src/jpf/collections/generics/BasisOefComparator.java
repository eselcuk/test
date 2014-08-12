/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpf.collections.generics;

import java.util.*;

public class BasisOefComparator {

    public static void main(String[] args) {
        System.out.print("TreeSet in natural ordening");
        Set<String> ts = new TreeSet<String>();
        vul(ts);
        print(ts);
        System.out.print("TreeSet in volgorde van comparator-class: omgekeerd alfabetisch");
        Set<String> ts2 = new TreeSet<String>(new OmgekeerdAlfabetischComparator());
        vul(ts2);
        print(ts2);

        Map<String, String> landen = new TreeMap<String, String>(new OmgekeerdAlfabetischComparator());
        landen.put("B", "Belgie");
        landen.put("NL", "Nederland");
        landen.put("F", "Frankrijk");
        landen.put("D", "Duitsland");
        landen.put("L", "Luxemburg");
        System.out.println("*** View van de Key-Value-paren ***");
        Iterator itLanden = landen.entrySet().iterator();
        while (itLanden.hasNext()) {
            System.out.println(itLanden.next());
        }
        // reverted ordering using inner-class
        Map<Cursus, String> cursussen = new TreeMap<Cursus, String>(Cursus.getDalendePrijsComparator());
        // reverted ordering using class DalendePrijsComparator()
        //Map<Cursus, String> cursussen = new TreeMap<Cursus, String>(new DalendePrijsComparator());
        cursussen.put(new Cursus(5, "Word", 100), "Je leert omgaan met een tekstverwerker");
        cursussen.put(new Cursus(3, "Excel", 110), "Je leert omgaan met een spreadsheetprogramma");
        cursussen.put(new Cursus(1, "Windows", 90), "Je leert omgaan met windows");
        cursussen.put(new Cursus(4, "Access", 120), "Je leert omgaan met een databasetoepassing");
        cursussen.put(new Cursus(2, "Powerpoint", 80), "Je leert omgaan met een presentatieprogramma");
        cursussen.put(new Cursus(6, "PhotoShop", 100), "Je leert omgaan met een fotobewerkingsprogramma");
        System.out.println("*** View van de Key-Value-paren ***");
        Iterator itCursus = cursussen.entrySet().iterator();
        while (itCursus.hasNext()) {
            System.out.println(itCursus.next());
        }
    }

    private static void vul(Set<String> s) {
        s.add("even");
        s.add("citroen");
        s.add("fiets");
        s.add("boom");
        s.add("aap");
        s.add("dak");
    }

    private static void print(Set<String> s) {
        System.out.println();
        for (String woord : s) {
            System.out.println(woord);
        }
        System.out.println();
    }
}
