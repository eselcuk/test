/*
    Oefening 8:
    Laat met de randomgenerator 100 getallen genereren tussen 1 en 1000 en stop ze in een array.
    Sorteer de getallen en voer ze uit van klein naar groot.
 */
package jpf.blocksstatementsandcontrolflows;

/**
 *
 * @author zi05
 */
public class Oefening8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] getallen = new int[100];
        // genereren van 100 willekeurige getallen tussen 1 en 1000 
        for (int i = 0; i < 100; i++) {
            getallen[i] = (int) (Math.random() * 1000 + 1);
        }
        // sorteren van de 100 getallen 
        for (int i = 0; i != getallen.length - 1; i++) {
            for (int j = i + 1; j != getallen.length; j++) {
                if (getallen[j] < getallen[i]) {
                    int tempGetal = getallen[i];
                    getallen[i] = getallen[j];
                    getallen[j] = tempGetal;
                }
            }
        } // tonen resultaat 
        for (int i = 0; i != getallen.length; i++) {
            System.out.println("getal(" + (i + 1) + "): " + getallen[i]);
        }
    }
}
