/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpf.classesobjectsinheritance;

/**
 *
 * @author zi05
 */
public class Punt {

    private int x=0;
    private int y=0;

    public void melding() {
        System.out.println("Punt: ");
    }

    public String schrijf() {
        return ("P(" + getX() + "," + getY() + ")");
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    public void extra() {
        System.out.println("extra in punt");
    }

}
