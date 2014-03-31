/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpf.interfaces;

public class CloneableExample implements Cloneable {

    private String name;
    private String address;
    private int age;
    private Person person;

    public CloneableExample() {

    }

    public CloneableExample(String aName, int aAge, Person person) {

        this.name = aName;
        this.age = aAge;
        this.person = person;
    }

    protected Object clone() throws CloneNotSupportedException {

        CloneableExample clone = (CloneableExample) super.clone();

        // make the shallow copy of the object of type Department
        clone.person = (Person) person.clone();
        return clone;

    }

    public static void main(String[] args) {

        CloneableExample ce = new CloneableExample();

        try {
            // make deep copy of the object of type CloneableExample
            CloneableExample cloned = (CloneableExample) ce.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }
}
