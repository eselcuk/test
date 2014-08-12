/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpf.oefeningen;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

/**
 *
 * @author zi05
 */
public class GastenBoekManager {

    private static final String GASTENBOEK_PATH = "jpf/gastenboek.dat";

    //GastenBoek gastBoek = new GastenBoek();
    public void save(GastenBoek gastenboek) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(GASTENBOEK_PATH);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(gastenboek);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            //System.out.println(ex.getMessage());
        }
    }

    public GastenBoek load() {
        File file = new File(GASTENBOEK_PATH);
        if (file.exists()) {
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
                return (GastenBoek) objectInputStream.readObject();
            } catch (Exception ex) {
                System.out.println(ex);
                return null;
            }
        } else {
            return new GastenBoek();
        }
    }
}
