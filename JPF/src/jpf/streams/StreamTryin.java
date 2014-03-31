/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpf.streams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class StreamTryin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //lottobestand inlezen vanaf bestand
        FileInputStream deInputLijst = null;
        try {
            //een nieuwe inputfile aanmaken
            deInputLijst = new FileInputStream("lotto.dat");
            //alle lottocijfers inlezen
            int getal;
            while ((getal = deInputLijst.read()) != -1) {
                System.out.println(getal);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            //de file sluiten
            try {
                if (deInputLijst != null) {
                    deInputLijst.close();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }

}
