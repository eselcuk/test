/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpf.streams;

import java.io.*;

public class CharStreamsTryout {

    public static void main(String[] args) {
        FileReader file = null;
        //tekstbestand teken per teken inlezen en weergeven op scherm 
        try { //een nieuwe file aanmaken 
            file = new FileReader("weerbericht.txt");
            //alle tekens inlezen tot aan eof 
            int gelezenTeken; 
            while ((gelezenTeken = file.read()) != -1) {
                System.out.print((char) gelezenTeken);
            }
            System.out.println();
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
