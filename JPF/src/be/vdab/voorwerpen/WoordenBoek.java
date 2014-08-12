/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.vdab.voorwerpen;

import be.vdab.voorwerpen.Boek;

public class WoordenBoek extends Boek {
    private String taal;

    public WoordenBoek(){
        super();
        setTaal("geen taal");
    }

    public WoordenBoek(String titel, String auteur, double aankoopPrijs, String genre, String taal) {
        super(titel, auteur, aankoopPrijs, genre);
        setTaal(taal);
    }

    public String getTaal() {
        return taal;
    }

    public void setTaal(String taal) {
        this.taal = taal;
    }

    @Override
    public double winstBerekenen() {
        return this.getAankoopPrijs() * 1.75;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + taal;
    }
}
