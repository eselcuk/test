/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpf.oefeningen;

/**
 *
 * @author zi05
 */
public class KaartWithEnum {

    public enum Kleur {

        HARTEN, RUITEN, KLAVEREN, SCHOPPEN
    }

    public enum Rang {

        TWEE, DRIE, VIER, VIJF, ZES, ZEVEN, ACHT, NEGEN, TIEN, boer, vrouw, heer, aas
    }
    private Kleur kleur;
    private Rang rang;

    public KaartWithEnum() {
        Kleur[] alleKleuren = Kleur.values();
        kleur = alleKleuren[(int) (Math.random() * alleKleuren.length)];

        Rang[] alleRangen = Rang.values();
        rang = alleRangen[(int) (Math.random() * alleRangen.length)];
    }

    public String getKleur() {
        return kleur.toString();
    }

    public String getRang() {
        return rang.toString();
    }

    public void printKaart() {
        System.out.println("Kleur = " + getKleur() + "\tRang = " + getRang());
    }

    public boolean isHogerDan(KaartWithEnum k2) {
        return kleur.compareTo(k2.kleur) >= 0 && rang.compareTo(k2.rang) > 0;
    }
}
