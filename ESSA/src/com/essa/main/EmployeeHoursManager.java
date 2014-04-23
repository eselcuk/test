/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.essa.main;

import com.essa.operations.TimeTrack;
import com.essa.util.Date;
import com.essa.util.Time;
import com.essa.util.FileAndObjectOIStream;
import java.text.ParseException;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author zi05
 */
public class EmployeeHoursManager {

    private static FileAndObjectOIStream fileAndObjectOIStream;
    private static String fileName;

    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        SortedSet<TimeTrack> timeTracks = new TreeSet<>();
        fileName = "timetrack.ser";
        addTimeTrack(timeTracks);

        //timeTracking.setEmployeeID(null);
        //timeTracking.setEmployeeName(null);
        //Object[] employees = fileAndObjectOIStream.fileObjectInput(fileName);
        /*Object[] objects = fileAndObjectOIStream.fileObjectInput(fileName);
         Employee employee;
         for (Object object : objects) {
         employee = (Employee) object;
         System.out.println(employee);
         //employee.getFirstName();
         }
         */
        /* Employee employee = new Employee("740414-461-22", "Ekber", "Selcuk", "M", 
         new Date(14, 4, 1974), "Igdir/TUR", "Hermesdijkstraat 17", 1,
         BigDecimal.valueOf(3000.50), EmployeeContractType.SERVANT, 
         new Company(null, null, null, 1,"BE"), 100.50F);
         */
    }

    private static void addTimeTrack(Set<TimeTrack> timeTracks) throws ParseException {
        try {
            System.err.println("test");
            timeTracks.add(new TimeTrack("74041446122", "Selcuk", "Glacio", new Date(23, 4, 2014), new Date(24, 4, 2014), new Time(22, 30, 00), new Time(22, 30, 00), new Time(00, 30, 00), new Time(2, 30, 00), 100F, "OK"));
            System.err.println("test 1");
            fileAndObjectOIStream.fileObjectOutput(timeTracks, fileName);
            System.out.println("test 2");

        } catch (Exception e) {
            e.getMessage();
        }

    }

    private static void listTimeTrack() {
        System.out.println("test 3");
        fileAndObjectOIStream.fileObjectInput(fileName);
        System.out.println("test 4");
    }
}
