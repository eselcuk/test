/*
    Oefening 10:
    Maak een programma waarin je de gebruiker vraagt hoeveel huisdieren hij/zij heeft. 
    Breng voor de aantallen 0 t/m 3 telkens een gepaste melding op het scherm. 
    Voor een aantal groter dan 3, breng een standaardbericht op het scherm.
 */
package jpf.blocksstatementsandcontrolflows;

import java.util.Scanner;

/**
 *
 * @author zi05
 */
public class Oefening10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Geef het aantal duisdieren: ");
        Scanner sc = new Scanner(System.in);
        int aantal = sc.nextInt();
        switch (aantal) {
            case 0:
                System.out.println("Bedankt voor de medewerking aan onze enquête.");
                break;
            case 1:
                System.out.println("U heeft één huisdier.");
                break;
            case 2:
                System.out.println("Een hond en een kat?");
                break;
            case 3:
                System.out.println("Dat kan al tellen!");
                break;
            default:
                System.out.println("Wat een beestenboel!");
                break;
        }
    }
}
