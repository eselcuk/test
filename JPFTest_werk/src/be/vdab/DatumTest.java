/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.vdab;

import be.vdab.util.Datum;
import be.vdab.util.DatumException;

/**
 *
 * @Ekber Selcuk
 */
public class DatumTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            //Datum d1 = new Datum(32, 13, 5100);
            Datum d2 = new Datum();
            System.out.println("1:  1/1/1584 = " + d2);
            d2.setJaar(2000);
            System.out.println("2:  1/1/2000 = " + d2);
            d2.setMaand(2);
            System.out.println("3:  1/2/2000 = " + d2);
            d2.setDag(29);
            System.out.println("4:  29/2/2000 = " + d2);
            d2.setJaar(1900);
            System.out.println("5:  29/2/2000 = " + d2);
            d2.setDag(31);
            System.out.println("6:  29/2/2000 = " + d2);
            d2.setMaand(1);
            System.out.println("7:  29/1/2000 = " + d2);
            d2.setDag(31);
            System.out.println("8:  31/1/2000 = " + d2);
            d2.setMaand(2);
            System.out.println("9:  31/1/2000 = " + d2);
            d2.setJaar(1600);
            System.out.println("10:  31/1/1600 = " + d2);
        } catch (DatumException de) {
            System.err.println(de.getMessage() + ": " + de.getVerkeerdDatum());
        } catch (Exception e) {
        }

    }
}
