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
public abstract class Boek implements Voorwerp {

    private String titel;
    private String auteur;
    private static String eigenaar = "VDAB";
    private double aankoopPrijs;
    private String genre;

    public Boek() {
        setTitel("geen titel");
        setAuteur("geen auteur");
        setAankoopPrijs(0.0D);
        setGenre("geen genre");
    }

    public Boek(String titel, String auteur, double aankoopPrijs, String genre) {
        setTitel(titel);
        setAuteur(auteur);
        setAankoopPrijs(aankoopPrijs);
        setGenre(genre);
    }

    public String getTitel() {
        return titel;
    }

    public String getAuteur() {
        return auteur;
    }

    public String getEigenaar() {
        return this.eigenaar;
    }

    public double getAankoopPrijs() {
        return aankoopPrijs;
    }

    public String getGenre() {
        return genre;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public void setAankoopPrijs(double aankoopPrijs) {
        this.aankoopPrijs = aankoopPrijs;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public void gegevensTonen() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return titel + ", " + auteur + ", " + aankoopPrijs + ", " + genre + ", " + eigenaar;
    }

}
