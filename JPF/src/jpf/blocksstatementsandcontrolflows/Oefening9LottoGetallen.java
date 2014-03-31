/*
    Oefening 9:
    Genereer lotto-getallen, d.w.z. 6 verschillende getallen tussen 1 en 42 (inbegrepen) + een reservegetal.
    Publiceer in opklimmende volgorde.
 */
package jpf.blocksstatementsandcontrolflows;

/**
 *
 * @author zi05
 */
public class Oefening9LottoGetallen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // declaratie en initialisatie variabelen 
        int[] getallen = new int[7];
        int aantalGetallen = 0;
        // genereer 7 getallen 
        while (aantalGetallen < 7) {
            //genereer een getal 
            int randGetal = (int) (Math.random() * 42 + 1);
            // test of het getal niet reeds gekozen is 
            boolean dubbel = false;
            for (int i = 0; i != getallen.length && !dubbel; i++) {
                if (getallen[i] == randGetal) {
                    dubbel = true;
                }
            }
            //getal bewaren indien niet dubbel 
            if (!dubbel) {
                getallen[aantalGetallen++] = randGetal;
            }
        }
        // er zijn nu 7 verschillende getallen gevonden 
        // de eerste 6 worden gesorteerd, het zevende is 
        // het reservegetal 
        for (int i = 0; i != getallen.length - 2; i++) {
            for (int j = i + 1; j != getallen.length - 1; j++) {
                if (getallen[j] < getallen[i]) {
                    int tijdGetal = getallen[i];
                    getallen[i] = getallen[j];
                    getallen[j] = tijdGetal;
                }
            }
        }
        // uitvoer 
        System.out.println("De winnende lotto getallen zijn : ");
        for (int i = 0; i != getallen.length - 1; i++) {
            System.out.println(getallen[i]);
        }
        System.out.println("\nHet reservegetal is :");
        System.out.println(getallen[getallen.length - 1]);
    }
}
