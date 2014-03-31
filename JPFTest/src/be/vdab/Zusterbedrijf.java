/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package be.vdab;

import be.vdab.personeel.Werknemer;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class Zusterbedrijf {

    public static void main(String[] args) {

        //fileObjectOutput(werknemers);
        //System.out.println("test file input");
        fileObjectInput();
    }

    private static void toon(Werknemer[] werknemers) {
        //System.out.println();
        for (Object object : werknemers) {
            System.out.println(object);
        }
    }
     public static void fileObjectInput() {
        FileInputStream file = null;
        ObjectInputStream obj = null;
        try {
            //een nieuwe fileInputstream en objectInputstream maken 
            file = new FileInputStream("personeel.dat");
            obj = new ObjectInputStream(file);
            //System.out.println("test 3");
            SortedSet ss = (TreeSet) obj.readObject();

            Werknemer[] werknemers = new Werknemer[ss.size()];
            //System.out.println("set size: " + set.size());
            int index = 0;
            for (Iterator it = ss.iterator(); it.hasNext();) {
                Object o = it.next();
                if (o instanceof Werknemer) {
                    werknemers[index] = (Werknemer) o;
                } //else {  }
                index++;
            }
            toon(werknemers);
            //System.out.println("test 4");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            //de file sluiten 
            if (obj != null) {
                try {
                    obj.close();
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }
    }
}
