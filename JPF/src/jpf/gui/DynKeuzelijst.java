/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpf.gui;

import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;

public class DynKeuzelijst extends JFrame implements ListSelectionListener {

    private JList lstKies;
    private DefaultListModel mijnLijst;

    public DynKeuzelijst() {
        setTitle("Test met een Dynamische Lijst");
    }

    public static void main(String[] args) {
        DynKeuzelijst frame = new DynKeuzelijst();
        frame.createGUI();
        frame.setVisible(true);
        frame.pack();
    }

    private void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        mijnLijst = new DefaultListModel();
        mijnLijst.addElement("Bier");
        mijnLijst.addElement("Koffie");
        mijnLijst.addElement("Water");
        lstKies = new JList(mijnLijst);
        add(lstKies);
        lstKies.addListSelectionListener(this);
    }

    public void valueChanged(ListSelectionEvent e) {
        Object[] uwKeuze = lstKies.getSelectedValues();
        for (int i = 0; i < uwKeuze.length; i++) {
            //System.out.println(uwKeuze.length);
            System.out.println(uwKeuze[i].toString());
        }
        mijnLijst.addElement("Wijn");
        pack();
    }
}
