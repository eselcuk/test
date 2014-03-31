/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpf.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUIElementenSwingOef36 extends JFrame implements ActionListener {

    private JButton buttonOK;
    private JComboBox cboMaanden;
    private JTextField txtJaar, txtNaam, txtUren;
    private JRadioButton radioButtonArb, radioButtonBed, radioButtonKad;
    private JList keuzelijstAfdelingen;

    public static void main(String[] argv) {
        GUIElementenSwingOef36 frame = new GUIElementenSwingOef36();
        frame.setSize(450, 250);
        frame.createGUI();
        frame.setTitle("Taakinvulling werknemer");
        frame.setVisible(true);
        //frame.pack();
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
