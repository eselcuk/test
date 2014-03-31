/*
    Oefening 13:
    a) Maak een class Student waar je de naam (String) en score (int) van een Student kan bewaren. 
       Zorg voor de nodige getters en setters (getNaam(), getScore(),…). Maak in een main-class Examen twee 
       studenten aan en geef hen een naam en een score. Breng de gegevens op het scherm.
    b) Maak constructors aan in de class Student die de naam of de naam en de score van de Student ontvangen. 
       Wordt er geen score meegegeven dan wordt die ingesteld op nul.
    c) Test de gemaakte classes in de main().
 */
package jpf.classesobjectsinheritance;

import jpf.classesobjectsinheritance.Oefening13Student;

/**
 *
 * @author zi05
 */
public class Oefening13Examen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Oefening13Student Ekber = new Oefening13Student();
        Oefening13Student Selcuk = new Oefening13Student();

        Ekber.setNaam("Ekber");
        Ekber.setScore(10);

        Selcuk.setNaam("Selcuk");
        Selcuk.setScore(9);

        Oefening13Student Ruby = new Oefening13Student("Ruby", 0);

        System.out.println("Student scores: ");
        System.out.println(Ekber.getNaam() + ": " + Ekber.getScore());
        System.out.println(Selcuk.getNaam() + ": " + Selcuk.getScore());
        System.out.println(Ruby.getNaam() + ": " + Ruby.getScore());
    }

}
