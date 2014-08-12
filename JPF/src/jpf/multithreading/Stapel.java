/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpf.multithreading;

public class Stapel {

    private int aantalPannenkoeken;

    //thread works correct with synchronized
    //public synchronized void voegPannenkoekToe() {
    public void voegPannenkoekToe() {
        System.out.println("Nog een pannenkoek");
        synchronized (this) {       //synchronized block begins here instead of whole monitor
            ++aantalPannenkoeken;   //this is better considering performance issue
        }
    }

    synchronized public boolean neemPannenkoekWeg() {
        if (aantalPannenkoeken > 0) {
            --aantalPannenkoeken;
        }
        return true;
    }

    public int getAantalPannenkoeken() {
        return aantalPannenkoeken;
    }
}
