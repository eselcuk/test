/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.essatest;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.AbstractTableModel;

class AbstractTableEmployeeTest extends AbstractTableModel {

    int row2;

    private String[] columnNames = { "ID", "Name", "Company", "Department", "Location", "Mobile NO" , "Shift" };
    private Object[][] data =  new Object[500][500];


    public int getColumnCount() {
        return columnNames.length;
    }

    public int getRowCount() {
        int row = 0;
        try {
            row =  this.count();
        } catch (SQLException ex) {
            Logger.getLogger(AbstractTableEmployeeTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        return row;
    }

    public String getColumnName(int col) {
        return columnNames[col];
    }

    public Object getValueAt(int row, int col) {
        return data[row][col];
    }

    public void setValueAt(Object value, int row, int col) {
        data[row][col] = value;
        fireTableCellUpdated(row, col);
    }
    private int getRowCountFromDB() throws SQLException {
        //Connection con  = (Connection) DBConnection.getDBConnection();
        int row = 0;
        Statement st = null;
        ResultSet rs = null;
        String Sql = "Select * from Employee_Master where status = 'Active'";
        try {
           // st = (Statement) con.createStatement();
           // rs = st.executeQuery(Sql);
            while (rs.next())
            {
                row++;
            }
        }
        finally {
           // con.close();
            rs.close();
            //st.close();
        }
        return row;


    }

    private int count() throws SQLException {
        return this.getRowCountFromDB();
    }
}