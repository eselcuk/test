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
public class Personenwagen extends Voertuig implements Vervuiler {

    private int aantalDeuren = 4;
    private int aantalPassagiers = 5;

    public Personenwagen() {
    }

    public Personenwagen(String polishouder, float kostprijs, int pk, float gemVerbruik, String nummerplaat, int aantalDeuren, int aantalPassagiers) {
        super(polishouder, kostprijs, pk, gemVerbruik, nummerplaat);
        setAantalDeuren(aantalDeuren);
        setAantalPassagiers(aantalPassagiers);
    }

    public int getAantalDeuren() {
        return aantalDeuren;
    }

    public final void setAantalDeuren(int aantalDeuren) {
        if (aantalDeuren > 0) {
            this.aantalDeuren = aantalDeuren;
        }
    }

    public int getAantalPassagiers() {
        return aantalPassagiers;
    }

    public final void setAantalPassagiers(int aantalPassagiers) {
        if (aantalPassagiers > 0) {
            this.aantalPassagiers = aantalPassagiers;
        }
    }

    @Override
    public String toString() {
        return super.toString() + "; " + aantalDeuren + "; " + aantalPassagiers;
    }

    @Override
    public void toon() {
        System.out.println("\nPERSONENWAGEN");
        super.toon();
        System.out.println("deuren: " + aantalDeuren + "\n"
                + "passagiers: " + aantalPassagiers);

    }

    @Override
    public double getKyotoScore() {
        return getGemVerbruik() * getPk() / aantalPassagiers;
    }

    @Override
    public double geefVervuiling() {
        return getKyotoScore() * 5;
    }
}
