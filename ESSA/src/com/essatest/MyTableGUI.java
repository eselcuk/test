/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.essatest;

import com.essatest.MyTableModel;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.table.TableColumn;

public class MyTableGUI extends JFrame implements ActionListener {

    private JButton buttonOK;
    private JComboBox cboMaanden;
    private JTextField txtJaar, txtNaam, txtUren;
    private JRadioButton radioButtonArb, radioButtonBed, radioButtonKad;
    private JList keuzelijstAfdelingen;
    static MyTableGUI frame = new MyTableGUI();

    public static void main(String[] argv) {

        frame.setSize(450, 250);
        //frame.createGUI();
        frame.myMethod();
        frame.setTitle("Taakinvulling werknemer");
        frame.setVisible(true);
        frame.setSize(700, 200);

        //This will center the JFrame in the middle of the screen
        frame.setLocationRelativeTo(null);
        //frame.pack();
    }

    private void myMethod() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        JTable table = new JTable(new MyTableModel());

        //Set the column sorting functionality on
        table.setAutoCreateRowSorter(true);

        //Uncomment the next line if you want to turn the grid lines off
        //  table.setShowGrid(false);
        //Change the colour of the table - yellow for gridlines 
        //blue for background
        table.setGridColor(Color.YELLOW);
        table.setBackground(Color.CYAN);

        //String array to populate the combobox options
        String[] countries = {"Australia", "Brazil", "Canada", "China", "France", "Japan", "Norway", "Russia", "South Korea", "Tunisia", "USA"};
        JComboBox countryCombo = new JComboBox(countries);

        //Set the default editor for the Country column to be the combobox
        TableColumn countryColumn = table.getColumnModel().getColumn(2);
        countryColumn.setCellEditor(new DefaultCellEditor(countryCombo));

        //set the Event column to be larger than the rest and the Place column 
        //to be smaller
        TableColumn eventColumn = table.getColumnModel().getColumn(3);
        eventColumn.setPreferredWidth(150);

        TableColumn placeColumn = table.getColumnModel().getColumn(4);
        placeColumn.setPreferredWidth(5);

        //Place the JTable object in a JScrollPane for a scrolling table
        JScrollPane tableScrollPane = new JScrollPane(table);

        frame.add(tableScrollPane);
        frame.setVisible(true);

    }

    private void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        //setLayout(new GridLayout(4, 1));
        JPanel panelDatum = new JPanel();
        JPanel panelNaam = new JPanel();
        JPanel panelFunctieAfdeling = new JPanel();
        JPanel panelUren = new JPanel();
        JLabel lblMaanden = new JLabel("maand:");
        String[] cboElementen = {"Januari", "Februari", "Maart", "April", "Mei", "Juni",
            "Juli", "Augustus", "September", "Oktober", "November", "December"};
        cboMaanden = new JComboBox(cboElementen);
        JLabel lblJaar = new JLabel("jaar:");
        txtJaar = new JTextField(4); // 4 pos voor grootte tekstveld 
        panelDatum.add(cboMaanden);
        panelDatum.add(lblJaar);
        panelDatum.add(txtJaar);
        JLabel lblNaam = new JLabel("naam:");
        txtNaam = new JTextField(30);
        panelNaam.add(lblNaam);
        panelNaam.add(txtNaam);
        radioButtonArb = new JRadioButton("arbeider");
        radioButtonBed = new JRadioButton("bediende");
        radioButtonKad = new JRadioButton("kaderlid");
        ButtonGroup groepering = new ButtonGroup();
        groepering.add(radioButtonArb);
        groepering.add(radioButtonBed);
        groepering.add(radioButtonKad);
        panelFunctieAfdeling.add(radioButtonArb);
        panelFunctieAfdeling.add(radioButtonBed);
        panelFunctieAfdeling.add(radioButtonKad);
        JLabel lblAfdeling = new JLabel("afdeling:");
        String[] lijstAfdelingen = {"productie", "verkoop", "inkoop", "marketing"};
        keuzelijstAfdelingen = new JList(lijstAfdelingen);
        keuzelijstAfdelingen.setVisibleRowCount(2);
        JScrollPane lijstPaneel = new JScrollPane(keuzelijstAfdelingen);
        panelFunctieAfdeling.add(lblAfdeling);
        panelFunctieAfdeling.add(lijstPaneel);
        JLabel lblUren = new JLabel("aantal uren:");
        txtUren = new JTextField(20);
        panelUren.add(lblUren);
        panelUren.add(txtUren);
        buttonOK = new JButton("OK");
        buttonOK.addActionListener(this);
        add(panelDatum);
        add(panelNaam);
        add(panelFunctieAfdeling);
        add(panelUren);
        add(buttonOK);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == buttonOK) {
            String ingave = "wanneer: " + cboMaanden.getSelectedItem()
                    + " " + txtJaar.getText()
                    + "\nnaam: " + txtNaam.getText()
                    + "\nfunctie: "
                    + (radioButtonArb.isSelected()
                    ? radioButtonArb.getText() : "")
                    + (radioButtonBed.isSelected()
                    ? radioButtonBed.getText() : "")
                    + (radioButtonKad.isSelected()
                    ? radioButtonKad.getText() : "")
                    + "\nafdeling: "
                    + (keuzelijstAfdelingen.isSelectionEmpty()
                    ? "" : keuzelijstAfdelingen.getSelectedValue())
                    + "\nuren: " + txtUren.getText();
            JOptionPane.showMessageDialog(null, ingave);
        }
    }
}
