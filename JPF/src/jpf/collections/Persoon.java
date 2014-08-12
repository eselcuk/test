/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpf.collections;

import java.math.BigDecimal;

/**
 *
 * @author zi05
 */
public class Persoon {

    private String naam;
    private BigDecimal loon;

    public Persoon(String naam, BigDecimal loon) {
        this.naam = naam;
        this.loon = loon;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public BigDecimal getLoon() {
        return loon;
    }

    public void setLoon(BigDecimal loon) {
        this.loon = loon;
    }

    @Override
    public String toString() {
        return "Naam: " + naam + ", loon: " + loon;
    }
}
