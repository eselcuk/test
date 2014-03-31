/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpf.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Menuutje extends JFrame implements ActionListener {

    private JMenuBar menuBalk;
    private JMenu bestandMenu, wijzigMenu;
    private JMenuItem openItem, saveItem, copyItem, pasteItem, sluitAf;
    private JTextField keuze;

    public static void main(String[] args) {
        Menuutje frame = new Menuutje();
        frame.createGUI();
        frame.pack();
        frame.setVisible(true);
    }

    private void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        menuBalk = new JMenuBar();
        setJMenuBar(menuBalk);
        bestandMenu = new JMenu("Bestand");
        openItem = new JMenuItem("Openen");
        bestandMenu.add(openItem);
        openItem.addActionListener(this);
        saveItem = new JMenuItem("Bewaren");
        bestandMenu.add(saveItem);
        saveItem.addActionListener(this);
        bestandMenu.addSeparator();
        sluitAf = new JMenuItem("Afsluiten");
        bestandMenu.add(sluitAf);
        sluitAf.addActionListener(this);
        menuBalk.add(bestandMenu);
        wijzigMenu = new JMenu("Bewerken");
        copyItem = new JMenuItem("Kopieren");
        wijzigMenu.add(copyItem);
        copyItem.addActionListener(this);
        pasteItem = new JMenuItem("Plakken");
        wijzigMenu.add(pasteItem);
        pasteItem.addActionListener(this);
        menuBalk.add(wijzigMenu);
        keuze = new JTextField(10);
        add(keuze);
        
        //other components
        //JSlider : Component waarmee je een waarde kan selecteren tussen grenswaarden middels het verschuiven van een soort knop.
        //JTabbedPane : Paneel met tabbladen.
        //JFileChooser : Mechanisme om een bestand te kiezen.
        //JProgressBar : Een balk die de vooruitgang weergeeft van bepaalde taken.
        //JColorChooser : Mechanisme om via een palet een kleur te kiezen en/of te manipuleren.
        //.....
        
        
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == openItem) keuze.setText("U koos : Openen ");
        if (e.getSource() == saveItem) keuze.setText("U koos: Bewaren");
        if (e.getSource() == sluitAf) System.exit(0); // stops the program and return a value (this case, 0) to the OS
        if (e.getSource() == copyItem) keuze.setText("U koos: Kopieren");
        if (e.getSource() == pasteItem) keuze.setText("U koos: Plakken");
    }
}
