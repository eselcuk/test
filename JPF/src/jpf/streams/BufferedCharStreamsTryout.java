/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpf.streams;

import java.io.*;

public class BufferedCharStreamsTryout {

    public static void main(String[] args) {
        FileReader file = null;
        BufferedReader buffer = null;
        //tekst teken per teken inlezen en weergeven op scherm 
        try {
            //een nieuwe file aanmaken 
            file = new FileReader("weerbericht.txt");
            buffer = new BufferedReader(file);
            //alle tekens inlezen tot aan eof 
            int gelezenTeken;
            while ((gelezenTeken = buffer.read()) != -1) {
                System.out.print((char) gelezenTeken);
            }
            System.out.println();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } finally {
            if (buffer != null) {
                try {
                    buffer.close();
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }
    }
}
