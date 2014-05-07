/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.essa.main;

import com.essa.operations.TimeTrack;
import com.essa.util.Date;
import com.essa.util.ESSATime;
import com.essa.util.Time;
import com.essa.util.FileAndObjectOIStream;
import java.text.ParseException;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class EmployeeHoursManager {

    private static FileAndObjectOIStream fileAndObjectOIStream;
    private static String fileName;

    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        SortedSet<TimeTrack> timeTracks = new TreeSet<>();
        fileName = "timetrack.ser";
        addTimeTrack(timeTracks);
        calculateNetHours(timeTracks);
        listTimeTrack();

    }

    private static void addTimeTrack(Set<TimeTrack> timeTracks) throws ParseException {
        try {
            System.err.println("test");
            timeTracks.add(new TimeTrack("74041446122", "Selcuk", "Glacio1", new Date(23, 4, 2014), new Date(24, 4, 2014), new Time(22, 00, 00), new Time(5, 30, 00), 30, 2, 100F, "OK"));
            timeTracks.add(new TimeTrack("74041446122", "Selcuk", "Glacio", new Date(23, 4, 2014), new Date(24, 4, 2014), new Time(20, 30, 00), new Time(7, 30, 00), 30, 1, 100F, "OK"));
            timeTracks.add(new TimeTrack("74041446121", "Selcuk", "Glacio", new Date(24, 4, 2014), new Date(24, 4, 2014), new Time(22, 30, 00), new Time(22, 30, 00), 30, 2, 100F, "OK"));
            timeTracks.add(new TimeTrack("74041446122", "Selcuk", "Glacio", new Date(23, 4, 2014), new Date(24, 4, 2014), new Time(23, 30, 00), new Time(22, 30, 00), 30, 3, 100F, "OK"));
            timeTracks.add(new TimeTrack("74041446122", "Selcuk", "Glacio", new Date(23, 4, 2014), new Date(24, 4, 2014), new Time(22, 30, 00), new Time(22, 30, 00), 30, 2, 100F, "OK"));
            System.err.println("test 1");
            fileAndObjectOIStream.fileObjectOutput(timeTracks, fileName);
            System.err.println("test 2");

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

    }

    private static void listTimeTrack() {
        System.out.println("test 3");
        System.out.print("Employee id \tName \tClient \tStart date \tEnd date \t");
        System.out.println("Start time \tEnd time \tBreak period \tDisp \tDescription");

        fileAndObjectOIStream.fileObjectInput(fileName);

        System.out.println("test 4");
    }

    private static void calculateNetHours(Set<TimeTrack> set) throws Exception {
        TimeTrack[] timeTracks = new TimeTrack[set.size()];
        //ESSATime workedHours = null;
        //Time morningShift = null, nightShift = null, midNight = null;
        int morningShiftMinutes = 6 * 60, noonshift = 14 * 60, nightShiftMinutes = 22 * 60, midNightMinutes = 24 * 60;
        int startTimeMinutes, endTimeMinutes;
        /*try {
         workedHours = new ESSATime();
         morningShift = new Time(6, 0);
         nightShift = new Time(22, 0);
         midNight = new Time(24, 0);
         } catch (Exception e) {
         e.getMessage();
         }*/

        //ESSATime diffInESSATime = null;
        int dayMinutesWorked = 0, nightMinutesWorked = 0;
        int i = 0;
        for (TimeTrack timeTrack : set) {
            //Time sTime = timeTrack.getStartTime();
            startTimeMinutes = timeTrack.getStartTime().getHour() * 60 + timeTrack.getStartTime().getMinute();
            //Time eTime = timeTrack.getEndTime();
            endTimeMinutes = timeTrack.getEndTime().getHour() * 60 + timeTrack.getEndTime().getMinute();

            if (startTimeMinutes != endTimeMinutes) {
                //calculate start/end period btw 06:00-22:00 
                if (startTimeMinutes >= morningShiftMinutes && startTimeMinutes <= nightShiftMinutes) {
                    if (startTimeMinutes < endTimeMinutes && endTimeMinutes <= nightShiftMinutes) { // worked and finished btw morning and night shifts
                        dayMinutesWorked = endTimeMinutes - startTimeMinutes; // total work as minutes
                    } else if (startTimeMinutes < endTimeMinutes && nightShiftMinutes < endTimeMinutes) { //started btw morning-night shift ended btw nigthshift-midnight
                        dayMinutesWorked = nightShiftMinutes - startTimeMinutes; // total work as minutes
                        nightMinutesWorked = endTimeMinutes - nightShiftMinutes; // total work as minutes
                    } else if (startTimeMinutes > morningShiftMinutes && endTimeMinutes <= morningShiftMinutes) {
                        dayMinutesWorked = nightShiftMinutes - startTimeMinutes; // total work as minutes
                        nightMinutesWorked = (endTimeMinutes + midNightMinutes) - nightShiftMinutes; // total work as minutes
                    } else if (endTimeMinutes < startTimeMinutes) {
                        dayMinutesWorked = (nightShiftMinutes - morningShiftMinutes) - (startTimeMinutes - endTimeMinutes); // total work as minutes
                        nightMinutesWorked = (midNightMinutes + morningShiftMinutes) - nightShiftMinutes; // total work as minutes
                    }

                    //calculate start/end period btw 22:00-24:00 
                } else if (startTimeMinutes >= nightShiftMinutes && startTimeMinutes <= midNightMinutes) {
                    if (startTimeMinutes < endTimeMinutes && endTimeMinutes <= nightShiftMinutes) { // worked and finished btw 22:00-24:00
                        nightMinutesWorked = endTimeMinutes - startTimeMinutes; // total work as minutes
                    } else if (startTimeMinutes > endTimeMinutes && morningShiftMinutes >= endTimeMinutes) { //worked and finished btw 22:00-06:00
                        //dayMinutesWorked = nightShiftMinutes - startTimeMinutes; // total work as minutes
                        nightMinutesWorked = endTimeMinutes + midNightMinutes - startTimeMinutes; // total work as minutes
                    } else if (startTimeMinutes > endTimeMinutes && endTimeMinutes >= morningShiftMinutes) {
                        dayMinutesWorked = endTimeMinutes - morningShiftMinutes; // total work as minutes
                        nightMinutesWorked = (endTimeMinutes + midNightMinutes) - startTimeMinutes; // total work as minutes
                    } else if (endTimeMinutes < startTimeMinutes) {
                        dayMinutesWorked = (nightShiftMinutes - morningShiftMinutes); // total work as minutes
                        nightMinutesWorked = (midNightMinutes + nightShiftMinutes) - (startTimeMinutes - endTimeMinutes); // total work as minutes
                    }

                    //calculate start/end period btw 24:00-06:00   
                } else if (startTimeMinutes < morningShiftMinutes && endTimeMinutes <= morningShiftMinutes) {
                    nightMinutesWorked = endTimeMinutes - startTimeMinutes; // total work as minutes
                }
            }

            //calculate worked time in hours format
            //new ESSATime(dayMinutesWorked/60, dayMinutesWorked%60);
            //System.out.println(dayMinutesWorked/60 + " "+nightMinutesWorked%60);
            Time workedTime1 = new  Time(dayMinutesWorked/60, dayMinutesWorked%60);
            Time workedTime2 = new  Time(dayMinutesWorked/60, dayMinutesWorked%60);
            System.out.println("in day:" + workedTime1.toUniversalString());
            System.out.println("in night:" + workedTime2.toUniversalString());
        }
    }
}
