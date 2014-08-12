/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.essa.util;

import java.io.Serializable;

public  class SSNumber implements Comparable, Serializable {
    private static final long serialVersionUID = 1L;
    private final String sSNumber;
    
    public SSNumber(String sSNumber){ 
        this.sSNumber = sSNumber;
    }
    
    public String getSSNumber() {
        return sSNumber;
    }

    @Override
    public String toString() {
        return "sSNumber: " + sSNumber;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof SSNumber)) {
            return false;
        }
        SSNumber ssn = (SSNumber) obj;
        return sSNumber.equals(ssn.getSSNumber());
    }

    @Override
    public int hashCode() {
        return sSNumber.hashCode();
    }

    @Override
    public int compareTo(Object obj) {
        // sorteren op plaat during entry 
        SSNumber ssn = (SSNumber) obj;
        return this.getSSNumber().compareTo(ssn.getSSNumber()); //compares and orders according to ssn
    }
}
