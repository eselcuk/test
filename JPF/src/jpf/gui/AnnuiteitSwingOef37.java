/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpf.gui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AnnuiteitSwingOef37 extends JFrame implements ActionListener {

    private JTextField txtRentevoet;
    private JTextField txtPerioden;
    private JTextField txtKapitaal;
    private JLabel lblAnnuiteit;
    private JButton btnBereken;

    public AnnuiteitSwingOef37() {
        super("Constante annuïteiten");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2));
        JLabel lblRentevoet = new JLabel("periodieke rentevoet");
        add(lblRentevoet);
        txtRentevoet = new JTextField();
        add(txtRentevoet);
        JLabel lblPerioden = new JLabel("aantal perioden");
        add(lblPerioden);
        txtPerioden = new JTextField();
        add(txtPerioden);
        JLabel lblKapitaal = new JLabel("ontleend kapitaal");
        add(lblKapitaal);
        txtKapitaal = new JTextField();
        add(txtKapitaal);
        btnBereken = new JButton("Bereken afbetaling");
        add(btnBereken);
        lblAnnuiteit = new JLabel();
        lblAnnuiteit.setHorizontalAlignment(SwingConstants.RIGHT);
        add(lblAnnuiteit);
        btnBereken.addActionListener(this);
        setSize(300, 120);
        show();

    }

    @Override
    public void actionPerformed(ActionEvent evt) {
        double dRentevoet = Double.parseDouble(txtRentevoet.getText());
        int iPerioden = Integer.parseInt(txtPerioden.getText());
        double dKapitaal = Double.parseDouble(txtKapitaal.getText());
        // tussenresultaat: v = (1 + rentevoet)^jaarperioden 
        double v = 1.0;
        iPerioden /= 12;
        for (int k = 1; k <= (iPerioden); k++) {
            v *= 1 + dRentevoet;
        }
        double dAnnuiteit = dKapitaal * dRentevoet * v / (v - 1) / 12;
        lblAnnuiteit.setText(String.valueOf(dAnnuiteit));
    }

    public static void main(String[] argv) {
        AnnuiteitSwingOef37 hetVenster = new AnnuiteitSwingOef37();
    }
}
