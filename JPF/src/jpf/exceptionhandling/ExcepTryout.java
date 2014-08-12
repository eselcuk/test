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
public class ExcepTryout {

    public static void main(String[] args) {
        int[] lijst = {2, 1, 3, 0, 5};
        try {
            int hoeveelste = Integer.parseInt(args[0]);
            try {
                System.out.println(lijst[hoeveelste]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Foutieve arrayindex: " + hoeveelste);
            }
            for (int i = 0; i < lijst.length; i++) {
                try {
                    System.out.println(hoeveelste / lijst[i]);
                } catch (ArithmeticException e) {
                    System.out.println("Deling door nul : "+ e.getMessage());
                }
            }
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }
    }
}
