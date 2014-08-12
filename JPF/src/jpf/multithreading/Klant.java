/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jpf.multithreading;

/**
 *
 * @author zi05
 */
public class Klant implements Runnable {
    private Stapel stapel;
    public Klant(Stapel stapel){
        this.stapel = stapel;
    }
    @Override
    public void run(){
        int aantalPannenKoekenGegeten = 0;
        while (aantalPannenKoekenGegeten != 50) {            
            if (stapel.neemPannenkoekWeg())
                aantalPannenKoekenGegeten++;
        }
        try {
            Thread.sleep(100);
        } catch (InterruptedException ie) {
            System.err.println(ie);
        }
    }
}
