package jpf.classesobjectsinheritance;

import jpf.classesobjectsinheritance.ZichtRekening;
import jpf.classesobjectsinheritance.SpaarRekening;
import java.text.DecimalFormat;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author zi05
 */
public class BankBediende {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DecimalFormat fmt = new DecimalFormat("#,##0.00");
        try {
            SpaarRekening spaar = new SpaarRekening("BE12 3456 7890 1234", 2.5);
            ZichtRekening zicht = new ZichtRekening("BE98 7654 3210 9876", 1000);
            spaar.storten(100.0);
            zicht.storten(200.0);
            zicht.afhalen(50.0);

            System.out.println(spaar);
            System.out.println("Saldo van de spaarrekening: " + fmt.format(spaar.geefSaldo()));

            System.out.println("");
            System.out.println(zicht);
            System.out.println("Rente van de zichtrekening: " + fmt.format(zicht.geefSaldo()));

            zicht.afhalen(2000);
            System.out.println("Saldo van de zichtrekening (na poging "
                    + "afhalen 2000): " + fmt.format(zicht.geefSaldo()));
        } catch (Exception e) {  }
    }
}
