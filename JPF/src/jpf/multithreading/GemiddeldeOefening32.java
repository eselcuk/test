/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpf.multithreading;

public class GemiddeldeOefening32 {

    public static void main(String[] args) {
        double getallen[] = new double[1000000];
        double som1 = 0, som2 = 0;
        for (int i = 0; i < 1000000; i++) {
            getallen[i] = Math.random();
        }
        GemiddeldeRekenaar gemiddeldeRekenaar1 = new GemiddeldeRekenaar(getallen, 0, getallen.length / 2);
        GemiddeldeRekenaar gemiddeldeRekenaar2 = new GemiddeldeRekenaar(getallen, getallen.length / 2 - 1, getallen.length);
        Thread thread1 = new Thread(gemiddeldeRekenaar1);
        Thread thread2 = new Thread(gemiddeldeRekenaar2);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.err.println(e);
        }
        System.out.println(gemiddeldeRekenaar1.getGemiddelde());
        System.out.println(gemiddeldeRekenaar2.getGemiddelde());
        System.out.println((gemiddeldeRekenaar1.getGemiddelde()
                + gemiddeldeRekenaar2.getGemiddelde()) / 2);
    }
}
