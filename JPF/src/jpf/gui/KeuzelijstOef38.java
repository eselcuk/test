
package jpf.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class KeuzelijstOef38 extends JFrame implements ActionListener {

    private JButton cmdVerwijderen, cmdOmhoog, cmdOmlaag, cmdNieuw;
    private JPanel paneel;
    private JList keuzelijst;
    private DefaultListModel eenModel;

    public static void main(String[] args) {
        KeuzelijstOef38 frame = new KeuzelijstOef38();
        frame.setSize(240, 200);
        frame.createGUI();
        frame.setVisible(true);
    }

    private void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        paneel = new JPanel();
        cmdVerwijderen = new JButton("Verwijderen");
        cmdOmhoog = new JButton("Omhoog");
        cmdOmlaag = new JButton("Omlaag");
        cmdNieuw = new JButton("Nieuw");
        paneel.setLayout(new GridLayout(4, 1));
        paneel.add(cmdVerwijderen);
        paneel.add(cmdOmhoog);
        paneel.add(cmdOmlaag);
        paneel.add(cmdNieuw);
        eenModel = new DefaultListModel();
        eenModel.addElement("Water");
        eenModel.addElement("Wijn");
        eenModel.addElement("Bier");
        eenModel.addElement("Koffie");
        eenModel.addElement("Thee");
        eenModel.addElement("Soep");
        keuzelijst = new JList(eenModel);
        keuzelijst.setFixedCellWidth(100);
        keuzelijst.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        add(keuzelijst, "West");
        add(paneel, "East");
        cmdVerwijderen.addActionListener(this);
        cmdOmhoog.addActionListener(this);
        cmdOmlaag.addActionListener(this);
        cmdNieuw.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == cmdVerwijderen) {
            int dewelke = keuzelijst.getSelectedIndex();
            if (dewelke != -1) {
                eenModel.removeElementAt(dewelke);
            }
        }
        if (e.getSource() == cmdOmhoog) {
            int dewelke = keuzelijst.getSelectedIndex();
            Object dedrank = keuzelijst.getSelectedValue();
            if (dewelke > 0) {
                eenModel.removeElementAt(dewelke);
                eenModel.add(dewelke - 1, dedrank);
                keuzelijst.setSelectedIndex(dewelke - 1);
            }
        }
        if (e.getSource() == cmdOmlaag) {
            int dewelke = keuzelijst.getSelectedIndex();
            Object dedrank = keuzelijst.getSelectedValue();
            if (dewelke != -1 && dewelke < eenModel.getSize() - 1) {
                eenModel.removeElementAt(dewelke);
                eenModel.add(dewelke + 1, dedrank);
                keuzelijst.setSelectedIndex(dewelke + 1);
            }
        }
        if (e.getSource() == cmdNieuw) {
            String deNieuwe = JOptionPane.showInputDialog(
                    null, "Nieuwe drank:");
            if (!deNieuwe.equals("")) {
                eenModel.addElement(deNieuwe);
                keuzelijst.setSelectedIndex(eenModel.indexOf(deNieuwe));
            }
        }
    }
}
