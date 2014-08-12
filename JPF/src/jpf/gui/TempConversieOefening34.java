/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpf.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TempConversieOefening34 extends JFrame implements ActionListener {

    private JPanel panel1 = new JPanel();
    private JPanel panel2 = new JPanel();
    private JTextField textTempCelsius;
    private JLabel labelCelsius;
    private JButton knopConverteer;
    private JLabel labelFahrenheit;

    public TempConversieOefening34() {
        setSize(350, 150);
        setTitle("Temperatuur omzetten C - F");
    }

    public static void main(String[] args) {
        TempConversieOefening34 frame = new TempConversieOefening34();
        frame.createGUI();
        frame.setVisible(true);
        //frame.pack();
    }

    private void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        labelCelsius = new JLabel("Celsius");
        textTempCelsius = new JTextField(12);
        knopConverteer = new JButton("Converteer");
        labelFahrenheit = new JLabel("Fahrenheit");
        panel1.add(textTempCelsius);
        panel1.add(labelCelsius);
        panel2.add(knopConverteer);
        panel2.add(labelFahrenheit);
        add(panel1);
        add(panel2);
        knopConverteer.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int tempFahr = (int) ((Double.parseDouble(textTempCelsius.getText())) * 1.8 + 32);
        labelFahrenheit.setText(tempFahr + " Fahrenheit");
    }
}
