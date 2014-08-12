/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.vdab.voorwerpen;

import be.vdab.util.Voorwerp;

/**
 *
 * @author zi05
 */
public class BoekenRek implements Voorwerp {

    private float hoogte;
    private float breedte;
    private float aankoopPrijs;

    public BoekenRek() {
        setHoogte(0.0F);
        setBreedte(0.0F);
        setAankoopPrijs(0.0F);
    }

    public BoekenRek(float hoogte, float breedte, float aankoopPrijs) {
        setHoogte(hoogte);
        setBreedte(breedte);
        setAankoopPrijs(aankoopPrijs);
    }

    public float getHoogte() {
        return hoogte;
    }

    public void setHoogte(float hoogte) {
        this.hoogte = hoogte;
    }

    public float getBreedte() {
        return breedte;
    }

    public void setBreedte(float breedte) {
        this.breedte = breedte;
    }

    public float getAankoopPrijs() {
        return aankoopPrijs;
    }

    public void setAankoopPrijs(float aankoopPrijs) {
        this.aankoopPrijs = aankoopPrijs;
    }

    @Override
    public double winstBerekenen() {
        return this.getAankoopPrijs() * 2.0;
    }

    @Override
    public void gegevensTonen() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return hoogte + ";" + breedte + ";" + +aankoopPrijs;
    }
}
