/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.essa.client;

import com.essa.staff.Person;
import java.io.Serializable;
import java.util.Comparator;

/**
 *
 * @author CFC
 */
public class ClientContact implements Comparable<ClientContact>, Serializable {

    private static final long serialVersionUID = 1L;
    private String firstName;
    private String lastName;
    private String title;
    private String function;
    private String email;
    private String telephoneNumber;
    private String mobileNumber;
    private String faxNumber;

    public ClientContact(String firstName, String lastName, String title, String function, String email, String telephoneNumber, String mobileNumber, String faxNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    @Override
    public String toString() {
        return getTitle() + "\t" + getFirstName() + "\t" + getLastName() + "\t"
                + getFunction() + "\t" + getMobileNumber() + "\t" + getEmail() + "\t"
                + getTelephoneNumber() + "\t" + getFaxNumber();
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof ClientContact)) {
            return false;
        }
        final ClientContact cc = (ClientContact) o;
        return (this.getLastName() + this.getFirstName()).equals(cc.getLastName() + cc.getFirstName());
    }

    @Override
    public int compareTo(ClientContact cc) {
        if (cc == null) {
            throw new NullPointerException();
        } else if (this.equals(cc)) {
            return 0;
        } else {
            //return this.getSSNumber().compareTo(p.getSSNumber());
            return (this.getLastName() + this.getFirstName()).compareTo(cc.getLastName() + cc.getFirstName());
        }
    }

    // inner class for ordering based on SSnumber
   /* public static Comparator<Person> getSSNumberComparator() {
     return new Comparator<Person>() {
     @Override
     public int compare(Person p1, Person p2) {
     if (!(p1.equals(p2))) {
     return p1.getSSNumber().compareTo(p2.getSSNumber());
                    
     } else {
     return 0;
     }
     }
     };
     }
     */
    // inner class for ordering based on Aankoopprijs
    public static Comparator<ClientContact> getFirstNameComparator() {
        return new Comparator<ClientContact>() {
            @Override
            public int compare(ClientContact p1, ClientContact p2) {
                if (!(p1.equals(p2))) {
                    return p1.getFirstName().compareTo(p2.getFirstName());
                } else {
                    return 0;
                }
            }
        };
    }
}
