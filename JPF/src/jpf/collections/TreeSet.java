package jpf.collections;

import java.util.Set;
import java.util.SortedSet;

public class TreeSet {

    public static void main(String[] args) {
        System.out.print("Set op basis van TreeSet");

        //Set ts = new java.util.TreeSet(); // makes a natural order from low to high
        SortedSet ts = new java.util.TreeSet(); //SortedSet provides extra methods above Set
        vul(ts);
        toon(ts);

        //Extra methods with SortedSet
        System.out.println("*** Extra methods ***");
        System.out.println("Eerste element: " + ts.first());
        System.out.println("Laatste element: " + ts.last());

        SortedSet ss = ts.subSet("boom", "even");
        System.out.print("*** SubSet van de TreeSet vanaf 'boom' tot 'even'");
        toon(ss);
    }

    private static void vul(Set s) {
        s.add("fiets");
        s.add("even");
        s.add("dak");
        s.add("dak");//no double entry
        s.add("citroen");
        //s.add(null); //no null value excepted due to compareTo()
        s.add("boom");
        s.add("aap");
    }

    private static void toon(Set s) {
        System.out.println();
        for (Object obj : s) {
            System.out.println(obj);
        }
    }
}
