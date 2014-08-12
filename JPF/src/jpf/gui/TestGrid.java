/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpf.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TestGrid extends JFrame implements ActionListener {

    private JButton cmdEen, cmdTwee;
    private JTextField txtNaam, txtEmail;

    public static void main(String[] args) {
        TestGrid frame = new TestGrid();
        frame.createGUI();
        //frame.pack();
        frame.setSize(450, 200); //instellen breedte,hoogte (ipv pack()) 
        frame.setVisible(true);
    }

    private void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 2));
        cmdEen = new JButton("Controle");
        cmdTwee = new JButton("Wissen");
        JLabel lblNaam = new JLabel("Uw naam:");
        add(lblNaam);
        txtNaam = new JTextField(10);
        add(txtNaam);
        JLabel lblEmail = new JLabel("Uw e-mail:");
        add(lblEmail);
        txtEmail = new JTextField(10);
        add(txtEmail);
        add(cmdEen);
        add(cmdTwee);
        cmdEen.addActionListener(this);
        cmdTwee.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
    }
}
