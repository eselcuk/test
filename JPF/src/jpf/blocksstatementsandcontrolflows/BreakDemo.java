/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpf.blocksstatementsandcontrolflows;

/**
 *
 * @author zi05
 */
public class BreakDemo {

    public static void main(String[] args) {

        //declaratie en initialisatie van getallenreeks 
        byte[] getallen = {7, 12, 28, 2, 9};
        //declaratie hulpvariabelen 
        int i = 0;
        int faculteit;
        long tussenresultaat;
        //lus die de array doorloopt while (i< getallen.length) { 
        //initialisatie hulpvariabelen 
        tussenresultaat = getallen[i];
        int j = 1;
        //berekening faculteit 
        while (j < getallen[i]) {
            tussenresultaat *= j;
            if (tussenresultaat > Integer.MAX_VALUE) {
                break;
            }
            j++;
        } //uitvoer resultaat 
        if (j == getallen[i]) {
            faculteit = (int) tussenresultaat;
            System.out.println("De faculteit van " + getallen[i] + " is " + faculteit);
        } else {
            System.out.println("De faculteit van " + getallen[i] + " is te groot voor een int");
        //teller verhogen 
            i++;
        }
    }
}

