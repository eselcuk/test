/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.essatest;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @Ekber Selcuk
 */
public class EmployeeHoursRecorderGUI extends JFrame implements ActionListener {

    private JLabel lblDate, lblEmpID, lblEmpName, lblClient,
            lblTimeIn, lblTimeOut, lblBreak, lblBreakBefore;
    private JComboBox cboEmpID, cboEmpName;
    private JList listDate, listClient;
    private JTextField txtTimeIn, txtTimeOut, txtBreak;
    private JCheckBox chkBreakBefore;
    private JButton btnAddNewLine, btnSave, btnClose;

    public static void main(String[] argv) {
        EmployeeHoursRecorderGUI frame = new EmployeeHoursRecorderGUI();
        frame.createGUI();
        frame.setSize(450, 250);//instellen breedte,hoogte (ipv pack())
        frame.setTitle("Uur prestaties werknemer");
        frame.setVisible(true);
        //frame.pack();
    }

    private void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        JPanel panel = new JPanel();
        
        
        //setLayout(new GridLayout(4, 1));
        JPanel pnlDate = new JPanel();
        JPanel pnlEntryFields = new JPanel();
        JPanel pnlSaveCloseButton = new JPanel();
        JLabel lblMaanden = new JLabel("maand:");

        long aDayInMiliSeconds = 24 * 3600 * 1000;
        Date date2 = new Date();
        Date date1 = new Date(date2.getTime() - aDayInMiliSeconds * 40);

        int numOfDays = (int) ((date2.getTime() - date1.getTime()) / aDayInMiliSeconds);

        /* listDate = new JList(new String[]());
        
         listDate.ad
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
         */
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        /*   if (e.getSource() == buttonOK) {
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
         */
    }

}
