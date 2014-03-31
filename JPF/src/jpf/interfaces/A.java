/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpf.interfaces;

public class A implements Cloneable{

    private int i = 111;

    @Override
    public Object clone() {
        try {
            A a = (A) super.clone();
            return a;
        } catch (CloneNotSupportedException e) {
            throw new InternalError();
        }
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
}
