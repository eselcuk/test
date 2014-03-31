/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.essatest;

import javax.swing.JFrame;
import javax.swing.JTable;

/**
 *
 * @author zi05
 */
public class TableGUI {

    private int numRows = 2;
    private int numColumns = 9;
    JTable table = new JTable(numRows, numColumns);

    public static void main(String[] args) {
        JFrame frame = new JFrame("Table gui test");
        frame.setSize(240,200); 
        //frame.createGUI(); 
        frame.setVisible(true);
        
    }

}
