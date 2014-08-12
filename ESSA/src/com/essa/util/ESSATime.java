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
public class ESSATime extends Time {

    private ESSATime hoursWorkedInDay;
    private ESSATime hoursWorkedInNight;
    private int hours;
    private int minutes;
    private int hoursAsMinute;
    private int typeOfDay; //0:weekday, 1:saturday, 2:sunday, 3:weekdayHoliday, 4:saturdayHoliday, 5:sundayHoliday

    public ESSATime() throws Exception {
        this(0, 0); // invoke Time constructor with three arguments
    } // end no-argument Time constructor

    public ESSATime(int h) throws Exception {
        this(h, 0); // invoke Time constructor with three arguments
    } // end one-argument Time constructor

    public ESSATime(int h, int m) throws Exception {
        hours = h;
        minutes = m;
    } // end two-argument Time constructor 


    public ESSATime(ESSATime hoursWorkedInDay, ESSATime hoursWorkedInNight, int typeOfDay) throws Exception {
        //super(h, m);
        this.hoursWorkedInDay = hoursWorkedInDay;
        this.hoursWorkedInNight = hoursWorkedInNight;
        this.typeOfDay = typeOfDay;
    }

    public ESSATime getHoursWorkedInDay() {
        return hoursWorkedInDay;
    }

    public void setHoursWorkedInDay(ESSATime hoursWorkedInDay) {
        this.hoursWorkedInDay = hoursWorkedInDay;
    }

    public Time getHoursWorkedInNight() {
        return hoursWorkedInNight;
    }

    public void setHoursWorkedInNight(ESSATime hoursWorkedInNight) {
        this.hoursWorkedInNight = hoursWorkedInNight;
    }

    public int getTypeOfDay() {
        return typeOfDay;
    }

    public void setTypeOfDay(int typeOfDay) {
        this.typeOfDay = typeOfDay;
    }

    public int getHoursAsMinute() {
        return hoursAsMinute;
    }

    public void setHoursAsMinute(int hoursAsMinute) {
        this.hoursAsMinute = hoursAsMinute;
    }
   public int isBetween(Time time1, Time time2) {
        if (time1 == null || time2 == null) {
            throw new NullPointerException();
        }
        
        long t1 = time1.getHour() * 60 + time1.getMinute() * 60 + time1.getSecond();
        long t2 = this.getHour() * 60 + this.getMinute() * 60 + this.getSecond();
        long t3 = time2.getHour() * 60 + time2.getMinute() * 60 + time2.getSecond();
        
        if (t1 < t3) {
            if (t1 <= t2 && t2 <= t3) {
                return 0;
            }else if (t1 > t2 && t2 <= t3){
            }
       }
        if (t1 > t2 ) {
            return 1;
        } else if (t1 < t2) {
            return -1;
        } else {
            return 0;
        }
    }
    public ESSATime subtractHours(Time t1, Time t2) throws Exception {
        int diffAsMin = t2.getHour() * 60 + t2.getMinute() - t1.getHour() * 60 + t1.getMinute();

        return new ESSATime(diffAsMin / 60, diffAsMin % 60);
    }
    public ESSATime addHours(Time t1, Time t2) throws Exception {
        int sumAsMin = t2.getHour() * 60 + t2.getMinute() + t1.getHour() * 60 + t1.getMinute();

        return new ESSATime(sumAsMin / 60, sumAsMin % 60);
    }
}
