/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpf.gui;

import javax.swing.JOptionPane;

public class DialoogVensters {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Dit is een dialoogvenster");
        JOptionPane.showConfirmDialog(null, "Dit vraagt om bevestiging");
        String t = JOptionPane.showInputDialog(null, "Geef een antwoord");
        Object[] options = {"OK", "CANCEL"};
        JOptionPane.showOptionDialog(null, "Click OK to continue", "Warning", 
                JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, 
                null, options, options[0]);
    }
}
