/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.essatest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author zi05
 */
public class NewMain {

    public static void main(String args[]) throws ParseException {

        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday",
            "Thursday", "Friday", "Saturday"};
        SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yyyy");
        Date dt1 = format1.parse("20/10/2013");

        Calendar c = Calendar.getInstance();
        c.setTime(dt1);
        int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
        long diff = Calendar.getInstance().getTime().getTime();
        System.out.println(dayOfWeek);

        switch (dayOfWeek) {

            case 6:
                System.out.println(days[dayOfWeek - 1]);
                break;
            case 5:

                System.out.println(days[dayOfWeek - 1]);
                break;
            case 4:
                System.out.println(days[dayOfWeek - 1]);
                break;
            case 3:

                System.out.println(days[dayOfWeek - 1]);
                break;
            case 2:
                System.out.println(days[dayOfWeek - 1]);
                break;
            case 1:

                System.out.println(days[dayOfWeek - 1]);

                diff = diff - (dt1.getTime() - 3);
                long valuebefore = dt1.getTime();
                long valueafetr = dt1.getTime() - 2;
                System.out.println("DATE IS befor subtraction :" + valuebefore);
                System.out.println("DATE IS after subtraction :" + valueafetr);

                long x = dt1.getTime() - (2 * 24 * 3600 * 1000);
                System.out.println("Deducted date to find firday is - 2 days form Sunday :" + new Date((dt1.getTime() - (2 * 24 * 3600 * 1000))));
                System.out.println("DIffrence from now on is :" + diff);
                if (diff > 0) {

                    diff = diff / (1000 * 60 * 60 * 24);
                    System.out.println("Diff" + diff);
                    System.out.println("Date is Expired!" + (dt1.getTime() - (long) 2));
                }

                break;

        }

    }
}
