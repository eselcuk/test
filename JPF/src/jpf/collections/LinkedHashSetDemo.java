/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpf.collections;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 *
 * @author zi05
 */
public class LinkedHashSetDemo {

    public static void main(String[] args) {
        System.out.print("Set op basis van LinkedHashSet");
        //Set lhs = new java.util.LinkedHashSetDemo();
        Set lhs = new LinkedHashSet();
        vul(lhs);
        toon(lhs);
    }

    private static void vul(Set s) {
        // order is kept as the same
        s.add("fiets");
        s.add("even");
        s.add("dak");
        s.add("dak");//double entry avoided
        //s.add(null); //throw NullPointerException when hashCode() is called
        s.add("citroen");
        s.add("boom");
        s.add("aap");
    }

    private static void toon(Set s) {
        System.out.println();
        for (Object obj : s) {
            System.out.println(obj + "\t" + obj.hashCode());
        }
    }
}
