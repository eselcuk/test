/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpf.streams;

import java.io.FileOutputStream;
import java.io.IOException;

public class StreamsTryout {

    public StreamsTryout() {
    }

    public static void main(String[] args) {
        byte[] lottocijfers = {2, 13, 14, 22, 29, 32};
        FileOutputStream deLijst = null;
        try {
            //een nieuwe file aanmaken 
            //deLijst = new FileOutputStream("lotto.dat");
            //een nieuwe file (outputfile) aanmaken: true:nieuwe gegevens toevoegen, false: bestand overschreven
            deLijst = new FileOutputStream("lotto.dat", true);
            
            //alle lottocijfers wegschrijven 
            for (byte lottocijfer : lottocijfers) {
                deLijst.write(lottocijfer);
            }
            //alle lottocijfers wegschrijven: korte vorm van write(data,startpoint, length)
            deLijst.write(lottocijfers,0,lottocijfers.length);
            
            deLijst.write(lottocijfers); //writes all the list at once
            
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            //de file sluiten 
            if (deLijst != null) {
                try {
                    deLijst.close();
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}
