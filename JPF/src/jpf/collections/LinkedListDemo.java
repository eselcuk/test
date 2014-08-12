/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpf.collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author zi05
 */
public class LinkedListDemo {

    public static void main(String[] args) {
        System.out.println("List op basis van LINKEDLIST");
        List ll = new LinkedList();
        vul(ll);
        toon(ll);
        System.out.println("Nieuwe elementen");
        ll.add(3, "test");
        ll.add("beer");
        toon(ll);
        //tweede String citroen vervangen door "tweede citroen" 
        System.out.println("Element vervangen");
        ListIterator li = ll.listIterator(6);
        li.next();
        li.set((String) "tweede citroen");
        li.add("kers");
        System.out.print("LinkedList afgedrukt vanaf element 2");
        toonVanafIndex(ll, 2);
        System.out.print(
                "\nLinkedList omgekeerd afgedrukt");
        toonVanafIndexOmgekeerd(ll, ll.size());

        //extra methods van de LinkedList 
        System.out.println("\nExtra methods van de LinkedList");
        //we use Linkedlist (not List) because methods used belove are specific for LinkedList
        LinkedList llijst = new LinkedList();
        vul(llijst);
        System.out.println(llijst.getFirst());
        System.out.println(llijst.getLast());
        llijst.addFirst("eerste");
        llijst.addLast("laatste");
        System.out.println(llijst.getFirst());
        System.out.println(llijst.getLast());
        System.out.println(llijst.removeFirst());
        System.out.println(llijst.removeLast());
        System.out.println(llijst.getFirst());
        System.out.println(llijst.getLast());
    }

    private static void vul(List lijst) {
        lijst.add("fiets");
        lijst.add(null);
        //null-element toegestaan
        lijst.add("even");
        lijst.add("dak");
        lijst.add("citroen");
        lijst.add("citroen");
        //dubbels toegestaan 
        lijst.add("boom");
        lijst.add("aap");
    }

    private static void toon(List lijst) {
        System.out.println("*** Met een for-statement ***");
        for (int i = 0; i < lijst.size(); i++) {
            String woord = (String) lijst.get(i);
            System.out.println(woord);
        }
        System.out.println("*** Met een for-each ***");
        for (Object obj : lijst) {
            String woord = (String) obj;
            System.out.println(woord);
        }
        System.out.println("*** Met de iterator ***");
        for (Iterator i = lijst.iterator(); i.hasNext();) {
            String woord = (String) i.next();
            System.out.println(woord);
        }
    }

    private static void toonVanafIndex(List l, int startPos) {
        System.out.println();
        ListIterator li;
        for (li = l.listIterator(startPos); li.hasNext();) {
            System.out.println(li.next());
        }
    }

    private static void toonVanafIndexOmgekeerd(List l, int startPos) {
        System.out.println();
        ListIterator li;
        for (li = l.listIterator(startPos); li.hasPrevious();) {
            System.out.println(li.previous());
        }
    }
}
