/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.essa.util;

/**
 *
 * @author zi05
 */
public interface IESSADate {

    public void setDay(int day) throws ESSADateException;

    public int getDay();

    public void setMonth(int month)throws ESSADateException;

    public int getMonth()throws ESSADateException;

    public void setYear(int year)throws ESSADateException;

    public int getYear();

    public void setDate(int day, int month, int year)throws ESSADateException;
}
