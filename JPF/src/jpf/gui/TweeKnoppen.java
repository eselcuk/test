/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpf.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TweeKnoppen extends JFrame implements ActionListener {

    private JButton cmdEen, cmdTwee;
    private JTextField txtResultaat;

    public TweeKnoppen() {
        setTitle("Test met twee knoppen");
    }

    public static void main(String[] args) {
        TweeKnoppen frame = new TweeKnoppen();
        frame.createGUI();
        frame.pack();
        frame.setVisible(true);
    }

    private void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        cmdEen = new JButton("Een");
        cmdTwee = new JButton("Twee");
        add(cmdEen);
        add(cmdTwee);
        txtResultaat = new JTextField(30);
        add(txtResultaat);
        cmdEen.addActionListener(this);
        cmdTwee.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.getActionCommand());
        System.out.println(e.getSource());
        if (e.getSource() == cmdEen) {
            //e.getActionCommand(); //alternative for getSource method
            txtResultaat.setText("Er is op knop Een geklikt");
        } else {
            txtResultaat.setText("Er is op knop Twee geklikt");
        }
        pack();
    }
}
