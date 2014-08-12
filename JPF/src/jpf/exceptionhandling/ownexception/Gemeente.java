/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpf.exceptionhandling.ownexception;

/**
 *
 * @author zi05
 */
public class Gemeente {

    private String naam;
    private int postNr;

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public void setPostNr(int postNr) throws PostNrException {
        if (postNr < 1000 || postNr > 9999) {
            throw new PostNrException("Verkeerd Postnr", postNr);
        }
        this.postNr = postNr;
    }

    public Gemeente(String naam, int postNr) throws PostNrException {
        setNaam(naam);
        setPostNr(postNr);
    }

    @Override
    public String toString() {
        return postNr + " " + naam;
    }
}
