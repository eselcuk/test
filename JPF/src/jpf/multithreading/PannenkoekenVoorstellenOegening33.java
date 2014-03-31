/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpf.multithreading;

import java.util.ArrayList;
import java.util.List;

public class PannenkoekenVoorstellenOegening33 {

    public static void main(String[] args) {
        Stapel stapel = new Stapel();
        List<Thread> threads = new ArrayList<Thread>();
        for (int i = 0; i != 2; i++) {
            threads.add(new Thread(new Kok(stapel)));
        }
        for (int i = 0; i != 4; i++) {
            threads.add(new Thread(new Klant(stapel)));
        }
        for (Thread thread : threads) {
            thread.start();
        }
        try {
            for (Thread thread : threads) {
                thread.join();
            }
        } catch (InterruptedException ex) {
            System.err.println(ex);
        }
        System.out.println(stapel.getAantalPannenkoeken());
    }

}

