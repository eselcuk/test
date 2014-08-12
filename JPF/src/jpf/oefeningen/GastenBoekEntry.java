/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jpf.oefeningen;

import java.io.Serializable;
import java.util.Date;

public class GastenBoekEntry implements Serializable {
    private static final long serialVersionUID = 1L;
    private Date datum;
    private String schrijver;
    private String boodschap;

    public GastenBoekEntry(String schrijver, String boodschap) {
        this.datum = new Date();
        this.schrijver = schrijver;
        this.boodschap = boodschap;
    }

    public Date getDatum() {
        return datum;
    }

    public String getSchrijver() {
        return schrijver;
    }

    public String getBoodschap() {
        return boodschap;
    }
}