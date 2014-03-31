/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.vdab.util;

/**
 *
 * @author zi05
 */
public class DatumException extends Exception {

    private String verkeerdDatum;

    public DatumException() {
    }

    public DatumException(String message) {
        super(message);
    }

    public DatumException(String msg,
            String datum) {
        super(msg);
        this.verkeerdDatum = datum;
    }


    public String getVerkeerdDatum() {
        return verkeerdDatum;
    }

}
