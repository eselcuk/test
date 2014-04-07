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
public class EmployeeDate extends ESSADate {

    /*public EmployeeDate() throws ESSADateException {
        super.setDate(2, 12, 1977);
    }*/

    public EmployeeDate(int day, int month, int year) {
        super(day, month, year);
    }

/*
   public EmployeeDate(int day, int month, int year) {
        if (validateDateInService(day, month, year)) {
            super.setDay(day);
            super.setMonth(month);
            super.setYear(year);
        } else {
            throw new ESSADateException("enter a valid date", day + "/" + month + "/" + year);
        }
    }
*/
    private boolean validateDateInService(int day, int month, int year) throws ESSADateException {

        ESSADate dateInservice = new EmployeeDate(day, month, year);
        if ((dateInservice.getYear()> year)) {
            return false;
        } else if ((dateInservice.getYear() < year)) {
            return true;
        } else {
            if (dateInservice.getMonth()> month) {
                return false;
            } else if (dateInservice.getMonth()< month) {
                return true;
            } else {
                if (dateInservice.getDay()> day) {
                    return false;
                } else if (dateInservice.getDay()< day) {
                    return true;
                } else {
                    return false;
                }
            }
        }
    }
}
