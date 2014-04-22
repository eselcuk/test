/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.essa.operations;

import com.essa.util.ESSATime;

/**
 *
 * @author Ekber Selcuk
 */
public class TimeTracking {
    private long timeTrackingID;
    private String employeeID;
    private String employeeName;
    private String client;
    private ESSATime startTime;
    private ESSATime endTime;
    private ESSATime breakInMinutes;
    private ESSATime breakBefore22hours;
    private float employeeDisplacement;

    public TimeTracking(String employeeID, String employeeName, String client, ESSATime startTime, ESSATime endTime, ESSATime breakInMinutes, ESSATime breakBefore22hours, float employeeDisplacement) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
        this.client = client;
        this.startTime = startTime;
        this.endTime = endTime;
        this.breakInMinutes = breakInMinutes;
        this.breakBefore22hours = breakBefore22hours;
        this.employeeDisplacement = employeeDisplacement;
    }

    public long getTimeTrackingID() {
        return timeTrackingID;
    }

    public void setTimeTrackingID(long timeTrackingID) {
        this.timeTrackingID = timeTrackingID;
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

    public ESSATime getStartTime() {
        return startTime;
    }

    public void setStartTime(ESSATime startTime) {
        this.startTime = startTime;
    }

    public ESSATime getEndTime() {
        return endTime;
    }

    public void setEndTime(ESSATime endTime) {
        this.endTime = endTime;
    }

    public ESSATime getBreakInMinutes() {
        return breakInMinutes;
    }

    public void setBreakInMinutes(ESSATime breakInMinutes) {
        this.breakInMinutes = breakInMinutes;
    }

    public ESSATime getBreakBefore22hours() {
        return breakBefore22hours;
    }

    public void setBreakBefore22hours(ESSATime breakBefore22hours) {
        this.breakBefore22hours = breakBefore22hours;
    }

    public float getEmployeeDisplacement() {
        return employeeDisplacement;
    }

    public void setEmployeeDisplacement(float employeeDisplacement) {
        this.employeeDisplacement = employeeDisplacement;
    }

    
    
}
