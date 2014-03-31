/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpf.collections.generics;

import java.util.Comparator;

public class OmgekeerdAlfabetischComparator implements Comparator<String> {

    public int compare(String s1, String s2) {
        //reverts the natural ordering of comparteTo() method
        //return -s1.compareTo(s2);

        if (s1 == null || s2 == null) {
            throw new NullPointerException();
        } else {
            if (s1.compareTo(s2) == 0) {
                return 0;
            } else if (s1.compareTo(s2) < 0) {
                return 1;
            } else {
                return -1;
            }
        }
    }
}
