/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpf.streams;

import java.io.*;

public class BufferedStreamsTryout {

    public static void main(String[] args) {

        byte[] getallen = {2, 13, 14, 22, 29, 32, 17, 45, 44, 54, 4, 10,
            99, 16, 26, 55, 77, 34, 51, 2, 41, 18, 20, 94, 8, 13, 42, 53,
            66, 71, 82, 74, 36, 23, 21, 76, 16, 18, 48, 20, 3, 24, 3, 19,
            60, 11, 65, 91, 88, 74, 56, 23, 12, 1, 10, 32, 49, 56, 17, 21};

        //getallen naar bestand schrijven via buffer
        FileOutputStream schrijfLijst = null;
        BufferedOutputStream schrijfBuffer = null;
        try {

            //een nieuwe file en buffer aanmaken
            schrijfLijst = new FileOutputStream("getallen.dat");
            schrijfBuffer = new BufferedOutputStream(schrijfLijst);

            //alle getallen wegschrijven
            for (byte getal : getallen) {
                schrijfBuffer.write(getal);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } finally {
            //de file sluiten 
            if (schrijfBuffer != null) {
                try {
                    schrijfBuffer.close();
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }
        FileInputStream leesLijst = null;
        BufferedInputStream leesBuffer = null;
        //getallen inlezen vanaf bestand via buffer 
        try {
            //een nieuwe file en buffer aanmaken 
            leesLijst = new FileInputStream("getallen.dat");
            leesBuffer = new BufferedInputStream(leesLijst);
            //alle getallen inlezen 
            int getal;
            while ((getal = leesBuffer.read()) != -1) {
                System.out.println(getal);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } finally {
            if (leesBuffer != null) {
                try {
                    leesBuffer.close();
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}