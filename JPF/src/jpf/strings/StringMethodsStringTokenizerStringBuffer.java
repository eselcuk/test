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
/* * StringTokenizer */ import java.util.*;

public class StringMethodsStringTokenizerStringBuffer {

    public static void main(String[] args) {

        System.out.println(("StringTokenizer:").toUpperCase());
        stringTokenizer();

        System.out.println(("\nString methods:").toUpperCase());
        parseVanOfNaarOfOpsplits();

        System.out.println(("\nStringBuffer:").toUpperCase());
        stringBuffer();
    }

    static void stringTokenizer() {
        String tekst = "Een demo van de class StringTokenizer";
        StringTokenizer strTok = new StringTokenizer(tekst, " ");
        while (strTok.hasMoreTokens()) {
            System.out.println(strTok.nextToken());
        }
    }

    static void parseVanOfNaarOfOpsplits() {
        String tekst;
        int geluksgetal;

        //parse naar number
        System.out.println("Parsing to numbers:");
        tekst = "5.0";
        double temperatuur = Double.parseDouble(tekst);
        System.out.println(temperatuur);
        tekst = "7";
        geluksgetal = Integer.parseInt(tekst);
        System.out.println(geluksgetal);

        //parse naar string
        System.out.println("\nParsing to text:");
        temperatuur = 10.0;
        tekst = String.valueOf(temperatuur);
        System.out.println(tekst);
        geluksgetal = 7;
        tekst = String.valueOf(geluksgetal);
        System.out.println(tekst);

        //String opslitsen
        System.out.println("\nSplitting text:");
        String test = "Dit is een stukje tekst";
        String[] stukskes = test.split(" ");
        for (int i = 0; i < stukskes.length; i++) {
            System.out.println(stukskes[i]);
        }
        System.out.println("\nSplitting text partially:");
        test = "Dit is een stukje tekst";
        stukskes = test.split(" ", 3);
        for (int i = 0; i < stukskes.length; i++) {
            System.out.println(stukskes[i]);
        }
    }

    static void stringBuffer() {
        StringBuffer leeg = new StringBuffer();
        System.out.println(leeg.length() + ":" + leeg.capacity());
        StringBuffer naam = new StringBuffer("Eddy");
        System.out.println(naam.length() + ":" + naam.capacity());
        StringBuffer teVullen = new StringBuffer(30);
        System.out.println(teVullen.length() + ":" + teVullen.capacity());
        naam = new StringBuffer("germaine_de_coeur_brisee");
        for (int teller = 0; teller < naam.length(); teller++) {
            if (naam.charAt(teller) == '_') {
                naam.setCharAt(teller, ' ');
            }
        }
        System.out.println(naam);
        naam = new StringBuffer("Eddy");
        naam.append(' ');
        naam.append("Wally");
        naam.append(1);
        System.out.println(naam);
        naam.insert(0, "De grote ");
        System.out.println(naam);
        naam.delete(0, 9);
        System.out.println(naam);
    }
}
