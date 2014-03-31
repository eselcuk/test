/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpf.streams;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;

public class SerialVersionUIDDemo {

    public static void main(String[] args) throws Exception {
        File file = new File("C:\\JPFProjecten\\out.dat");
        /* // code used for version 1
         FileOutputStream fos = new FileOutputStream(file);
         ObjectOutputStream oos = new ObjectOutputStream(fos);
         TeSerialiseren SchrijfMeWeg = new TeSerialiseren(1);
         oos.writeObject(SchrijfMeWeg);
         oos.close();
         FileInputStream fis = new FileInputStream(file);
         ObjectInputStream ois = new ObjectInputStream(fis);
         TeSerialiseren dto = (TeSerialiseren) ois.readObject();
         System.out.println("Data:" + dto.getGetal());
         ois.close();
         */
        // code to deal issues when reading from file after code version changes
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream(file);
            ois = new ObjectInputStream(fis);
            TeSerialiseren dto = (TeSerialiseren) ois.readObject();
            System.out.println("Data:" + dto.getBoolean());
        } catch (InvalidClassException ex) {
            System.out.println(ex.getMessage());
        } finally {
            if (ois != null) {
                try {
                    ois.close();
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
            ois.close();
        }
    }
}
