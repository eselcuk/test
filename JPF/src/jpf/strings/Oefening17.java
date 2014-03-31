/*
    Oefening 17:
    De gebruiker tikt een zin in. Breng op het scherm hoeveel klinkers er in de zin staan
 */
package jpf.strings;

import java.util.Scanner;

/**
 *
 * @author zi05
 */
public class Oefening17 {

    private static final String KLINKERS = "aeiou";

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String zin = scan.nextLine().toLowerCase();
        int teller = 0;
        for (int i = 0; i != zin.length(); i++) {
            if (KLINKERS.indexOf(zin.charAt(i)) >= 0) {
                teller++;
            }
        }
        System.out.println("Er zitten " + teller + " klinkers in de zin:");
        System.out.println(zin);
    }

}
