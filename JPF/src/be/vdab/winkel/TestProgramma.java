/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.vdab.winkel;

import java.util.Iterator;
import java.util.Map;

public class TestProgramma {

    public static void main(String[] args) {
        Catalogus catalogus = new Catalogus(); //wordt meteen gevuld door de constructor
        Iterator<Product> pi = catalogus.iterator();
        int i = 1;
        Mandje mandje = new Mandje();
        //mandje programmatorisch vullen 
        while (pi.hasNext()) {
            Product p = pi.next();
            System.out.println(p);
            i++;
            if (i % 2 == 0) {
                mandje.add(p, i);
            }
        }
        System.out.println("u kocht:");
        Iterator<Map.Entry<Product, Integer>> mi = mandje.iterator();
        while (mi.hasNext()) {
            Map.Entry<Product, Integer> aankoop = mi.next();
            System.out.printf("%s %d \n", aankoop.getKey(), aankoop.getValue());
        }
        System.out.printf("u kocht voor een totaal van: %.2f \n", mandje.getSom());
    }
}
