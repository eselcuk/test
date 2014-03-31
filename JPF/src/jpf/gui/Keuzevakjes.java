/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpf.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Keuzevakjes extends JFrame implements ItemListener {

    private JCheckBox drinken;
    private JTextField resultaat;
    private JRadioButton bier, water, wijn;

    public Keuzevakjes() {
        setTitle("Test met keuzevakjes en radiobuttons");
    }

    public static void main(String[] args) {
        Keuzevakjes frame = new Keuzevakjes();
        frame.createGUI();
        frame.pack();
        frame.setVisible(true);
    }

    private void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        drinken = new JCheckBox("Wenst u iets te drinken?", false);
        resultaat = new JTextField(20);
        add(drinken);
        add(resultaat);
        drinken.addItemListener(this);
        bier = new JRadioButton("bier", false);
        water = new JRadioButton("water", false);
        wijn = new JRadioButton("wijn", false);
        ButtonGroup groep = new ButtonGroup();
        groep.add(bier);
        groep.add(water);
        groep.add(wijn);
        add(bier);
        add(water);
        add(wijn);
        drinken.addItemListener(this);
        bier.addItemListener(this);
        water.addItemListener(this);
        wijn.addItemListener(this);
    }

    public void itemStateChanged(ItemEvent e) {
        if (e.getSource() == drinken) {
            if (drinken.isSelected()) {
                resultaat.setText("U wenst iets te drinken.");
            } else {
                resultaat.setText("U hebt dus geen dorst.");
            }
        }
        if (e.getSource() == bier) resultaat.setText("U wenst bier");
        if (e.getSource() == water) resultaat.setText("U wenst water");
        if (e.getSource() == wijn) resultaat.setText("U wenst wijn");
    }
}
