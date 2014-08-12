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
public class Oefening13Student {

    private String naam;
    private int score;

    public Oefening13Student() {
        //super();
    }

    public Oefening13Student(String naam, int score) {
        this.naam = naam;
        this.score = score;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

}
