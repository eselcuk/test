/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.essa;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigDecimal;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class FileAndObjectOIStreamClass {

    /*public FileAndObjectOIStreamClass(Object object){
        
    }*/
    public static void main(String[] args) throws ParseException {
        //fileAndObjectOIStreamClass.fileObjectInput();
        SortedSet employees = new TreeSet();
        employees.add(new Employee("74041446127", "Ekber", "Selcuk", "Male", "14/04/1974", "Istanbul", "Hermesdijkstraat 17", 1,
                BigDecimal.valueOf(20.00), EmployeeContractType.SERVANT, new Company("CFC", "CFC BVBA", "Weg naar As 264", 1), 100F));
        employees.add(new Employee("74041446123", "Selcuk", "Ekber", "Male", "14/04/1974", "Istanbul", "Hermesdijkstraat 17", 1,
                BigDecimal.valueOf(20.00), EmployeeContractType.WORKER, new Company("CFC", "Compact BVBA", "Weg naar As 264", 1), 100F));
        employees.add(new Employee("74041446125", "Selcuk", "Ekber", "Male", "14/04/1974", "Istanbul", "Hermesdijkstraat 17", 1,
                BigDecimal.valueOf(20.00), EmployeeContractType.WORKER, new Company("CFC", "Compact BVBA", "Weg naar As 264", 1), 100F));
        employees.add(new Employee("74041446124", "Dirx", "Belig", "Male", "14/04/1974", "Istanbul", "Hermesdijkstraat 17", 1,
                BigDecimal.valueOf(20.00), EmployeeContractType.WORKER, new Company("CFC", "Compact BVBA", "Weg naar As 264", 1), 100F));
        employees.add(new Employee("74041446125", "Dirx", "Belig", "Male", "14/04/1974", "Istanbul", "Hermesdijkstraat 17", 1,
                BigDecimal.valueOf(20.00), EmployeeContractType.WORKER, new Company("CFC", "Compact BVBA", "Weg naar As 264", 1), 100F));

        fileObjectOutput(employees);
        fileObjectInput();
    }

    public static void fileObjectOutput(Set set) {
        FileOutputStream file = null;
        ObjectOutputStream obj = null;
        try {
            file = new FileOutputStream("employees.ser");
            obj = new ObjectOutputStream(file);

            System.out.println("test 1");
            //obj.writeObject(employees);
            obj.writeObject(set);
            System.out.println("test 2");
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
                    obj.close();
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }
    }

    public static void fileObjectInput() {
        FileInputStream file = null;
        ObjectInputStream obj = null;
        try {
            //een nieuwe fileInputstream en objectInputstream maken 
            file = new FileInputStream("employees.ser");
            obj = new ObjectInputStream(file);
            System.out.println("test 3");
            Set set = (TreeSet) obj.readObject();

            Employee[] employees = new Employee[set.size()];
            //System.out.println("set size: " + set.size());

            int index = 0;
            for (Iterator it = set.iterator(); it.hasNext();) {
                Object o = it.next();
                if (o instanceof Employee) {
                    employees[index] = (Employee) o;
                } else {
                    //throw new UnsupportedDataTypeException();
                }
                index++;

            }
            print(employees);

            System.out.println("test 4");
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
    /*
     private static void print(SortedSet voertuigen) {
     //System.out.println();
     for (Object object : voertuigen) {
     System.out.println(object);
     }
     }

     private static void print(Set voertuigen) {
     //System.out.println();
     for (Object object : voertuigen) {
     System.out.println(object);
     }
     }
     */

    private static void print(Employee[] employees) {
        //System.out.println();
        for (Object object : employees) {
            System.out.println(object);
        }
    }

}
