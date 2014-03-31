/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpf.classesobjectsinheritance;

/**
 *
 * @author zi05
 */
public class Oefening14KaartWithArray {

    private String[] kleuren = new String[]{
        "HARTEN", "RUITEN", "KLAVEREN", "SCHOPPEN"
    };
    private String[] rangen = new String[]{
        "2", "3", "4", "5", "6", "7", "8", "9", "10", "boer", "vrouw", "heer", "aas"
    };

    private int kleur;
    private int rang;

    public String getKleur() {
        return kleuren[kleur];
    }

    public String getRang() {
        return rangen[rang];
    }

    public Oefening14KaartWithArray() {
        kleur = (int) (Math.random() * kleuren.length);
        rang = (int) (Math.random() * rangen.length);
    }

    public void printKaart() {
        System.out.println("Kleur: " + getKleur()
                + "\tRang: " + getRang());
    }

    public boolean isHogerDan(Oefening14KaartWithArray k2) {
        if ((kleur >= k2.kleur) && (rang > k2.rang)) {
            return true;
        } else {
            return false;
        }
    }
}
