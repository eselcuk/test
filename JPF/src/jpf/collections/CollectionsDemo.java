/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpf.collections;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/**
 *
 * @author zi05
 */
public class CollectionsDemo {

    public static void main(String[] args) {

        Collection coll = new HashSet<>();

        coll.add(new Persoon("Jan", new BigDecimal("2100.85")));
        coll.add(new Persoon("Jos", new BigDecimal("1890.10")));
        coll.add(new Persoon("Jef", new BigDecimal("2400.55")));
        BigDecimal somLoon = BigDecimal.ZERO;
        Iterator i = coll.iterator();

        while (i.hasNext()) {
            Object o = i.next();
            if (o instanceof Persoon) {
                Persoon p = (Persoon) o;
                somLoon = somLoon.add(p.getLoon());
                System.out.println(p);
            }
        }
        System.out.println("Loon totaal: " + somLoon);
    }
}
