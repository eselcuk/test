/*
    Oefening 18:
    Maak een class die een input onder de vorm
    17 + 38 * 2 – 22
    aanvaardt, dit uiteenrafelt in integers en bewerkingstekens, die de bewerkingen uitvoert en die het 
    resultaat publiceert. Het scheidingsteken is een spatie!
    Tip: Zoek een geschikte method in de class String die hier handig gebruikt kan worden.
    Ga er van uit dat de gebruiker geen fouten maakt bij het ingeven. Voer alle bewerkingen uit van 
    links naar rechts en niet volgens de juiste wiskundige rekenvolgorde (* / + - ). 
*/
package jpf.strings;

import java.util.Scanner;

/**
 *
 * @author zi05
 */
public class Oefening18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String bewerking = scan.nextLine();
        String[] delen = bewerking.split(" ");
        //in geval van een lege expressie bevat de array delen 1 
        //element, nl. een lege string: "" 
        int getal = 0;
        // eerste cijfer in uitkomst zetten om te sommeren 
        int uitkomst;
        if (!delen[0].isEmpty()) {
            uitkomst = Integer.parseInt(delen[0]);
        } else {
            uitkomst = 0;
        }
        int i = 1;
        while (i != delen.length) {
            char bewTeken = delen[i++].charAt(0);
            if (i != delen.length) {
                getal = Integer.parseInt(delen[i]);
                switch (bewTeken) {
                    case '+':
                        uitkomst += getal;
                        break;
                    case '-':
                        uitkomst -= getal;
                        break;
                    case '*':
                        uitkomst *= getal;
                        break;
                    case '/':
                        if (getal != 0) {
                            uitkomst /= getal;
                        }
                }
                i++;
            }
        }

        System.out.println(bewerking
                + " = " + uitkomst);
    }
}
