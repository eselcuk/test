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
public class WerknemerException extends DatumException {

    private String verkeerdData;

    public WerknemerException() {
    }

    public WerknemerException(String message) {
        super(message);
    }

    public WerknemerException(String msg,
            String verkeerdData) {
        super(msg);
        this.verkeerdData = verkeerdData;
    }


    public String getVerkeerdData() {
        return verkeerdData;
    }

}
