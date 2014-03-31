/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpf.collections;

import java.util.Set;

/**
 *
 * @author zi05
 */
public class CursusDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Set cursussen = new java.util.TreeSet();
        cursussen.add(new Cursus(5, "Word", 100));
        cursussen.add(new Cursus(3, "Excel", 110));
        cursussen.add(new Cursus(1, "Windows", 90));
        cursussen.add(new Cursus(4, "Access", 120));
        cursussen.add(new Cursus(2, "Powerpoint", 80));
        cursussen.add(new Cursus(6, "Powerpoint", 100));
        for (Object obj : cursussen) {
            Cursus eenCursus = (Cursus) obj;
            System.out.println(eenCursus); //this uses overriden method toString()
        }
    }
}
