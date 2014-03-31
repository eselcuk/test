/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpf.gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author zi05
 */
public class Begroeting extends JFrame implements ActionListener {

    private JTextField tekstveld;
    private JLabel tekst, antwoord;
    private JButton knop;

    private JPanel tekenen;
    private Graphics g;

    public Begroeting() {
        setTitle("Welkom");
    }

    public static void main(String[] args) {
        Begroeting frame = new Begroeting();
        frame.createGUI();
        //frame.setResizable(false);
        frame.pack();
        frame.setVisible(true);
    }

    private void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        tekst = new JLabel("Geef uw naam: ");
        tekstveld = new JTextField(20);
        knop = new JButton("Klik mij");
        antwoord = new JLabel();
        //setResizable(false);
        //add(tekst);
        //add(tekstveld);
        JPanel paneel = new JPanel();
        paneel.add(tekst);
        paneel.add(tekstveld);
        add(paneel);

        add(knop);
        add(antwoord);

        tekenen = new JPanel();
        tekenen.setPreferredSize(new Dimension(350, 50));
        add(tekenen);

        knop.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String t = " Welkom bij ons " + tekstveld.getText();
        antwoord.setText(t);
        //pack();
        tekenen.setBackground(Color.red);
        g = tekenen.getGraphics();
        g.drawString("Er is op de knop geklikt", 30, 10);
        g.setColor(Color.GREEN);
        g.drawRect(WIDTH, WIDTH, WIDTH, WIDTH); // de omtrek van een rechthoek tekenen in de voorgrondkleur.
        g.fillRect(WIDTH, WIDTH, WIDTH, WIDTH); // een rechthoek tekenen en opvullen met de voorgrondkleur.
        g.drawOval(WIDTH, WIDTH, WIDTH, WIDTH); // de omtrek van een ellips of een cirkel.
        g.fillOval(WIDTH, WIDTH, WIDTH, WIDTH); // een ellips of cirkel gevuld met de voorgrondkleur.
        g.drawLine(WIDTH, WIDTH, WIDTH, WIDTH); // een lijn.
        //g.drawPolygon(null); // een veelhoek;
        //g.fillPolygon(null); // een gevulde veelhoek
        //g... others
    }
}
