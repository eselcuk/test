/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.vdab.personeel.kader;

import be.vdab.personeel.Bediende;
import be.vdab.util.WerknemerException;
import be.vdab.util.WerknemersDatum;

/**
 *
 * @author zi05
 */
public class Kaderlid extends Bediende {

    private String functietitel = "manager";

    public Kaderlid(int personeelnummer, String naam, WerknemersDatum datumInDienst, double maandwedde, String functietitel) throws WerknemerException {
        super(personeelnummer, naam, datumInDienst, maandwedde);
        this.functietitel = functietitel;
    }

    public String getFunctietitel() {
        return functietitel;
    }

    public void setFunctietitel(String functietitel) {
        this.functietitel = functietitel;
    }

    @Override
    public String toString() {
        return super.toString() + "\t" + getFunctietitel();
    }
}
