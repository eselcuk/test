/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpf.streams;

import java.io.*;

public class BufferedAndDataStreamsTryout {

    public static void main(String[] args) {
        float[] temperaturen = {12.76F, 13.41F, 14.44F, 13.41F, 15.77F, 17.50F, 15.44F, 14.04F, 10.99F, 16.26F};
        FileOutputStream tempSchrijver = null;
        //use buffering data before write/read in/out file. close() has to be run in finally block
        BufferedOutputStream bufferSchrijver = null; 
        //Data...Stream manages datatypes  close() has to be run in finally block
        DataOutputStream dataSchrijver = null; 
        //floats naar bestand schrijven via buffer en datastream 
        try {
            //een nieuwe file aanmaken 
            tempSchrijver = new FileOutputStream("temp.dat");
            bufferSchrijver = new BufferedOutputStream(tempSchrijver);//buffer the data before write/read
            dataSchrijver = new DataOutputStream(bufferSchrijver); // call methods of each datatype
            //alle temperaturen wegschrijven 
            for (float temperatuur : temperaturen) {
                dataSchrijver.writeFloat(temperatuur);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } finally {
            if (dataSchrijver != null) {
                try {
                    dataSchrijver.close();
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }
        //temperaturen inlezen vanaf bestand via buffer en datastream 
        FileInputStream tempLezer = null;
        BufferedInputStream bufferLezer = null;
        DataInputStream dataLezer = null;
        try {
            //te lezen bestand aangeven 
            tempLezer = new FileInputStream("temp.dat");
            bufferLezer = new BufferedInputStream(tempLezer);
            dataLezer = new DataInputStream(bufferLezer);
            //alle temperaturen inlezen 
            while (true) {
                float temperatuur = dataLezer.readFloat();
                System.out.println(temperatuur);
            }
        } catch (EOFException ex) {
            // bestand wordt gesloten in finally block 
            // dus hoeft hier niet te gebeuren 
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } finally {
            if (dataLezer != null) {
                try {
                    dataLezer.close();
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }
    }
}
