/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.essa.client;

import com.essa.staff.Person;
import javax.crypto.Cipher;

/**
 *
 * @author CFC
 */
public class Client extends Company {

    private ClientContact contactPerson;

    public Client(String companyID, String companyName, ClientContact contactPerson, String address, long postcodeID, String country) {
        super(companyID, companyName, address, postcodeID, country);
        this.contactPerson = contactPerson;
    }

    public ClientContact getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(ClientContact contactPerson) {
        this.contactPerson = contactPerson;
    }

}
