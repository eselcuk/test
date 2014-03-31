/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpf.collections;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 *
 * @author zi05
 */
public class BigDecimalTest {

    public static void main(String[] args) {
        
        System.out.println("Faultive results with double/float primitive data types in precision control:");
        faultWithDoubleAndFloat();
        
        System.out.println("BigDecimal is the solution for precision control in digits:");
        correctWithBigDecimal();
    }

    public static void faultWithDoubleAndFloat() {
        double totaal = 0.0D;
        for (int i = 0; i < 1000; i++) {
            totaal += 0.01D;
        }
        System.out.println(totaal);
        float totaalf = 0.0F;
        for (int i = 0; i < 1000; i++) {
            totaalf += 0.01F;
        }
        System.out.println(totaalf);
    }

    public static void correctWithBigDecimal() {
        BigDecimal geluksGetal = new BigDecimal(7); //use this for int, long
        BigDecimal increment = new BigDecimal("0.01"); // use this for decimal numbers
        //check javadoc api for more methods

        BigDecimal eenBigDecimal = new BigDecimal("2.365");
        eenBigDecimal = eenBigDecimal.setScale(2, RoundingMode.HALF_UP); //round up, round down etc...

        //use this for precision control
        BigDecimal totaalBD = BigDecimal.ZERO;
        BigDecimal incremBD = new BigDecimal("0.01");
        for (int i = 0; i < 1000; i++) {
            totaalBD = totaalBD.add(incremBD);
        }
        System.out.println(totaalBD);

    }

}
