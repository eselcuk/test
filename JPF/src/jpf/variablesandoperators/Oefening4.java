/*
    Oefening 4:
    Maak een programma dat een geheel aantal seconden, bijvoorbeeld 5924, omrekent in uren, minuten en seconden.
    Het resultaat: U:1 M:38 S:44
 */
package jpf.variablesandoperators;

public class Oefening4 {

    public static void main(String[] args) {
        int totSec = 5924;
        int uren = totSec/3600;
        int rest = totSec%3600;
        int minuten = rest/60;
        int seconden = rest%60;
        System.out.println("U:" + uren + 
                          " M:" + minuten + 
                          " S:" + seconden);

    }

}
