/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpf.oefeningen;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author zi05
 */
public class Oefening30 {

    public static void main(String[] args) {
 
        Tienkamper Jone = new Tienkamper("Jone", 8813);
        Tienkamper Alex = new Tienkamper("Alex", 8813);
        Tienkamper Ekber = new Tienkamper("Ekber", 9991);
        Tienkamper Selcuk = new Tienkamper("Selcuk", 9991);
        Tienkamper Jone2 = new Tienkamper("Jone", 8813);
        Tienkamper Jürgen = new Tienkamper("Jürgen Hingsen", 8832);
        Tienkamper Roman = new Tienkamper("Roman Šebrle", 8891);
        Tienkamper Daley = new Tienkamper("Daley Thompson", 8847);
        Tienkamper Dan = new Tienkamper("Dan O'Brien", 8891);

        List<Tienkamper> lijst = new ArrayList<Tienkamper>(9);
        lijst.add(Jone);
        lijst.add(Alex);
        lijst.add(Ekber);
        lijst.add(Selcuk);
        lijst.add(Jone2);
        lijst.add(Jürgen);
        lijst.add(Roman);
        lijst.add(Daley);
        lijst.add(Dan);
        System.out.println("Alle tienkampers uit de arraylist " + "(=volgorde van toevoegen):");
        for (Tienkamper eenTienkamper : lijst) {
            System.out.println(eenTienkamper);
        }
        System.out.println();

        Set<Tienkamper> set = new TreeSet<Tienkamper>();
        set.add(Jone);
        set.add(Alex);
        set.add(Ekber);
        set.add(Selcuk);
        set.add(Jone2);
        set.add(Jürgen);
        set.add(Roman);
        set.add(Daley);
        set.add(Dan);
        System.out.println("Alle tienkampers uit de treeset " + "(=gesorteerd op naam):");
        for (Tienkamper eenTienkamper : set) {
            System.out.println(eenTienkamper);
        }
        System.out.println();

        //de arraylist sorteren op punten using (1)seperate Comparatore class, (2)innerclass
        //Comparator comp = new AthletComparator();
        Comparator comp = Tienkamper.getAscendingOrder();
        Collections.sort(lijst, comp);
        System.out.println("Alle tienkampers uit de arraylist, " + "gesorteerd op punten:");
        for (Tienkamper eenTienkamper : lijst) {
            System.out.println(eenTienkamper);
        }
        System.out.println();
        
        Comparator revOrder = Collections.reverseOrder();
        Set<Tienkamper> setOpPunten = new TreeSet<Tienkamper>(revOrder);
        setOpPunten.add(Jone);
        setOpPunten.add(Alex);
        setOpPunten.add(Ekber);
        setOpPunten.add(Selcuk);
        setOpPunten.add(Jone2);
        setOpPunten.add(Jürgen);
        setOpPunten.add(Roman);
        setOpPunten.add(Daley);
        setOpPunten.add(Dan);
        System.out.println("Alle tienkampers uit de treeset, " + "gesorteerd op punten:");
        for (Tienkamper eenTienkamper : setOpPunten) {
            System.out.println(eenTienkamper);
        }
        System.out.println();

        //fill(atleten);
        //print(atleten);
        //Set tset = new TreeSet<Tienkamper>(revOrder);
        //fill(tset);
        //print(tset);
    }

    private static void fill(Collection<Tienkamper> tienkamper) {
        tienkamper.add(new Tienkamper("Jone", 9));
        tienkamper.add(new Tienkamper("Alex", 8));
        tienkamper.add(new Tienkamper("Ekber", 10));
        tienkamper.add(new Tienkamper("Selcuk", 10));
        tienkamper.add(new Tienkamper("Jone", 9));
        tienkamper.add(new Tienkamper("Lucy", 6));
    }

    private static void print(Collection<Tienkamper> tienkamper) {
        System.out.println();
        for (Tienkamper aTienkamper : tienkamper) {
            System.out.println(aTienkamper);
        }
        System.out.println("");
    }
}
