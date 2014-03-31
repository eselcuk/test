/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.vdab.personeel;

import be.vdab.util.WerknemerException;
import be.vdab.util.WerknemersDatum;

/**
 *
 * @author zi05
 */
public class Arbeider extends Werknemer {

    private float uurloon = 9.76F;

    public Arbeider(int personeelnummer, String naam, WerknemersDatum datumInDienst, float uurloon) throws WerknemerException {
        super(personeelnummer, naam, datumInDienst);
        setUurloon(uurloon);
    }

    public float getUurloon() {
        return uurloon;
    }

    public void setUurloon(float uurloon) {
        this.uurloon = uurloon;
    }

    @Override
    public double getVerloning() {
        return getUurloon() * 7.6 * 65 / 3D;
    }

    @Override
    public String toString() {
        return super.toString() + "\t" + getVerloning();
    }
}
