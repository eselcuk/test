/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpf.interfaces;

public class B extends A {

    private int j = 222;

    @Override
    public Object clone() {
        Object o = super.clone();
        B b = (B) o;
        return b;
    }

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }
}
