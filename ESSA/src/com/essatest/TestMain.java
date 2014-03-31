/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.essatest;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author zi05
 */
public class TestMain {

    protected String[] columnToolTips = {null,
        null,
        "The person's favorite sport to participate in",
        "The number of years the person has played the sport",
        "If checked, the person eats no meat"};

    public static void main(String[] args) {

        int x = -10;
        Calendar cal = GregorianCalendar.getInstance();
        cal.add(Calendar.DAY_OF_YEAR, x);
        Date tenDaysAgo = cal.getTime();

        System.out.println(tenDaysAgo);

        long aDayInMiliSeconds = 24 * 3600 * 1000;
        Date date2 = new Date();
        Date date1 = new Date(date2.getTime() - aDayInMiliSeconds * 40);

        int numOfDays = (int) ((date2.getTime() - date1.getTime()) / aDayInMiliSeconds);
        System.out.println(numOfDays);
        //jpf.gui.TableToolTipsDemoGUI tableToolTipsDemoGUI = new jpf.gui.TableToolTipsDemoGUI();
    }

}
