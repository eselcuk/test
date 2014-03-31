/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpf.interfaces;

import jpf.classesobjectsinheritance.Vervuiler;

/**
 *
 * @author zi05
 */
public class Stookketel implements Vervuiler {
    private float CONorm;

    public Stookketel() {
 
    }
    
    public Stookketel(float CONorm) {
        this.CONorm = CONorm;
    }
    
    public float getCONorm() {
        return CONorm;
    }

    public void setCONorm(float CONorm) {
        this.CONorm = CONorm;
    }

    @Override
    public double geefVervuiling() {
        return CONorm * 100D;
    }
    
    @Override
    public String toString() {
        return "stookketel : " + CONorm;
    }
   

}
