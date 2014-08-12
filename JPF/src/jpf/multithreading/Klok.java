/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpf.multithreading;

import java.util.Date;

/**
 *
 * @author zi05
 */
public class Klok implements Runnable {

    @Override
    public void run() {
        boolean verderDoen = true;
        while (verderDoen) {
            System.out.println(new Date());
           /* if (Thread.interrupted()){
                verderDoen = false;
            }*/
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                verderDoen = false; // klok stopzetten
                // het uitvoeren van de sleep method 
                // kan een InterruptedException werpen 
                // Je ziet hierover meer later in de cursus 
                System.err.println(ex);
            }
        }
    }
}
