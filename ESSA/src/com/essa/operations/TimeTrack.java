/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.essa.operations;

import com.essa.util.Date;
import com.essa.util.Time;

/**
 *
 * @author Ekber Selcuk
 */
public class TimeTrack {
    private long timeTrackID;
    private String employeeID;
    private String employeeName;
    private String client;
    private Date startDate;
    private Date endDate;
    private Time startTime;
    private Time endTime;
    private Time breakInMinutes;
    private Time breakStartsAt;
    private float employeeDisplacement;
    private String description;

    public TimeTrack(String employeeID, String employeeName, String client, Date startDate, Date endDate, Time startTime, Time endTime, Time breakInMinutes, Time breakStartsAt, float employeeDisplacement, String description) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
        this.client = client;
        this.startDate = startDate;
        this.endDate = endDate;
        this.startTime = startTime;
        this.endTime = endTime;
        this.breakInMinutes = breakInMinutes;
        this.breakStartsAt = breakStartsAt;
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

    public Time getBreakInMinutes() {
        return breakInMinutes;
    }

    public void setBreakInMinutes(Time breakInMinutes) {
        this.breakInMinutes = breakInMinutes;
    }

    public Time getBreakStartsAt() {
        return breakStartsAt;
    }

    public void setBreakStartsAt(Time breakStartsAt) {
        this.breakStartsAt = breakStartsAt;
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
}
