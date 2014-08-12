/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpf.gui;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class HelloWorld extends JFrame {
    private JLabel label;
    public static void main(String[] args) {

        HelloWorld frame = new HelloWorld();
        frame.createGUI();
        frame.pack();
        frame.setVisible(true);
    }
    private void createGUI(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        label = new JLabel("Hello World!");
        add(label);
    }
}
