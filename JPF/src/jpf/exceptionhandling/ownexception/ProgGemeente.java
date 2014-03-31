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
public class ProgGemeente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
            Gemeente eenGemeente = new Gemeente("Ertvelde", 123);
        } catch (PostNrException e) {
            System.out.println(e.getMessage() + " " + e.getVerkeerdPostNr());
        }
    }
}
