/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.essa.client;

/**
 *
 * @author CFC
 */
public class ClientContact {
    private String firstName;
    private String lastName;
    private String gender;
    private String function;
    private String email;
    private String telephoneNumber;
    private String mobileNumber;
    private String faxNumber;

    public ClientContact(String firstName, String lastName, String gender, String function, String email, String telephoneNumber, String mobileNumber, String faxNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.function = function;
        this.email = email;
        this.telephoneNumber = telephoneNumber;
        this.mobileNumber = mobileNumber;
        this.faxNumber = faxNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getFaxNumber() {
        return faxNumber;
    }

    public void setFaxNumber(String faxNumber) {
        this.faxNumber = faxNumber;
    }

}
