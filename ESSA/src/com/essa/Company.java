/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.essa;

import java.io.Serializable;

/**
 *
 * @author zi05
 */
public class Company implements Serializable {

    private String companyCode;
    private String companyName;
    private String address;
    private long postcodeCode;

    public Company(String companyCode, String companyName, String address, long postcodeCode) {
        this.companyCode = companyCode;
        this.companyName = companyName;
        this.address = address;
        this.postcodeCode = postcodeCode;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getPostcodeCode() {
        return postcodeCode;
    }

    public void setPostcodeCode(long postcodeCode) {
        this.postcodeCode = postcodeCode;
    }

    @Override
    public String toString() {
        return getCompanyName();
    }
}
