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
public class Bediende extends Werknemer {

    private double maandwedde = 1129.47D;

    public Bediende(int personeelnummer, String naam, WerknemersDatum datumInDienst, double maandwedde) throws WerknemerException {
        super(personeelnummer, naam, datumInDienst);
        setMaandwedde(maandwedde);
    }

    public double getMaandwedde() {
        return maandwedde;
    }

    public void setMaandwedde(double maandwedde) {
        this.maandwedde = maandwedde;
    }

     @Override
    public double getVerloning() {
        return getMaandwedde();
    }

    @Override
    public String toString() {
        return super.toString() + "\t" + getVerloning();
    }
    
}
