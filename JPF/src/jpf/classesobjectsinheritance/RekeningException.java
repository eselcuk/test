/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpf.classesobjectsinheritance;

/**
 *
 * @author zi05
 */
public class RekeningException extends Exception {

    private String rekNr;

    public RekeningException() {
    }

    public RekeningException(String message) {
        super(message);
    }

    public RekeningException(String message, String nr) {
        super(message);
        this.rekNr = nr;
    }

    public String getVerkeerdNummer() {
        return " => " + rekNr;
    }
}
