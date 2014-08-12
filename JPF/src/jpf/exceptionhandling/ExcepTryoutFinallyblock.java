/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpf.exceptionhandling;

/**
 *
 * @author zi05
 */
public class ExcepTryoutFinallyblock {

    public static void main(String[] args) {
        
        int[] lijst = {2, 1, 3, 0, 5};
        int eenGetal = 3;
        for (int i = 0; i < lijst.length; i++) {
            try {
                System.out.println(eenGetal + " / " + lijst[i] + " = " + eenGetal / lijst[i]);
            } catch (ArithmeticException e) {
                System.out.println("Deling door nul");
            } finally {
                System.out.println(lijst[i] + " x " + eenGetal + " = " + eenGetal * lijst[i]);
            }
        }
    }
}
