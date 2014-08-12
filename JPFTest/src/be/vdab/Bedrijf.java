/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.vdab;

import be.vdab.personeel.Arbeider;
import be.vdab.personeel.Bediende;
import be.vdab.personeel.Werknemer;
import be.vdab.personeel.kader.Kaderlid;
import be.vdab.util.DatumException;
import be.vdab.util.WerknemersDatum;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectOutputStream;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author zi05
 */
public class Bedrijf {

    public static void main(String[] args) {
        SortedSet<Werknemer> werknemers = new TreeSet<Werknemer>();
        try {
            werknemers.add(new Arbeider(1, "Anna", new WerknemersDatum(1, 2, 1980), 15));
            werknemers.add(new Bediende(2, "Brenda", new WerknemersDatum(1, 3, 1980), 1500));
            werknemers.add(new Arbeider(3, "Carla", new WerknemersDatum(1, 2, 1979), 15));
            werknemers.add(new Bediende(4, "Daniella", new WerknemersDatum(1, 3, 1978), 1500));
            werknemers.add(new Kaderlid(5, "Els", new WerknemersDatum(13, 3, 1977), 2500, "chef"));
            //System.out.println("test 1");
            toon(werknemers);
            //System.out.println("test 2");
        } catch (DatumException de) {
            System.err.println(de.getMessage());
        //} catch (WerknemerException we) {
        }
        fileObjectOutput(werknemers);
    }

    public static void toon(SortedSet sets) {
        //System.out.println();
        for (Object object : sets) {
            System.out.println(object);
        }
    }

    public static void fileObjectOutput(SortedSet ss) {
        FileOutputStream file = null;
        ObjectOutputStream obj = null;
        try {
            file = new FileOutputStream("personeel.dat");
            obj = new ObjectOutputStream(file);
            //System.out.println("test 1");
            obj.writeObject(ss);
            //System.out.println("test 2");
        } catch (InvalidClassException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            if (obj != null) {
                try {
                    obj.close();//outputstream sluiten 
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }
    }
}
