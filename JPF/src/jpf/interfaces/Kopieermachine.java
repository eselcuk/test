/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpf.interfaces;

import jpf.interfaces.Kost;

/**
 *
 * @author zi05
 */
public class Kopieermachine implements Kost {

    private String merk;
    private double kostPerBlz;
    private int aantalBlz;

    public Kopieermachine(String merk, double kostPerBlz, int aantalBlz) {
        this.merk = merk;
        this.kostPerBlz = kostPerBlz;
        this.aantalBlz = aantalBlz;
    }

    @Override
    public double bedragKost() {
        return kostPerBlz * aantalBlz;
    }

    @Override
    public boolean personeelsKost() {
        return false;
    }

    public int getAantalBlz() {
        return aantalBlz;
    }
}
