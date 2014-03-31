/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.vdab.voorwerpen;

import be.vdab.voorwerpen.Boek;

/**
 *
 * @author zi05
 */
public class LeesBoek extends Boek {

    public LeesBoek() {
        super();
        setOnderwerp("geen onderwerp");
    }

    public LeesBoek(String titel, String auteur, double aankoopPrijs, String genre, String onderwerp) {
        super(titel, auteur, aankoopPrijs, genre);
        setOnderwerp(onderwerp);
    }
    private String onderwerp;

    public String getOnderwerp() {
        return onderwerp;
    }

    public void setOnderwerp(String onderwerp) {
        this.onderwerp = onderwerp;
    }

    @Override
    public double winstBerekenen() {
        return this.getAankoopPrijs() * 1.5;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + onderwerp;
    }
}
