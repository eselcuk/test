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
public class DateException extends Exception {

    private String invalidDate;

    public DateException() {
    }

    public DateException(String message) {
        super(message);
    }

    public DateException(String msg,
            String date) {
        super(msg);
        this.invalidDate = date;
    }


    public String getVerkeerdDatum() {
        return invalidDate;
    }

}
