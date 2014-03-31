/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.essa;

import java.io.Console;

public class SSNumberService {

    private static final SSNumberService instance = new SSNumberService();
    
    //gebruikt de private constructor
    public static SSNumberService getInstance() {
        return instance;
    }

    private SSNumberService() {
    } // is private constructor

    private boolean isCorrect(String sSNumber){
        return true;
    }
    int nummer=0;
    public SSNumber getSSNumber() {
        Console console = System.console();
        //read user name, using java.util.Formatter syntax :
        String sSNumber = console.readLine("Social Security Number: ");
        //String.format("YYMMDD-%03d-%02d", nummer++);
        if(isCorrect(sSNumber))
            return new SSNumber(sSNumber);
        else
            return null;
    }
    /*
    public Nummerplaat getNummerplaat() {
        String plaat = String.format("AAA%03d", nummer++);
           if (nummer >= 999) {
            nummer = 1;
        }
        return new Nummerplaat(plaat);
    }
    */
}


