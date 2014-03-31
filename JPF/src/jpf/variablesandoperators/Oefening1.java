/*
    Oefening 1:
    Maak een java-programma waarin verschillende data-types gedeclareerd en geïnitialiseerd worden.
    Gebruik de instructie System.out.println() om het resultaat te controleren.
 */
package jpf.variablesandoperators;

/**
 *
 * @author zi05
 */
public class Oefening1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int geheelGetal = 5;
        long teller = 34521123L;
        float decimaalGetal = 1.5F;
        double grootDecGetal = 123456789.34;
        char eenTeken = 'a';
        boolean gehuwd = true;
        String verhaal = "Er was eens...";
        System.out.println(geheelGetal);
        System.out.println(teller);
        System.out.println(decimaalGetal);
        System.out.println(grootDecGetal);
        System.out.println(eenTeken);
        System.out.println(gehuwd);
        System.out.println(verhaal);
    }

}
