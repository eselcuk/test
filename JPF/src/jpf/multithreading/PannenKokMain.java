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
public class PannenKokMain {

    public static void main(String[] args) {
        Stapel stapel = new Stapel();
        Thread thread1 = new Thread(new Kok(stapel));
        Thread thread2 = new Thread(new Kok(stapel));
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException ex) {
            System.err.println(ex);
        }
        System.out.println(stapel.getAantalPannenkoeken());
    }

}
