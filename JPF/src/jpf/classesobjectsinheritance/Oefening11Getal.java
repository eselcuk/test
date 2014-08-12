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
public class Oefening11Getal {

    private int x = 0;

    public Oefening11Getal(int a) {
        setX(a);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int absoluut() {
        return Math.abs(x);
    }

    public int som(int a) {
        return x + a;
    }

    public float som(float a) {
        return x + a;
    }

    public double som(double a) {
        return x + a;
    }

    public double toDouble() {
        return (double) x;
    }

    public void add(int a) {
        x += a;
    }

    public void print() {
      System.out.println("Waarde x: " + x);
    }

}
