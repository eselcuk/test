/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpf.streams;

import java.io.*;

public class FileWriterStreamsTryout {

    public static void main(String[] args) {
        FileWriter file = null;
        //alle tekens van het alfabet wegschrijven 
        try {
            //een nieuwe file aanmaken 
            file = new FileWriter("alfabet.txt");
            for (char letter = 'A'; letter <= 'Z'; letter++) {
                file.write(letter);
                /*  other twe methods:
                *   write(char[],int, int)//(char[],startpoint, lenght)
                *   write(String, int, int)//(String, startpoint, length)
                */
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } finally {
            if (file != null) {
                try {
                    file.close();
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }
    }
}
