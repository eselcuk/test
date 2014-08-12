/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.essatest;

import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.DefaultCellEditor;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;

public class EmployeeHoursEntryTableGUI{

    private static int frameWidth = 700;
    private static int frameHeight = 200;
    private static int rowNumbers = 5;
    private static int colNumbers = 9;

    
     public static void main(String[] args) {

        //Use the event dispatch thread for Swing components
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new EmployeeHoursEntryTableGUI();
            }
        });

    }

    public EmployeeHoursEntryTableGUI() {
        JFrame hoursEntryFrame = new JFrame();
        hoursEntryFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //make sure the program exits when the frame closes
        hoursEntryFrame.setTitle("Employee Working Hours");
        hoursEntryFrame.setSize(frameWidth, frameHeight);
        
        hoursEntryFrame.setLocationRelativeTo(null); //center the JFrame in the middle of the screen
        
         /*JTable hoursEntryTable = new JTable(rowNumbers, colNumbers);
         hoursEntryTable.setTableHeader(new JTableHeader(new HoursEntryTableModel()));
         */
        //Create the JTable using the HoursEntryTableModel implementing 
        //the AbstractTableModel abstract class
        JTable hoursEntryTable = new JTable(new HoursEntryTableModel());

        //Set the column sorting functionality on
        hoursEntryTable.setAutoCreateRowSorter(true);

        //Uncomment the next line if you want to turn the grid lines off
        //table.setShowGrid(false);
        //Change the colour of the table - yellow for gridlines 
        //blue for background
        hoursEntryTable.setGridColor(Color.YELLOW);
        hoursEntryTable.setBackground(Color.CYAN);

        
        

        
        
        //String array to populate the combobox options
        String[] empNames = {"Employee name1", "Employee name2", "Employee name3", "Employee name4", "Employee name4", "Employee name5",
            "Employee name6", "Employee name7", "Employee name8", "Employee name9", "Employee name10"};
        JComboBox cmbEmpNames = new JComboBox(empNames);
        cmbEmpNames.setEditable(true); //make combo editable

        //Set the default editor for the Employee names column to be the combobox
        TableColumn colEmpNames = hoursEntryTable.getColumnModel().getColumn(2);
        colEmpNames.setCellEditor(new DefaultCellEditor(cmbEmpNames));

        //set the column sizes as desired
        TableColumn colEmpID = hoursEntryTable.getColumnModel().getColumn(1);
        colEmpID.setPreferredWidth(30);
        colEmpNames = hoursEntryTable.getColumnModel().getColumn(2);
        colEmpNames.setPreferredWidth(2);

        //Place the JTable object in a JScrollPane for a scrolling table
        JScrollPane tableScrollPane = new JScrollPane(hoursEntryTable);

        hoursEntryFrame.add(tableScrollPane); //add into frame
        hoursEntryFrame.setVisible(true);   //set (current) frame visible
    }
}
       //implement a table model by extending a class to use
//the AbstractTableModel

class HoursEntryTableModel extends AbstractTableModel {

    //Two arrays used for the table data
    String[] columnNames = {"Employee ID", "Name", "Client", "displacement (km)",
        "Start time", "End time", "Break", "Break between", "Process"};

    Object[][] data = {
        {"César Cielo", "Filho", "Brazil", "50m freestyle", 1, "21.30","","", false},
        {"Amaury", "Leveaux", "France", "50m freestyle", 2, "21.45","","", false},
        {"Alain", "Bernard", "France", "50m freestyle", 3, "21.49","","", false},
        {"Alain", "Bernard", "France", "100m freestyle", 1, "47.21","","", false},
        {"Eamon", "Sullivan", "Australia", "100m freestyle", 2, "47.32","","", false},
        {"Jason", "Lezak", "USA", "100m freestyle", 3, "47.67","","", false},
        {"César Cielo", "Filho", "Brazil", "100m freestyle", 3, "47.67","","", false},
        {"Michael", "Phelps", "USA", "200m freestyle", 1, "1:42.96","","", true},
        {"Park", "Tae-Hwan", "South Korea", "200m freestyle", 2, "1:44.85","","", false},
        {"Peter", "Vanderkaay", "USA", "200m freestyle", 3, "1:45.14","","", false},
        {"Park", "Tae-Hwan", "South Korea", "400m freestyle", 1, "3:41.86","","", false},
        {"Zhang", "Lin", "China", "400m freestyle", 2, "3:42.44","","", false},
        {"Larsen", "Jensen", "USA", "400m freestyle", 3, "3:42.78","","", false},
        {"Oussama", "Mellouli", "Tunisia", "1500m freestyle", 1, "14:40.84","","", false},
        {"Grant", "Hackett", "Australia", "1500m freestyle", 2, "14:41.53","","", false},
        {"Ryan", "Cochrane", "Canada", "1500m freestyle", 3, "14:42.69","","", false},
        {"Aaron", "Peirsol", "USA", "100m backstroke", 1, "52.54","","", true},
        {"Matt", "Grevers", "USA", "100m backstroke", 2, "53.11","","", false},
        {"Arkady", "Vyatchanin", "Russia", "100m backstroke", 3, "53.18","","", false},
        {"Hayden", "Stoeckel", "Australia", "100m freestyle", 3, "53.18","","", false},
        {"Ryan", "Lochte", "USA", "200m backstroke", 1, "1:53.94","","", true},
        {"Aaron", "Peirsol", "USA", "200m backstroke", 2, "1:54.33","","", false},
        {"Arkady", "Vyatchanin", "Russia", "200m backstroke", 3, "1:54.93","","", false},
        {"Kosuke", "Kitajima", "Japan", "100m breaststroke", 1, "58.91","","", true},
        {"Alexander", "Dale Oen", "Norway", "100m breaststroke", 2, "59.20","","", false},
        {"Hugues", "Duboscq", "France", "100m breaststroke", 3, "59.37","","", false}
    };

    @Override
    public int getRowCount() {
        return data.length;
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int row, int column) {
        return data[row][column];
    }

    //Used by the JTable object to set the column names
    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }

    //Used by the JTable object to render different
    //functionality based on the data type
    @Override
    public Class getColumnClass(int c) {
        return getValueAt(0, c).getClass();
    }

    @Override
    public boolean isCellEditable(int row, int column) {
        if (column == 0 || column == 1) {
            return false;
        } else {
            return true;
        }
    }

}