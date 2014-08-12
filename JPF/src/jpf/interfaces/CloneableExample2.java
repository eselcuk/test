/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpf.interfaces;

public class CloneableExample2 {

    public static void main(String[] args) {
        A a1 = new A();
        A a2;
        B b1 = new B();
        B b2;

        a2 = (A) a1.clone();
        a2.setI(222);

        // Why the different output?
        System.out.println("a1 = " + a1 + " a1.i " + a1.getI()); // i = 111
        System.out.println("a2 = " + a2 + " a2.i " + a2.getI()); // i = 222

        b2 = (B) b1.clone();

        b2.setI(888);
        b2.setJ(999);

        System.out.println("b1 = " + b1 + " b1.i " + b1.getI() + " b1.j " + b1.getJ());
        System.out.println("b2 = " + b2 + " b2.i " + b2.getI() + " b2.j " + b2.getJ());
    }
}