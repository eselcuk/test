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
public abstract class Rekening {

    private String rekeningNr;
    protected double saldo;

    public abstract double geefSaldo();

    public Rekening(String rekeningNr) throws RekeningException {
        isRekNrOk(rekeningNr);
        this.rekeningNr = rekeningNr;
        saldo = 0;
    }

    public void storten(double bedrag) {
        saldo += bedrag;
    }

    public void afhalen(double bedrag) {
        saldo -= bedrag;
    }

    public void overschrijven(Rekening reknr, double bedrag) {
        saldo -= bedrag;
        reknr.storten(bedrag);
    }

    @Override
    public String toString() {
        return rekeningNr + ", " + saldo;

    }

    private void isRekNrOk(String reknr) throws RekeningException {
        if (reknr.length() == 14) {
            int d1 = Integer.parseInt(reknr.substring(0, 3));
            int d2 = Integer.parseInt(reknr.substring(4, 11));
            int d3 = Integer.parseInt(reknr.substring(12, 14));
            long deeltal = d1 * 10000000L + d2;
            int rest = (int) (deeltal % 97);
            if (rest == 0) {
                rest = 97;
            }
            if (!(rest == d3)) {
                throw new RekeningException("Het rekeningnummer is fout !!", reknr);
            }
        } else {
            throw new RekeningException("Het rekeningnummer is fout (te kort) !!", reknr);
        }
    }
}
