/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpf.streams;

import java.io.*;
import java.math.BigDecimal;

public class ObjectOutputStreamsTryout {

    public static void main(String[] args) {
        FileOutputStream file = null;
        ObjectOutputStream obj = null;
        try {
            file = new FileOutputStream("werknemers.dat");
            obj = new ObjectOutputStream(file);
            //werknemerobjecten aanmaken
            Werknemer magazijnier = new Werknemer("Etienne", "Berquin", new BigDecimal(1200), "000-111-222");
            Werknemer telefoniste = new Werknemer("Larissa", "Verbeke", new BigDecimal(1250), "SSN-111-222");
            Werknemer directeur = new Werknemer("Luc", "Vanhoorebeke", new BigDecimal(4515), "333-111-222");
            // werknemerobjecten verzamelen in array: 
            Werknemer[] werknemers = new Werknemer[]{magazijnier, telefoniste, directeur};
            //array wegschrijven (array elementen worden automatisch ook //weggeschreven) 
            obj.writeObject(werknemers); //SSNumber is transient, is not written into file
            /*  other methods:
             *   write(int), write(byte[]), write(byte[],int,int)
             *   writeBoolean(boolean), writeShort(short)
             *   writeBytes(String), writeChars(String)
             */
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            if (obj != null) {
                try {
                    //outputstream sluiten 
                    obj.close();
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }
    }
}
