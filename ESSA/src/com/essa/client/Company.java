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
 * @author zi05
 */
public class Company implements Comparable<Company>, Serializable {

    private static final long serialVersionUID = 1L;
    private String companyID;
    private String companyName;
    private String address;
    private long postcodeID;
    private String country;

    public Company(String companyID, String companyName, String address, long postcodeID, String country) {
        this.companyID = companyID;
        this.companyName = companyName;
        this.address = address;
        this.postcodeID = postcodeID;
        this.country = country;
    }

    public String getCompanyID() {
        return companyID;
    }

    public void setCompanyID(String companyID) {
        this.companyID = companyID;
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

    public long getPostcodeID() {
        return postcodeID;
    }

    public void setPostcodeID(long postcodeID) {
        this.postcodeID = postcodeID;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
       return getCompanyID()+ "\t" + getCompanyName()+ "\t" + getAddress()
               + "\t" + getPostcodeID()+ "\t" + getCountry();
    }
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Company)) {
            return false;
        }
        final Company c = (Company) o;
        return this.getCompanyID().equals(c.getCompanyID());
    }

    @Override
    public int hashCode() {
        return this.getCompanyID().hashCode();
    }

    @Override
    public int compareTo(Company c) {
        if (c == null) {
            throw new NullPointerException();
        } else if (this.equals(c)) {
            return 0;
        } else {
            //return this.getSSNumber().compareTo(p.getSSNumber());
            return this.getCompanyID().compareTo(c.getCompanyID());
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
    public static Comparator<Company> getCompanyIDComparator() {
        return new Comparator<Company>() {
            @Override
            public int compare(Company c1, Company c2) {
                if (!(c1.equals(c2))) {
                    return c1.getCompanyID().compareTo(c2.getCompanyID());
                } else {
                    return 0;
                }
            }
        };
    }

}
