/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpf.streams;

import java.io.*;

public class BufferedFileWriterStreamsTryout {

    public static void main(String[] args) {
        FileWriter file = null;
        BufferedWriter buffer = null;
        //alle tekens van het alfabet wegschrijven
        try {
            //een nieuwe file aanmaken 
            file = new FileWriter("alfabet.txt");
            buffer = new BufferedWriter(file);
            buffer.write("Alle letters uit het alfabet");
            buffer.newLine();
            for (char letter = 'A'; letter <= 'Z'; letter++) {
                buffer.write(letter);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
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
