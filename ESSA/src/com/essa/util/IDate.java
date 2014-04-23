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
public interface IDate {

    public void setDay(int day) throws DateException;

    public int getDay();

    public void setMonth(int month)throws DateException;

    public int getMonth()throws DateException;

    public void setYear(int year)throws DateException;

    public int getYear();

    public void setDate(int day, int month, int year)throws DateException;
}
