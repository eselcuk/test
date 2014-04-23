// Fig. 8.7: Date.java 
// Date class declaration.
package com.essa.util;

import java.io.Serializable;

public class Date implements IDate, Comparable<Date>, Serializable {

    private static final long serialVersionUID = 1L;
    private int day;   // 1-31 based on month
    private int month; // 1-12
    private int year;  // any year

    // constructor: call checkMonth to confirm proper value for month; 
    // call checkDay to confirm proper value for day
    public Date(int day, int month, int year) {
        this.year = year; // could validate year
        this.month = checkMonth(month); // validate month
        this.day = checkDay(day); // validate day

        //System.out.printf("Date object constructor for date %s\n", this );
    } // end Date constructor

    // utility method to confirm proper month value
    private int checkMonth(int testMonth) {
        if (testMonth > 0 && testMonth <= 12) // validate month
        {
            return testMonth;
        } else // month is invalid 
        {
            System.out.printf(
                    "Invalid month (%d) set to 1.", testMonth);
            return 1; // maintain object in consistent state
        } // end else
    } // end method checkMonth

    // utility method to confirm proper day value based on month and year
    private int checkDay(int testDay) {
        int daysPerMonth[]
                = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // check if day in range for month
        if (testDay > 0 && testDay <= daysPerMonth[ month]) {
            return testDay;
        }

        // check for leap year
        if (month == 2 && testDay == 29 && (year % 400 == 0
                || (year % 4 == 0 && year % 100 != 0))) {
            return testDay;
        }

        System.out.printf("Invalid day (%d) set to 1.", testDay);
        return 1;  // maintain object in consistent state
    } // end method checkDay

    // return a String of the form month/day/year
    public String toString() {
        return String.format("%d/%d/%d", day, month, year);
    } // end method toString

    @Override
    public void setDay(int day) throws DateException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getDay() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setMonth(int month) throws DateException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getMonth() throws DateException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setYear(int year) throws DateException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getYear() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setDate(int day, int month, int year) throws DateException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int compareTo(Date d) {
        if (d == null) {
            throw new NullPointerException();
        }
        
        long d1 = this.year * 10000 + this.month * 100 + this.day;
        long d2 = d.year * 10000 + d.month * 100 + d.day;
        if (d1 > d2) {
            return 1;
        } else if (d1 < d2) {
            return -1;
        } else {
            return 0;
        }
    }
} // end class Date

/**
 * ************************************************************************
 * (C) Copyright 1992-2005 by Deitel & Associates, Inc. and * Pearson Education,
 * Inc. All Rights Reserved. * * DISCLAIMER: The authors and publisher of this
 * book have used their * best efforts in preparing the book. These efforts
 * include the * development, research, and testing of the theories and programs
 * * to determine their effectiveness. The authors and publisher make * no
 * warranty of any kind, expressed or implied, with regard to these * programs
 * or to the documentation contained in these books. The authors * and publisher
 * shall not be liable in any event for incidental or * consequential damages in
 * connection with, or arising out of, the * furnishing, performance, or use of
 * these programs. *
 * ***********************************************************************
 */
