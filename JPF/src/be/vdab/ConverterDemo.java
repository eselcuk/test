/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.vdab;

import java.util.Scanner;

/**
 *
 * @author zi05
 */
public class ConverterDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("centimeters:");
        Scanner scanner = new Scanner(System.in);
        double centimeters = scanner.nextDouble();
        Converter converter = new Converter();
        System.out.println(converter.centimetersToInches(centimeters) + " inches");
    }

}
