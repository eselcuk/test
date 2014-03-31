/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpf.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TestBorder extends JFrame implements ActionListener {

    private JButton cmdEen, cmdTwee;
    private JTextField txtResultaat;
    private JPanel paneel;

    public static void main(String[] args) {
        TestBorder frame = new TestBorder();
        frame.createGUI();
        frame.setSize(350, 200); //instellen breedte,hoogte (ipv pack()) 
        frame.setVisible(true);
    }

    private void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        paneel = new JPanel();
        cmdEen = new JButton("Een");
        cmdTwee = new JButton("Twee");
        paneel.add(cmdEen);
        paneel.add(cmdTwee);
        JLabel titel = new JLabel("Ik sta in het noorden");
        add(titel, BorderLayout.NORTH);
        txtResultaat = new JTextField(30);
        add(txtResultaat, "Center");
        add(paneel, BorderLayout.SOUTH);
        cmdEen.addActionListener(this);
        cmdTwee.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == cmdEen) txtResultaat.setText("Er is op knope Een geklikt");
        if (e.getSource() == cmdTwee) txtResultaat.setText("Er is op knope Twee geklikt");
    }
}
