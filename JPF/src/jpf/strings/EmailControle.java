/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpf.strings;

/**
 *
 * @author zi05
 */
public class EmailControle {

    private static String email1 = "kamiel.kafka@praag.be";
    private static String email2 = "kamiel@kafka@praag.be";
    private static String email3 = "kamiel.kafka@";

    public static void main(String[] args) {
        System.out.println("Email1");
        controleer(email1);
        System.out.println("\nEmail2");
        controleer(email2);
        System.out.println("\nEmail3");
        controleer(email3);
    }

    private static void controleer(String s) {
        String antw = "";
        int plaats;
        int lengte = s.length();
        if (lengte < 4) {
            antw.concat("e-mail adres is te kort\n");
        }
        plaats = s.indexOf('@');
        if (plaats < 0) {
            antw += "Er moet een @ in het adres voorkomen.\n";
        }
        if (plaats == 0 || plaats == (--lengte)) {
            antw += "De @ mag niet helemaal voor- of achteraan staan.\n";
        }
        if (plaats >= 0 && plaats != s.lastIndexOf('@')) {
            antw += "Er mag maar één @ voorkomen.\n";
        }
        if (s.lastIndexOf('.') < s.lastIndexOf('@')) {
            antw += "Na de @ moet er nog minstens één punt volgen.";
        }
        if (antw.length() == 0) {
            antw = "Alle controles zijn goed bevonden";
        }
        System.out.println(antw);
    }
}
