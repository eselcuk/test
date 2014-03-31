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
public class ExcepTryout2 {

    public static void main(String[] args) {
        int[] lijst = {2, 1, 3, 0, 5};
        try {
            System.out.println(lijst[Integer.parseInt(args[0])]);
        } catch (RuntimeException e) {
            System.out.println("Foutieve arrayindex of ongeldig argument");
        }
    }
}
