/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package be.vdab;


/**
 *
 * @author zi05
 */
public class ConversieProg {
      
    public static void main(String[] args) {

        Converter converter= new Converter();
        for (int cm = 1; cm <= 10; cm++) {
            System.out.println(cm + " cm = " 
                   + converter.centimetersToInches(cm) + " inches");
        }
        
    }
    
}
