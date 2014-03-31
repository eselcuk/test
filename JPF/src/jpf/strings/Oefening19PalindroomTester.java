/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpf.strings;

/**
 *
 * @author zi05
 */
public class Oefening19PalindroomTester {

    public boolean isPalindroom(String tekst, boolean hoofdlettergevoelig) {
        String omgekeerd = new StringBuffer(tekst).reverse().toString();
        if (hoofdlettergevoelig) {
            return tekst.equals(omgekeerd);
        } else {
            return tekst.equalsIgnoreCase(omgekeerd);
        }
    }
}
