/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpf.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DrieButtonsOefening35 extends JFrame implements ActionListener {

    private JButton buttonLinks;
    private JButton buttonMidden;
    private JButton buttonRechts;

    public static void main(String[] args) {
        DrieButtonsOefening35 frame = new DrieButtonsOefening35();
        frame.setSize(600, 200);
        frame.createGUI();
        frame.setVisible(true);
        frame.setTitle("Spelen met 3 buttons");
    }

    private void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        JPanel panel = new JPanel();
        buttonLinks = new JButton("Disable knop -->");
        buttonRechts = new JButton("<--Enable knop");
        buttonRechts.setEnabled(false);
        ImageIcon icon = new ImageIcon("C:\\JPFProjecten\\IntroInKlassen\\src/jpf/files/gelukkig.gif");
        buttonMidden = new JButton("Middelste knop", icon);
        panel.add(buttonLinks);
        panel.add(buttonMidden);
        panel.add(buttonRechts);
        add(panel);
        buttonLinks.addActionListener(this);
        buttonMidden.addActionListener(this);
        buttonRechts.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == buttonLinks) {
            buttonMidden.setEnabled(false);
            buttonLinks.setEnabled(false);
            buttonRechts.setEnabled(true);
        } else if (e.getSource() == buttonRechts) {
            buttonMidden.setEnabled(true);
            buttonRechts.setEnabled(false);
            buttonLinks.setEnabled(true);
        } else {
            JOptionPane.showMessageDialog(null, "U koos voor de middelste knop");
        }
    }
}
