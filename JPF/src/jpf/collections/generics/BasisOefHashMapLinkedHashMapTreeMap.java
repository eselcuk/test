/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpf.collections.generics;

import java.util.*;

public class BasisOefHashMapLinkedHashMapTreeMap {

    public static void main(String[] args) {
        //Map<String, String> landen = new HashMap<String, String>(); // ordering is the differs: orders wrt hashcode
        //Map<String, String> landen = new LinkedHashMap<String, String>(); // keeps the order of the entry

        //Map<String, String> landen = new TreeMap<String, String>(); // orders according to key values using compareTo()
        // assigning to TreeMap make use of additional methods available
        TreeMap<String, String> landen = new TreeMap<String, String>(); // orders according to key values using compareTo()
        landen.put("B", "Belgie");
        landen.put("NL", "Nederland");
        landen.put("F", "Frankrijk");
        landen.put("D", "Duitsland");
        landen.put("L", "Luxemburg");
        //landen.put(null, null); // null entry is not accepted by TreeMap due to compareTo() method
        String eenLand = landen.get("F");
        System.out.println("Land met code F: " + eenLand);
        String vorigLand = landen.put("F", "Finland");
        System.out.println("Vorig land met code F: " + vorigLand);
        eenLand = landen.get("F");
        System.out.println("Land met code F: " + eenLand);
        System.out.println("*** View van de Keys ***");
        Iterator<String> it = landen.keySet().iterator();
        while (it.hasNext()) {
            String landcode = it.next();
            eenLand = landen.get(landcode);
            System.out.println(landcode + " heeft als naam: " + eenLand);
        }
        System.out.println("*** View van de Values ***");
        it = landen.values().iterator();
        while (it.hasNext()) {
            String land = it.next();
            System.out.println(land);
        }
        System.out.println("*** View van de Key-Value-paren ***");
        Iterator it2 = landen.entrySet().iterator();
        while (it2.hasNext()) {
            System.out.println(it2.next());
        }
        // Extra methods available with assigning to TreeMap
        System.out.println("*** Extra methods ***");
        System.out.println("Eerste key: " + landen.firstKey());
        System.out.println("Laatste key: " + landen.lastKey());
        SortedMap<String, String> landenSub = landen.subMap("D", "M");
        System.out.println("*** View van de Key-Value-paren van de submap D-M ***");
        Iterator itSub = landenSub.entrySet().iterator();
        while (itSub.hasNext()) {
            System.out.println(itSub.next());
        }
    }
}
