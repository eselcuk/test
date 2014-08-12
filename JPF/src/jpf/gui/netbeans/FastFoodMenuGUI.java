package jpf.gui.netbeans;

import java.awt.Component;
import java.util.Enumeration;
import javax.swing.AbstractButton;
import javax.swing.JCheckBox;

public class FastFoodMenuGUI extends javax.swing.JFrame {

    public FastFoodMenuGUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        groupMenus = new javax.swing.ButtonGroup();
        groupFrieten = new javax.swing.ButtonGroup();
        groupDrinks = new javax.swing.ButtonGroup();
        groupDrinksize = new javax.swing.ButtonGroup();
        panelMenus = new javax.swing.JPanel();
        radioDoubleCheese = new javax.swing.JRadioButton();
        radioKingBurger = new javax.swing.JRadioButton();
        radioFishBurger = new javax.swing.JRadioButton();
        radioVegeterianBurger = new javax.swing.JRadioButton();
        radioChickenNuggets = new javax.swing.JRadioButton();
        radioCheeseHam = new javax.swing.JRadioButton();
        panelFrieten = new javax.swing.JPanel();
        radioSmall = new javax.swing.JRadioButton();
        radioMedium = new javax.swing.JRadioButton();
        radioLarge = new javax.swing.JRadioButton();
        panelDrinks = new javax.swing.JPanel();
        radioCoke = new javax.swing.JRadioButton();
        radioFanta = new javax.swing.JRadioButton();
        radioSprite = new javax.swing.JRadioButton();
        panelDrinksize = new javax.swing.JPanel();
        radio30cl = new javax.swing.JRadioButton();
        radio40cl = new javax.swing.JRadioButton();
        radio50cl = new javax.swing.JRadioButton();
        panelSausjes = new javax.swing.JPanel();
        chkKetchup = new javax.swing.JCheckBox();
        chkMayo = new javax.swing.JCheckBox();
        chkCurry = new javax.swing.JCheckBox();
        chkZoetzuur = new javax.swing.JCheckBox();
        chkTataar = new javax.swing.JCheckBox();
        spinner = new javax.swing.JSpinner();
        lblTafel = new javax.swing.JLabel();
        lblKKnr = new javax.swing.JLabel();
        btnWissen = new javax.swing.JButton();
        btnAfrekenen = new javax.swing.JButton();
        lblTotaal = new javax.swing.JLabel();
        lblBestelling = new javax.swing.JLabel();
        formatedTxtKKNr = new javax.swing.JFormattedTextField();
        lblTotaalInfo = new javax.swing.JLabel();
        lblBestelInfo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Fast Food Ordering Menu");

        panelMenus.setBorder(javax.swing.BorderFactory.createTitledBorder("Menu's (3,00 €)"));

        groupMenus.add(radioDoubleCheese);
        radioDoubleCheese.setText("Double Cheese");
        radioDoubleCheese.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioDoubleCheeseActionPerformed(evt);
            }
        });

        groupMenus.add(radioKingBurger);
        radioKingBurger.setText("King Burger");

        groupMenus.add(radioFishBurger);
        radioFishBurger.setText("Fish Burger");

        groupMenus.add(radioVegeterianBurger);
        radioVegeterianBurger.setText("Vegetarian Burger");

        groupMenus.add(radioChickenNuggets);
        radioChickenNuggets.setText("Chicken Nuggets");
        radioChickenNuggets.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioChickenNuggetsActionPerformed(evt);
            }
        });

        groupMenus.add(radioCheeseHam);
        radioCheeseHam.setText("Cheese & Ham");

        javax.swing.GroupLayout panelMenusLayout = new javax.swing.GroupLayout(panelMenus);
        panelMenus.setLayout(panelMenusLayout);
        panelMenusLayout.setHorizontalGroup(
            panelMenusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenusLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(panelMenusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(radioDoubleCheese)
                    .addComponent(radioKingBurger)
                    .addComponent(radioFishBurger))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelMenusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radioVegeterianBurger)
                    .addComponent(radioChickenNuggets)
                    .addComponent(radioCheeseHam))
                .addGap(68, 68, 68))
        );

        panelMenusLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {radioCheeseHam, radioChickenNuggets, radioDoubleCheese, radioFishBurger, radioKingBurger, radioVegeterianBurger});

        panelMenusLayout.setVerticalGroup(
            panelMenusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenusLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelMenusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioDoubleCheese)
                    .addComponent(radioVegeterianBurger))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelMenusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioKingBurger)
                    .addComponent(radioChickenNuggets))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelMenusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioFishBurger)
                    .addComponent(radioCheeseHam))
                .addGap(30, 30, 30))
        );

        panelMenusLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {radioCheeseHam, radioChickenNuggets, radioDoubleCheese, radioFishBurger, radioKingBurger, radioVegeterianBurger});

        panelFrieten.setBorder(javax.swing.BorderFactory.createTitledBorder("Frieten"));

        groupFrieten.add(radioSmall);
        radioSmall.setText("Small (1.40 €)");

        groupFrieten.add(radioMedium);
        radioMedium.setText("Medium (1.80 €)");
        radioMedium.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioMediumActionPerformed(evt);
            }
        });

        groupFrieten.add(radioLarge);
        radioLarge.setText("Large (2.20 €)");
        radioLarge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioLargeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelFrietenLayout = new javax.swing.GroupLayout(panelFrieten);
        panelFrieten.setLayout(panelFrietenLayout);
        panelFrietenLayout.setHorizontalGroup(
            panelFrietenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFrietenLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(panelFrietenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(radioSmall, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(radioLarge, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(radioMedium, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        panelFrietenLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {radioLarge, radioSmall});

        panelFrietenLayout.setVerticalGroup(
            panelFrietenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFrietenLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(radioSmall)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radioMedium)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radioLarge)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelFrietenLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {radioLarge, radioMedium, radioSmall});

        panelDrinks.setBorder(javax.swing.BorderFactory.createTitledBorder("Drinks"));

        groupDrinks.add(radioCoke);
        radioCoke.setText("Coke");

        groupDrinks.add(radioFanta);
        radioFanta.setText("Fanta");

        groupDrinks.add(radioSprite);
        radioSprite.setText("Sprite");

        javax.swing.GroupLayout panelDrinksLayout = new javax.swing.GroupLayout(panelDrinks);
        panelDrinks.setLayout(panelDrinksLayout);
        panelDrinksLayout.setHorizontalGroup(
            panelDrinksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDrinksLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDrinksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radioCoke)
                    .addComponent(radioFanta)
                    .addComponent(radioSprite))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelDrinksLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {radioCoke, radioFanta, radioSprite});

        panelDrinksLayout.setVerticalGroup(
            panelDrinksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDrinksLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(radioCoke)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radioFanta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radioSprite)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        panelDrinksLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {radioCoke, radioFanta, radioSprite});

        panelDrinksize.setBorder(javax.swing.BorderFactory.createTitledBorder("Drinksize"));

        groupDrinksize.add(radio30cl);
        radio30cl.setText("30 cl (1.30 €)");

        groupDrinksize.add(radio40cl);
        radio40cl.setText("40 cl (1.70 €)");

        groupDrinksize.add(radio50cl);
        radio50cl.setText("50 cl (2.00 €)");

        javax.swing.GroupLayout panelDrinksizeLayout = new javax.swing.GroupLayout(panelDrinksize);
        panelDrinksize.setLayout(panelDrinksizeLayout);
        panelDrinksizeLayout.setHorizontalGroup(
            panelDrinksizeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDrinksizeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDrinksizeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radio30cl)
                    .addComponent(radio40cl)
                    .addComponent(radio50cl))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        panelDrinksizeLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {radio30cl, radio40cl, radio50cl});

        panelDrinksizeLayout.setVerticalGroup(
            panelDrinksizeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDrinksizeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(radio30cl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radio40cl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radio50cl)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelDrinksizeLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {radio30cl, radio40cl, radio50cl});

        panelSausjes.setBorder(javax.swing.BorderFactory.createTitledBorder("Sausjes (0,50 €)"));

        chkKetchup.setText("Ketchup");
        chkKetchup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkKetchupActionPerformed(evt);
            }
        });

        chkMayo.setText("Mayo");

        chkCurry.setText("Curry");

        chkZoetzuur.setText("Zoetzuur");

        chkTataar.setText("Tartaar");

        javax.swing.GroupLayout panelSausjesLayout = new javax.swing.GroupLayout(panelSausjes);
        panelSausjes.setLayout(panelSausjesLayout);
        panelSausjesLayout.setHorizontalGroup(
            panelSausjesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSausjesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chkKetchup)
                .addGap(4, 4, 4)
                .addComponent(chkMayo)
                .addGap(4, 4, 4)
                .addComponent(chkCurry)
                .addGap(4, 4, 4)
                .addComponent(chkZoetzuur)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chkTataar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelSausjesLayout.setVerticalGroup(
            panelSausjesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSausjesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelSausjesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkKetchup)
                    .addComponent(chkMayo)
                    .addComponent(chkCurry)
                    .addComponent(chkZoetzuur)
                    .addComponent(chkTataar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblTafel.setText("Tafel");

        lblKKnr.setText("Kreditkaartnummer:");

        btnWissen.setText("Wissen");
        btnWissen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWissenActionPerformed(evt);
            }
        });

        btnAfrekenen.setText("Afrekenen");
        btnAfrekenen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAfrekenenActionPerformed(evt);
            }
        });

        lblTotaal.setText("Totaal:");

        lblBestelling.setText("Bestelling :");

        formatedTxtKKNr.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#### #### #### ####"))));
        formatedTxtKKNr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formatedTxtKKNrActionPerformed(evt);
            }
        });

        lblBestelInfo.setText(" ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelSausjes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelMenus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(lblBestelling, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblBestelInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelFrieten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(panelDrinks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(panelDrinksize, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnWissen, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnAfrekenen)
                            .addGap(30, 30, 30)
                            .addComponent(lblTotaal)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblTotaalInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblTafel)
                            .addGap(12, 12, 12)
                            .addComponent(spinner, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(lblKKnr)
                            .addGap(18, 18, 18)
                            .addComponent(formatedTxtKKNr, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelMenus, javax.swing.GroupLayout.PREFERRED_SIZE, 124, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelFrieten, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelDrinks, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelDrinksize, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(panelSausjes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTafel)
                    .addComponent(lblKKnr)
                    .addComponent(formatedTxtKKNr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnWissen)
                        .addComponent(btnAfrekenen)
                        .addComponent(lblTotaal))
                    .addComponent(lblTotaalInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblBestelling)
                        .addGap(0, 62, Short.MAX_VALUE))
                    .addComponent(lblBestelInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lblKKnr, lblTafel, spinner});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAfrekenen, btnWissen, lblTotaal});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void radioDoubleCheeseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioDoubleCheeseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioDoubleCheeseActionPerformed

    private void radioChickenNuggetsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioChickenNuggetsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioChickenNuggetsActionPerformed

    private void radioLargeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioLargeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioLargeActionPerformed

    private void radioMediumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioMediumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioMediumActionPerformed

    private void btnAfrekenenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAfrekenenActionPerformed
        float werkprijs = 3.0F;
        if (radioSmall.isSelected()) {
            werkprijs += 1.4F;
        } else if (radioMedium.isSelected()) {
            werkprijs += 1.8F;
        } else if (radioLarge.isSelected()) {
            werkprijs += 2.2F;
        }
        if (radio30cl.isSelected()) {
            werkprijs += 1.3F;
        } else if (radio40cl.isSelected()) {
            werkprijs += 1.7F;
        } else if (radio50cl.isSelected()) {
            werkprijs += 2.0F;
        }

        String sausjes = "";
        Component[] sausjesElements = panelSausjes.getComponents();
        for (int i = 0; i < sausjesElements.length; i++) {
            if (sausjesElements[i] instanceof JCheckBox) {
                JCheckBox sausje = (JCheckBox) sausjesElements[i];
                if (sausje.isSelected()) {
                    werkprijs += 0.50F;
                    sausjes += sausje.getActionCommand();
                    sausjes += ", ";
                }
            }
        }
        if (!sausjes.equals("")) {
            sausjes = sausjes.substring(0, sausjes.length() - 2);
        }

        String tekst = "Tafel " + spinner.getValue() + " bestelde een ";
        Enumeration<AbstractButton> elements = groupMenus.getElements();
        while (elements.hasMoreElements()) {
            AbstractButton radio = elements.nextElement();
            if (radio.isSelected()) {
                tekst += radio.getActionCommand();
            }
        }
        tekst += " menu met ";
        elements = groupFrieten.getElements();
        while (elements.hasMoreElements()) {
            AbstractButton radio = elements.nextElement();
            if (radio.isSelected() && radio.getActionCommand().equals("Small (1,40 €)")) {
                tekst += "een kleine portie";
            }
            if (radio.isSelected() && radio.getActionCommand().equals("Medium (1,80 € )")) {
                tekst += "een medium portie";
            }
            if (radio.isSelected() && radio.getActionCommand().equals("Large (2,20 €)")) {
                tekst += "een grote portie";
            }
        }
        tekst += " frietjes met daarbij een ";
        elements = groupDrinks.getElements();
        while (elements.hasMoreElements()) {
            AbstractButton radio = elements.nextElement();
            if (radio.isSelected()) {
                tekst += radio.getActionCommand();
            }
        }
        tekst += " van ";
        elements = groupDrinksize.getElements();
        while (elements.hasMoreElements()) {
            AbstractButton radio = elements.nextElement();
            if (radio.isSelected()) {
                tekst += radio.getActionCommand().substring(0, 5);
            }
        }
        tekst += ". Sausjes : " + sausjes;
        tekst += ". Wenst te betalen met kredietkaart " + formatedTxtKKNr.getText();
        tekst = "<html>" + tekst + ".</html>";
        lblBestelInfo.setText(tekst);

        String m = String.valueOf(werkprijs) + " €";
        lblTotaalInfo.setText(m);
    }//GEN-LAST:event_btnAfrekenenActionPerformed

    private void chkKetchupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkKetchupActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkKetchupActionPerformed

    private void btnWissenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWissenActionPerformed
        //sausjes-selectie wissen 
        Component[] sausjesElements = panelSausjes.getComponents();
        for (int i = 0; i < sausjesElements.length; i++) {
            if (sausjesElements[i] instanceof JCheckBox) {
                JCheckBox sausje = (JCheckBox) sausjesElements[i];
                if (sausje.isSelected()) {
                    sausje.setSelected(false);
                }
            }
        }
        //menu's-selectie wissen 
        groupMenus.clearSelection(); 
        //frieten-selectie wissen 
        groupFrieten.clearSelection(); 
        //drinks-selectie wissen 
        groupDrinks.clearSelection(); 
        //drinksize-selectie wissen 
        groupDrinksize.clearSelection();
        
        // set values to 0
        lblBestelInfo.setText(""); 
        lblTotaalInfo.setText(""); 
        spinner.setValue(0); 
      //  formatedTxtKKNr.setValue("");
    }//GEN-LAST:event_btnWissenActionPerformed

    private void formatedTxtKKNrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_formatedTxtKKNrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_formatedTxtKKNrActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FastFoodMenuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FastFoodMenuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FastFoodMenuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FastFoodMenuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FastFoodMenuGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAfrekenen;
    private javax.swing.JButton btnWissen;
    private javax.swing.JCheckBox chkCurry;
    private javax.swing.JCheckBox chkKetchup;
    private javax.swing.JCheckBox chkMayo;
    private javax.swing.JCheckBox chkTataar;
    private javax.swing.JCheckBox chkZoetzuur;
    private javax.swing.JFormattedTextField formatedTxtKKNr;
    private javax.swing.ButtonGroup groupDrinks;
    private javax.swing.ButtonGroup groupDrinksize;
    private javax.swing.ButtonGroup groupFrieten;
    private javax.swing.ButtonGroup groupMenus;
    private javax.swing.JLabel lblBestelInfo;
    private javax.swing.JLabel lblBestelling;
    private javax.swing.JLabel lblKKnr;
    private javax.swing.JLabel lblTafel;
    private javax.swing.JLabel lblTotaal;
    private javax.swing.JLabel lblTotaalInfo;
    private javax.swing.JPanel panelDrinks;
    private javax.swing.JPanel panelDrinksize;
    private javax.swing.JPanel panelFrieten;
    private javax.swing.JPanel panelMenus;
    private javax.swing.JPanel panelSausjes;
    private javax.swing.JRadioButton radio30cl;
    private javax.swing.JRadioButton radio40cl;
    private javax.swing.JRadioButton radio50cl;
    private javax.swing.JRadioButton radioCheeseHam;
    private javax.swing.JRadioButton radioChickenNuggets;
    private javax.swing.JRadioButton radioCoke;
    private javax.swing.JRadioButton radioDoubleCheese;
    private javax.swing.JRadioButton radioFanta;
    private javax.swing.JRadioButton radioFishBurger;
    private javax.swing.JRadioButton radioKingBurger;
    private javax.swing.JRadioButton radioLarge;
    private javax.swing.JRadioButton radioMedium;
    private javax.swing.JRadioButton radioSmall;
    private javax.swing.JRadioButton radioSprite;
    private javax.swing.JRadioButton radioVegeterianBurger;
    private javax.swing.JSpinner spinner;
    // End of variables declaration//GEN-END:variables
}
