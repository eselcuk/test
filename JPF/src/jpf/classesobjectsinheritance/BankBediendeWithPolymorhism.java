package jpf.classesobjectsinheritance;

import java.text.DecimalFormat;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author zi05
 */
public class BankBediendeWithPolymorhism {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DecimalFormat fmt = new DecimalFormat("#,##0.00");
        Rekening[] rekeningen = new Rekening[4];
        try {
            rekeningen[0] = new SpaarRekening("035-0621094-44", 2.5);
            rekeningen[1] = new ZichtRekening("784-5879305-64", 1000);
            rekeningen[2] = new SpaarRekening("001-3456789-01", 5.5);
            rekeningen[3] = new ZichtRekening("BE98 7654 3210 9876", 1000);
            rekeningen[0].storten(100.0);
            rekeningen[1].storten(200.0);
            rekeningen[1].afhalen(50.0);
        } catch (RekeningException re) {
            System.out.println(re.getMessage() + re.getVerkeerdNummer());
        }

        for (int i = 0; i < rekeningen.length; i++) {
            if (rekeningen[i] != null) {
                System.out.println("Saldo van de rekening: " + fmt.format(rekeningen[i].geefSaldo()));
            }
        }
    }

}
