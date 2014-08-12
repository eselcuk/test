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
public class PostNrException extends Exception //all methods of Exception have to be overriden
//can extend also RuntimeException, in this case super class methods have not to be overriden 
{
    private int verkeerdPostNr;

    public PostNrException(String omshcrijving) {
        super(omshcrijving);
    }

    public PostNrException(String omschrijving, int verkeerdPostNr) {
        super(omschrijving);
        this.verkeerdPostNr = verkeerdPostNr;
    }

    public int getVerkeerdPostNr() {
        return verkeerdPostNr;
    }
}
