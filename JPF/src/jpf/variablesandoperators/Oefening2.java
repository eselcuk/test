/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
    Oefening 2:
    Een student behaalt op een examen volgende scores: 8, 6, 9 en 4.
    Maak een programma dat het gemiddelde berekent (als decimaal getal) en het behaalde percentage (als je weet dat de maximum score op ieder vak 10 is).
    Gebruik geen array’s mocht je daar al kennis van hebben.
    Oefening
*/
package jpf.variablesandoperators;

/**
 *
 * @author zi05
 */
public class Oefening2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int score1 = 8;
        int score2 = 6;
        int score3 = 9;
        int score4 = 4;
        int totaalScore = score1 + score2 + score3 + score4;
        float gemiddelde = totaalScore / 4f;
        float percentage = totaalScore * 100f / 40f;
        System.out.println("Het gemiddelde is " + gemiddelde + " op 10");
        System.out.println("Het behaalde percentage : " + percentage + "%");
    }

}
