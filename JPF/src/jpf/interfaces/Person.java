/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpf.interfaces;

import java.util.Date;

public class Person implements Cloneable {

    private String name;
    private Date dob;

    public Person(String name, Date dob) {
        this.name = name;
        this.dob = dob;
    }

    public String getName() {
        return name;
    }

    public Person clone() {
        Person p;
        try {
            p = (Person) super.clone();
            p.dob = (Date) dob.clone();
            return p;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            throw new RuntimeException();
        }

    }
}
