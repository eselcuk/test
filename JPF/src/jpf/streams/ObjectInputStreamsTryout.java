/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpf.streams;

import java.io.*;
import java.math.BigDecimal;

public class ObjectInputStreamsTryout {

    public static void main(String[] args) {
        FileInputStream file = null;
        ObjectInputStream obj = null;
        try {
            //een nieuwe fileInputstream en objectInputstream maken 
            file = new FileInputStream("werknemers.dat");
            obj = new ObjectInputStream(file);
            Werknemer[] werknemers = (Werknemer[]) obj.readObject();
            // other methods: read(), read(byte[ ], int, int), readBoolean(), readFloat(), readLine()
            for (Werknemer werknemer : werknemers) {
                System.out.print(werknemer.getVolledigeNaam());
                System.out.print(':');
                System.out.print(werknemer.getWedde());
                System.out.print(':');
                System.out.println(werknemer.getSSNumber()); //SSNumber is transient
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            //de file sluiten 
            if (obj != null) {
                try {
                    obj.close();
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }
    }
}
