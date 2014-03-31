/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpf.gui;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class Keuzelijst extends JFrame implements ListSelectionListener {

    private JList lstKies;

    public Keuzelijst() {
        setTitle("Test met een Lijst");
    }

    public static void main(String[] args) {
        Keuzelijst frame = new Keuzelijst();
        frame.createGUI();
        frame.pack();
        frame.setVisible(true);
    }

    private void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        String[] dranken = {"Bier", "Cola", "Koffie", "Thee", "Water", "Wijn", "Pils", "Duvel", "Kriek", "Geuze"};
       
        lstKies = new JList(dranken);
        JScrollPane metSchuif = new JScrollPane(lstKies);
        add(metSchuif);
     
        //add(lstKies);
        lstKies.addListSelectionListener(this);
        //lstKies.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        Object[] uwKeuze = lstKies.getSelectedValues();
        for (int i = 0; i < uwKeuze.length; i++) {
            System.out.println(uwKeuze.length);
            System.out.println(uwKeuze[i].toString());
        }
        pack();
    }
}
