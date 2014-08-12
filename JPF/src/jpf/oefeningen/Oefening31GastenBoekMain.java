/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpf.oefeningen;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Oefening31GastenBoekMain {

    public static void main(String[] args) {
        GastenBoekManager gastenBoekManager = new GastenBoekManager();
        GastenBoek gastenBoek;
        Scanner scanner = new Scanner(System.in);
        System.out.println("1=lezen, 2=toevoegen:");
        switch (scanner.nextInt()) {
            case 1:
                gastenBoek = gastenBoekManager.load();
                List<GastenBoekEntry> entries = gastenBoek.getEntries();
                Collections.reverse(entries);
                for (GastenBoekEntry entry : entries) {
                    System.out.println(entry.getDatum()
                            + ":" + entry.getSchrijver() + ":"
                            + entry.getBoodschap());
                }
                break;
            case 2:
                scanner.nextLine();
                System.out.println("Schrijver:");
                String schrijver = scanner.nextLine();
                System.out.println("Boodschap:");
                String boodschap = scanner.nextLine();
                GastenBoekEntry entry = new GastenBoekEntry(schrijver, boodschap);
                gastenBoek = gastenBoekManager.load();
                gastenBoek.addEntry(entry);
                gastenBoekManager.save(gastenBoek);
                break;
            default:
                System.out.println("Verkeerde keuze");
        }
    }
}
