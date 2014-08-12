/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpf.streams;

import java.io.*;

public class FileOperations {

    public static void main(String[] args) {
        //een allegaartje van fileoperaties 
        //een nieuwe verwijzing maken naar een map en file 
        File nieuweMap = new File("c:\\windows");
        File eenLeegBestand = new File(nieuweMap, "win.ini");
        //testen of de file bestaat 
        System.out.println(eenLeegBestand.getName() + " exists = " + eenLeegBestand.exists());
        //alfabet.txt uit vorige oefening hernoemen naar alphabet.txt 
        //in de hoger gelegen map 
        File alfabetFile = new File(".", "alfabet.txt");
        File nieuweFile = new File("..", "alphabet.txt");
        System.out.println("hernoeming gelukt: " + alfabetFile.renameTo(nieuweFile));
        //de file alphabet.txt verwijderen 
        System.out.println("tekstfile verwijderd: " + nieuweFile.delete());
        try {
            File testDir = new File("testdir");
            File testFile = new File(testDir, "testfile.txt");
            System.out.println("creatie testfile in testmap gelukt: " + (testDir.mkdir() && testFile.createNewFile()));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
