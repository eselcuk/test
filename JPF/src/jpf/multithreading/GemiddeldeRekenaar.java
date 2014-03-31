/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpf.multithreading;

public class GemiddeldeRekenaar implements Runnable {

    private double[] getallen;
    private int vanafIndex;
    private int totIndex;
    private double gemiddelde;

    public GemiddeldeRekenaar(double[] getallen, int vanafIndex, int totIndex) {
        this.getallen = getallen;
        this.vanafIndex = vanafIndex;
        this.totIndex = totIndex;
    }

    @Override
    public void run() {
        double totaal = 0;
        for (int i = vanafIndex; i != totIndex; i++) {
            totaal += getallen[i];
        }
        gemiddelde = totaal / (totIndex - vanafIndex);
    }

    public double getGemiddelde() {
        return gemiddelde;
    }
}
