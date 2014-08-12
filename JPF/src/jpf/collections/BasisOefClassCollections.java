/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpf.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class BasisOefClassCollections {

    public static void main(String[] args) {
        System.out.print("TreeSet: met algoritme van collections class");
        Comparator comp = Collections.reverseOrder();
        Set<String> ts = new TreeSet<String>(comp);
        vul(ts);
        toon(ts);
        System.out.print("List: met algoritme van collections class");
        List<String> al = new ArrayList<String>();
        vul(al);
        toon(al);
        System.out.print("List: na shuffle");
        Collections.shuffle(al);
        toon(al);

        /*  
        *   returns UnsupportedOperationException
        *   no elements can be added to an unmodifiableList
        */
        List ual = Collections.unmodifiableList(al); 
        ual.add("test");
        toon(ual);
    }

    private static void vul(Collection<String> s) {
        s.add("even");
        s.add("citroen");
        s.add("fiets");
        s.add("boom");
        s.add("aap");
        s.add("dak");
    }

    private static void toon(Collection<String> s) {
        System.out.println();
        for (String woord : s) {
            System.out.println(woord);
        }
        System.out.println();
    }
}
