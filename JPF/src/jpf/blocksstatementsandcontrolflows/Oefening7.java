/*
    Oefening 7:
    Controle op de random-generator.
    Laat de randomgenerator 10.000 willekeurige gehele getallen genereren tussen 1 en 100 (grenswaarden inbegrepen).
    Toon op het scherm hoe dikwijls ieder getal is gegenereerd.
 */
package jpf.blocksstatementsandcontrolflows;

/**
 *
 * @author zi05
 */
public class Oefening7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] getallen = new int[100];
        // genereren van 10000 willekeurige getallen 
        for (int i = 0; i < 10000; i++) {
            int randGetal = (int) (Math.random() * 100);
            getallen[randGetal] += 1;
        }
        // publiceren van het resultaat 
        for (int i = 0; i != getallen.length; i++) {
            System.out.println("getal " + (i + 1) + " : " + getallen[i]);
        }
    }
}
