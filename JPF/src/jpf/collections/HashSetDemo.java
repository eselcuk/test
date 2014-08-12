/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpf.collections;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author zi05
 */
public class HashSetDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Set op basis van HashSet");
        Set hs = new HashSet();
        vul(hs);
        toon(hs);
    }

    private static void vul(Set s) {
        s.add("fiets");
        s.add("even");
        s.add("dak");
        s.add("dak"); //double entry avoided
        s.add("citroen");
        s.add("boom");
        s.add(null); // null entry throw exception when its hashcode is called
        s.add("aap");
    }

    private static void toon(Set s) {
        System.out.println();
        for (Object obj : s) {
            //null entry results NullPointerException when hashCode() called
            //System.out.println(obj + "\t" + obj.hashCode());
            System.out.println(obj);
        }
    }
}
