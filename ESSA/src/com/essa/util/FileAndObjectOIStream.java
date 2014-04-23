/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.essa.util;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class FileAndObjectOIStream {

    public FileAndObjectOIStream(Object object){
        
    }

    public static void fileObjectOutput(Set set, String fileName) {
        FileOutputStream file = null;
        BufferedOutputStream buf = null;
        ObjectOutputStream obj = null;
        try {
            file = new FileOutputStream(fileName);
            buf = new BufferedOutputStream(file);
            obj = new ObjectOutputStream(buf);

            obj.writeObject(set);
            //System.out.println("test 2");
            /*  other methods:
             *   write(int), write(byte[]), write(byte[],int,int)
             *   writeBoolean(boolean), writeShort(short)
             *   writeBytes(String), writeChars(String)
             */
        } catch (InvalidClassException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            if (obj != null) {
                try {
                    //outputstream sluiten 
                    buf.close();
                    obj.close();
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }
    }

    public static Object[] fileObjectInput(String fileName) {
        FileInputStream file = null;
        BufferedInputStream buf = null;
        ObjectInputStream obj = null;
        Object[] objects = null;
        try {
            //een nieuwe fileInputstream en objectInputstream maken 
            file = new FileInputStream(fileName);
            buf = new BufferedInputStream(file);
            obj = new ObjectInputStream(buf);
            //System.out.println("test 3");
            Set set = (TreeSet) obj.readObject();
            
            objects = new Object[set.size()];;
            //Employee[] employees = new Employee[set.size()];
            //Client[] clients = new Client[set.size()];
            //System.out.println("set size: " + set.size());

            int i = 0;
            for (Iterator it = set.iterator(); it.hasNext();) {
                Object o = it.next();
                /*if (o instanceof Employee) {
                    objects[index] = (Employee) o;
                } else
                if (o instanceof Client) {
                    objects[index] = (Client) o;
                    //throw new UnsupportedDataTypeException();
                }*/
                objects[i++] = (Object) o;
            }
            print(objects);
            //print(o);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            //de file sluiten 
            if (obj != null) {
                try {
                    file.close();
                    buf.close();
                    obj.close();
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }
            }
            return objects;
        }
    }
    private static void print(Object[] objects) {
        //System.out.println();
        for (Object object : objects) {
            System.out.println(object);
        }
    }

}
