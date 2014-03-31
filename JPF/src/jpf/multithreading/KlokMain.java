/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpf.multithreading;

import java.util.Scanner;

/**
 *
 * @author zi05
 */
public class KlokMain {
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Klok klok = new Klok();
        Thread thread = new Thread(klok);
        thread.setDaemon(true);
        thread.start();

        Scanner scanner = new Scanner(System.in);
        scanner.nextLine(); 
        // deze method wacht tot de gebruiker Enter drukt 
        thread.interrupt();
    }
}
