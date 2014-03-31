/*
    Oefening 6:
    Herneem vorige opdracht maar realiseer nu de oplossing door gebruik te maken van iteraties.
 */
package jpf.blocksstatementsandcontrolflows;

/**
 *
 * @author zi05
 */
public class Oefening6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] getallen = new int[10];
        int som = 0;
        float gemiddelde;
        int teller = getallen.length;
        while (--teller >= 0) {
            getallen[teller] = (int) (Math.random() * 100) + 1;
            som += getallen[teller];

        }
        gemiddelde = (float) som / getallen.length;
        for (int i = 0; i != getallen.length; i++) {
            System.out.println(getallen[i]);
        }
        System.out.println("Som = " + som);
        System.out.println("Gemiddelde = " + gemiddelde);
    }

}
