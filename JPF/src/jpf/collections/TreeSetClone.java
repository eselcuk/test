/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jpf.collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetClone {
   public static void main(String[] args) {
     // creating TreeSet 
     TreeSet <Integer>tree = new TreeSet<Integer>();
     TreeSet <Integer>clonetree = new TreeSet<Integer>();
     
     // adding in the tree
     tree.add(12);
     tree.add(13);
     tree.add(14);
     
     // cloning tree into clinetree
     clonetree = (TreeSet)tree.clone();  
 
     // creating iterator
     Iterator iterator;
     iterator = clonetree.iterator();
     
     // displaying the clonetree data
     System.out.println("Tree set data: ");     
     while (iterator.hasNext()){
        System.out.println(iterator.next() + " ");
     }
   }    
}