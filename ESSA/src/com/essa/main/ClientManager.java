/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.essa.main;

import com.essa.client.Client;
import com.essa.client.ClientContact;
import com.essa.util.FileAndObjectOIStream;
import java.text.ParseException;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author zi05
 */
public class ClientManager {

    private static FileAndObjectOIStream fileAndObjectOIStreamClass;
    private static String fileName;
    //test git push
    public static void main(String[] args) throws ParseException {
        //fileAndObjectOIStreamClass.fileObjectInput();
        SortedSet<Client> clients = new TreeSet<>();
        fileName = "client.ser";
        addClient(clients);
        //updateEmployee();
        //deleteEmployee();
        
        listClient();

        //fileAndObjectOIStreamClass.fileObjectOutput(employees, fileName );
        //fileObjectOutput(employees);
        //fileAndObjectOIStreamClass.fileObjectInput(fileName);
        //fileAndObjectOIStreamClass.fileObjectInput();
    }

    private static void addClient(Set<Client> clients) throws ParseException {
        clients.add(new Client("CFC", "CFC bvba", new ClientContact("Salman", "Selcuk", "Dhr", "zaakvoerder", "info@cfc-bvba.com", "089246473", "0484943003", "089246474"), "Hermesdijkstraat 17", 1, "Bel"));
        clients.add(new Client("Jacijs", "Jac Ijs NV", new ClientContact("Beny", "Wijvers", "Dhr", "Production Manager", "info@jacijs.com", "03xxxxxx", "0484xxxxxx", "02xxxxxx"), "H............ 17", 2, "Bel"));
        clients.add(new Client("Mora", "Mora NV   ", new ClientContact("Gerard", "Xman", "Dhr", "Production Manager", "info@mora.com", "+31xxxxxxxx", "+31xxxxxx", "+31xxxxxx"), "Fleter......... 17", 3, "NL"));
        clients.add(new Client("Glacio", "Glacio NV", new ClientContact("Yman", "Znaam", "Mvrouw", "Secreterasse", "info@glacio.com", "", "", "089246474"), "?............... 17", 4, "Bel"));
        //System.out.println("test 1");
        fileAndObjectOIStreamClass.fileObjectOutput(clients, fileName);
        //System.out.println("test 2");

    }

    private static void listClient() {
        //System.out.println("test 3");
        fileAndObjectOIStreamClass.fileObjectInput(fileName);
        //System.out.println("test 4");
    }
}
