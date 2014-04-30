/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.essa.operations;

import com.essa.staff.Person;
import com.essa.util.Date;
import com.essa.util.Time;
import java.io.Serializable;
import java.util.Comparator;

/**
 *
 * @author Ekber Selcuk
 */
public class TimeTrack implements Comparable<TimeTrack>, Serializable {

    private static final long serialVersionUID = 1L;
    private long timeTrackID;
    private String employeeID;
    private String employeeName;
    private String client;
    private Date startDate;
    private Date endDate;
    private Time startTime;
    private Time endTime;
    private int breakTotal; // in minutes
    private int breakPeriod;// 1 = between 6:00-22:00, 2 = between 22:00-06:00, 3 = equally distributed
    private float employeeDisplacement;
    private String description;

    public TimeTrack(String employeeID, String employeeName, String client, Date startDate, Date endDate, Time startTime, Time endTime, int breakTotal, int breakPeriod, float employeeDisplacement, String description) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
        this.client = client;
        this.startDate = startDate;
        this.endDate = endDate;
        this.startTime = startTime;
        this.endTime = endTime;
        this.breakTotal = breakTotal;
        this.breakPeriod = breakPeriod;
        this.employeeDisplacement = employeeDisplacement;
        this.description = description;
    }

    public long getTimeTrackID() {
        return timeTrackID;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public Time getStartTime() {
        return startTime;
    }

    public void setStartTime(Time startTime) {
        this.startTime = startTime;
    }

    public Time getEndTime() {
        return endTime;
    }

    public void setEndTime(Time endTime) {
        this.endTime = endTime;
    }
  public int getBreakTotal() {
        return breakTotal;
    }

    public void setBreakTotal(int breakTotal) {
        this.breakTotal = breakTotal;
    }

    public int getBreakPeriod() {
        return breakPeriod;
    }

    public void setBreakPeriod(int breakPeriod) {
        this.breakPeriod = breakPeriod;
    }
    public float getEmployeeDisplacement() {
        return employeeDisplacement;
    }

    public void setEmployeeDisplacement(float employeeDisplacement) {
        this.employeeDisplacement = employeeDisplacement;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return getEmployeeID() + "\t" + getEmployeeName() + "\t" + getClient()
                + "\t" + getStartDate() + "\t" + getEndDate() 
                + "\t" + getStartTime().toUniversalString() + "\t" + getEndTime().toUniversalString() 
                + "\t" + getBreakTotal() + "\t" + getBreakPeriod()
                + "\t" + getEmployeeDisplacement() + "\t" + getDescription();
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof TimeTrack)) {
            return false;
        }
        final TimeTrack t = (TimeTrack) o;
        //System.err.println(this.getEmployeeID()+ this.getClient() + this.getStartDate()+ this.getStartTime().toUniversalString());
        return (this.getEmployeeID()+ this.getClient() + this.getStartDate()+ this.getStartTime().toUniversalString()).equals(t.getEmployeeID()+ t.getClient() + t.getStartDate()+ t.getStartTime().toUniversalString());
        //return (this.hashCode() == t.hashCode());
    }

    @Override
    public int hashCode() {
        return (getStartDate().hashCode() + getClient().hashCode() + getEmployeeID().hashCode() + getStartTime().hashCode());
    }

    @Override
    public int compareTo(TimeTrack t) {
        if (t == null) {
            throw new NullPointerException();
        } else if (this.equals(t)) {
            return 0;
        } 
        else {
            return 1;
            //return this.compareTo(t);
        }
    }

    // inner class for ordering based on SSnumber
    public static Comparator<TimeTrack> getClientComparator() {
        return new Comparator<TimeTrack>() {
            @Override
            public int compare(TimeTrack t1, TimeTrack t2) {
                if (!(t1.equals(t2))) {
                    return t1.getClient().compareTo(t2.getClient());
                } else {
                    return 0;
                }
            }
        };
    }

    // inner class for ordering based on Aankoopprijs
    public static Comparator<TimeTrack> getStartDateComparator() {
        return new Comparator<TimeTrack>() {
            @Override
            public int compare(TimeTrack t1, TimeTrack t2) {
                if (!(t1.equals(t2))) {
                    return t1.getStartDate().compareTo(t2.getStartDate());
                } else {
                    return 0;
                }
            }
        };
    }  
}
