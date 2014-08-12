/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpf.interfaces;

public class ShallowCopyTest {

    public static void main(String[] args) {
        // Original Object
        PupilVO stud = new PupilVO("Johnathan", "Algebra");
        System.out.println("Original Object: " + stud.getName() + " - "
                + stud.getSubj().getName());
        // Clone Object
        PupilVO clonedStud = (PupilVO) stud.clone();
        System.out.println("Cloned Object: " + clonedStud.getName() + " - "
                + clonedStud.getSubj().getName());
        stud.setName("Daniel");
        stud.getSubj().setName("Physics");
        System.out.println("Original Object after it is updated: "
                + stud.getName() + " - " + stud.getSubj().getName());
        System.out.println("Cloned Object after updating original object: "
                + clonedStud.getName() + " - "
                + clonedStud.getSubj().getName());

    }
}
