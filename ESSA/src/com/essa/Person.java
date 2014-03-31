/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.essa;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;

/**
 *
 * @Ekber Selcuk
 */
public class Person implements Comparable<Person>, Serializable {

    private static final long serialVersionUID = 1L;

    private String sSNumber;
    private String firstName;
    private String lastName;
    private String gender;
    private Date birthDate;
    private String birthPlace;
    private String address;
    private long postcodeCode;
    
    public Person(String sSNumber, String firstName, String lastName, String gender, String birthDate, String birthPlace, String address, long postcodeCode) throws ParseException {
        setSSNumber(sSNumber);
        setFirstName(firstName);
        setLastName(lastName);
        setGender(gender);
        setBirthDate(new SimpleDateFormat("dd/MM/yyyy").parse(birthDate));
        //setBirthDate(new SimpleDateFormat("dd/mm/yyyy").parse(birthDate));
        setBirthPlace(birthPlace);
        setAddress(address);
        setPostcodeCode(postcodeCode);
    }

    public String getSSNumber() {
        return sSNumber;
    }

    public void setSSNumber(String sSNumber) {
        this.sSNumber = sSNumber;
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

    public Date getBirthDate() {       
        return birthDate;
    }

    public final void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
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
        return  getSSNumber() + "\t" + getFirstName() + "\t" + getLastName() + "\t" + getGender()
                + "\t" + getBirthDate() + "\t" + getBirthPlace() + "\t" + getAddress() + "\t" + getPostcodeCode();
    }
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Person)) {
            return false;
        }
        final Person p = (Person) o;
        return this.getSSNumber().equals(p.getSSNumber());
    }

    @Override
    public int hashCode() {
        return this.getSSNumber().hashCode();
    }

    @Override
    public int compareTo(Person p) {
        if (p == null) {
            throw new NullPointerException();
        } else if (this.equals(p)) {
            return 0;
        } else {
            //return this.getSSNumber().compareTo(p.getSSNumber());
            return this.getSSNumber().compareTo(p.getSSNumber());
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
    public static Comparator<Person> getFirstNameComparator() {
        return new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                if (!(p1.equals(p2))) {
                    return p1.getFirstName().compareTo(p2.getFirstName());
                } else {
                    return 0;
                }
            }
        };
    }
}
