/*
    Oefening 5:
    We maken een array van 5 integers.
    De waarden worden opgevuld met willekeurige getallen tussen 1 en 100 (grenswaarden inbegrepen). 
    Gebruik hiervoor de method Math.random().
    Opgelet: deze method geeft een double terug tussen 0 (inbegrepen) en 1 (niet inbegrepen).
    Nadat de array gevuld is, wordt gevraagd om de vijf getallen, de som en de gemiddelde 
    waarde (als decimaal getal) te tonen. Om het gemiddelde te berekenen gebruik je een property 
    van de array om te weten hoeveel elementen er in de array aanwezig zijn.
 */
package jpf.arrays;

public class Oefening5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] getallen = new int[5];
        getallen[0] = (int) (Math.random() * 100) + 1;
        getallen[1] = (int) (Math.random() * 100) + 1;
        getallen[2] = (int) (Math.random() * 100) + 1;
        getallen[3] = (int) (Math.random() * 100) + 1;
        getallen[4] = (int) (Math.random() * 100) + 1;
        int som;
        float gemiddelde;
        som = getallen[0] + getallen[1] + getallen[2] + getallen[3] + getallen[4];
        gemiddelde = (float) som / getallen.length;
        System.out.println(getallen[0]);
        System.out.println(getallen[1]);
        System.out.println(getallen[2]);
        System.out.println(getallen[3]);
        System.out.println(getallen[4]);
        System.out.println("Som = " + som);
        System.out.println("Gemiddelde = " + gemiddelde);
    }

}
