/*
    Oefening 19:
    Maak een class die in staat is om te onderzoeken of een ingevoerde tekst een palindroom is, hierbij al 
    dan niet rekening houdend met hoofd- of kleine letters. Voorbeelden van palindrooms: kok, lepel, parterretrap, 
    snelmeetsysteemlens.
    Maak een main waarin je een woord opvraagt en dit woord test.
    Tip: Gebruik een StringBuffer. Deze klasse heeft een method reverse() zodat men onmiddellijk kan 
    vergelijken of een tekst en zijn omgekeerde gelijk zijn.
 */
package jpf.strings;

import java.util.Scanner;

/**
 *
 * @author zi05
 */
public class Oefening19Palindroom {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //palindroomChecker();
        callPalindroomTester();

    }

    private static void callPalindroomTester() {
        Oefening19PalindroomTester palin = new Oefening19PalindroomTester();
        Scanner scan = new Scanner(System.in);
        String tekst = scan.next();
        if (palin.isPalindroom(tekst, true)) {
            System.out.println("Het woord is een zuiver palindroom.");
        } else {
            if (palin.isPalindroom(tekst, false)) {
                System.out.println("Het woord is, los van de hoofdletters");
                System.out.println(", een palindroom");
            } else {
                System.out.println("Het woord is geen palindroom !");
            }
        }
    }

    private static void palindroomChecker() {

        Scanner scan = new Scanner(System.in);
        String zin = scan.nextLine().toLowerCase();
        String revervedZin = (new StringBuffer(zin)).reverse().toString();
            
        if (zin.equals(revervedZin)) {
            System.out.println("Palindroom |" + zin + "=" + revervedZin);
        } else {
            System.out.println("Niet palindroom|" + zin + "#" + revervedZin);
        }

    }

}
