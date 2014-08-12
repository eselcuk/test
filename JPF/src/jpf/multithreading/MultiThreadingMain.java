/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpf.multithreading;

public class MultiThreadingMain {

    public static void main(String[] args) {

        InsectenLezerExtendsThread extendsThread1 = new InsectenLezerExtendsThread("c:/teksten/insecten1.csv", System.out);
        InsectenLezerExtendsThread extendsThread2 = new InsectenLezerExtendsThread("c:/teksten/insecten2.csv", System.err);
        extendsThread1.start();
        extendsThread2.start();

        /*
         InsectenLezerImplementsRunnable implementsRunnable1 = new InsectenLezerImplementsRunnable("c:/teksten/insecten1.csv", System.out);
         InsectenLezerImplementsRunnable implementsRunnable2 = new InsectenLezerImplementsRunnable("c:/teksten/insecten2.csv", System.err);
         Thread thread1 = new Thread(implementsRunnable1);
         Thread thread2 = new Thread(implementsRunnable2);
         thread1.run();
         thread2.run();
         try {
         thread1.join();
         thread2.join();

         System.out.print("aantal regels:");
         System.out.println(implementsRunnable1.getAantalRegels() + implementsRunnable2.getAantalRegels());

         } catch (InterruptedException ex) {
         // het uitvoeren van de join method kan een InterruptedException werpen 
         // Je ziet hierover meer later in de cursus 
         System.err.println(ex);
         }
         */
    }
}
