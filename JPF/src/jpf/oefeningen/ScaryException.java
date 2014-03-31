/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpf.oefeningen;

/**
 *
 * @author zi05
 */
public class ScaryException extends RuntimeException {

    //private String message;

    public ScaryException() {
    }

    public ScaryException(String message) {
        super(message);
        //this.message = message;
    }

/*    @Override
    public String getMessage() {
        return message;
    }
*/
}
