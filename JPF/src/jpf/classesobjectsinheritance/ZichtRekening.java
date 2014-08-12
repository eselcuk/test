/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpf.classesobjectsinheritance;

import jpf.classesobjectsinheritance.Rekening;

/**
 *
 * @author zi05
 */
public class ZichtRekening extends Rekening {

    private int maxKrediet;

    public ZichtRekening(String reknr, int bedrag) throws RekeningException {
        super(reknr);
        maxKrediet = bedrag;
    }

    @Override
    public void afhalen(double bedrag) { //this overrides afhalen() in super class
        double testSaldo = saldo - bedrag + maxKrediet;
        if (testSaldo > 0) {
            saldo -= bedrag;
        }
    }

    @Override
    public double geefSaldo() {
        saldo -= 0.05;
        return saldo;
    }

}
