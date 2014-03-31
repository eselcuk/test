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
public class Vrachtwagen extends Voertuig implements Vervuiler {

    private float maxLading = 10000F;

    public Vrachtwagen() {
        super();
    }

    public Vrachtwagen(String polishouder, float kostprijs, int pk, float gemVerbruik, String nummerplaat, float maxLading) {
        super(polishouder, kostprijs, pk, gemVerbruik, nummerplaat);
        setMaxLading(maxLading);
    }

    public float getMaxLading() {
        return maxLading;
    }

    public final void setMaxLading(float maxLading) {
        if (maxLading > 0) {
            this.maxLading = maxLading;
        }
    }

    @Override
    public String toString() {
        return super.toString() + "; " + maxLading;
    }

    @Override
    public void toon() {
        System.out.println("\nVRACHTWAGEN");
        super.toon();
        System.out.println("max. lading: " + maxLading);
    }

    @Override
    public double getKyotoScore() {
        return (getGemVerbruik() * getPk()) / (maxLading / 1000.0); //lading omzetten van kg naar ton
    }

    @Override
    public double geefVervuiling() {
        return getKyotoScore() * 20;
    }
}
