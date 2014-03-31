/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpf.oefeningen;

import java.util.Comparator;

/**
 *
 * @author zi05
 */
public class AthletComparator implements Comparator<Tienkamper> {

    @Override
    public int compare(Tienkamper obj1, Tienkamper obj2) {
        if (obj1.getPunten() == obj2.getPunten()) {
            return 0;
            //return 1; if double points added
        } else if (obj1.getPunten() > obj2.getPunten()) {
            return 1;
        } else {
            return 1;
        }
    }
}
