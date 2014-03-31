/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpf.interfaces;

/**
 *
 * @author zi05
 */
public class Vrachtwagen implements Kost, Afschrijving {

    private String merk;
    private double kostPerKm;
    private int aantalKm;
    private double aankoopPrijs;
    private int voorzieneLevensduur;

    public Vrachtwagen(String merk, double kostPerKm, 
            int aantalKm,double aankoopPrijs, int voorzieneLevensduur) {
        this.merk = merk;
        this.kostPerKm = kostPerKm;
        this.aantalKm = aantalKm;
        this.aankoopPrijs = aankoopPrijs;
        this.voorzieneLevensduur = voorzieneLevensduur;
    }

    @Override
    public double bedragKost() {
        return kostPerKm * aantalKm;
    }

    @Override
    public boolean personeelsKost() {
        return false;
    }

    @Override
    public int termijn() {
        return voorzieneLevensduur;
    }

    @Override
    public double jaarlijksBedrag() {
        return aankoopPrijs / voorzieneLevensduur;
    }

    public int getAantalKm() {
        return aantalKm;
    }
}
