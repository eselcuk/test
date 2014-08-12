/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpf.streams;

import java.io.Serializable;
import java.math.BigDecimal;

// object has to implement Serializable in order to write in/read from streams
public class Werknemer implements Serializable {
    private String voornaam;
    private String familienaam;
    private BigDecimal wedde;
    private transient String SSNumber;

    public Werknemer(String voornaam, String familienaam, BigDecimal wedde, String SSNumber) {
        this.voornaam = voornaam;
        this.familienaam = familienaam;
        this.wedde = wedde;
        this.SSNumber = SSNumber;
    }

    public String getVolledigeNaam() {
        return voornaam + " " + familienaam;
    }

    public BigDecimal getWedde() {
        return wedde;
    }

    public String getSSNumber() {
        return SSNumber;
    }

    public void setSSNumber(String SSNumber) {
        this.SSNumber = SSNumber;
    }
}
