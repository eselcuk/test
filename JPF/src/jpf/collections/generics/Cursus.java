/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpf.collections.generics;

import java.util.*;

public class Cursus implements Comparable<Cursus> {

    private int cursusNr;
    private String cursusNaam;
    private int prijs;

    public Cursus(int nr, String naam, int prijs) {
        cursusNr = nr;
        cursusNaam = naam;
        this.prijs = prijs;
    }

    // inner class for reverting natural ordering based on price
    public static Comparator<Cursus> getDalendePrijsComparator() {
        return new Comparator<Cursus>() {
            @Override
            public int compare(Cursus c1, Cursus c2) {
                return c2.getPrijs() == c1.getPrijs() ? -1 : c2.getPrijs() - c1.getPrijs();
            }
        };
    }

    public int getCursusNr() {
        return this.cursusNr;
    }

    public void setCursusNr(int nr) {
        this.cursusNr = nr;
    }

    public String getCursusNaam() {
        return this.cursusNaam;
    }

    public void setCursusNaam(String naam) {
        this.cursusNaam = naam;
    }

    public int getPrijs() {
        return this.prijs;
    }

    public void setPrijs(int prijs) {
        this.prijs = prijs;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Cursus)) {
            return false;
        }
        Cursus c = (Cursus) o;
        return cursusNr == c.getCursusNr();
        //return cursusNr == o.getCursusNr();

    }

    @Override
    public String toString() {
        return (cursusNr + "\t" + cursusNaam + "\t" + prijs);
    }

    @Override
    public int hashCode() {
        return cursusNr;
    }

    @Override
    public int compareTo(Cursus c) {
// // sorteren op cursusnr  
// if (cursusNr < c.getCursusNr() ) 
// return -1; 
// else 
// if (cursusNr > c.getCursusNr() ) 
// return 1; 
// else // return 0; 
// // sorteren op cursusNaam 
// return cursusNaam.compareTo(c.getCursusNaam()); 
// // sorteren op cursusPrijs: niet consistent met equals() 
// if (prijs < c.getPrijs()) 
// return -1; 
// else 
// if (prijs > c.getPrijs()) 
// return 1; 
// else 
// return 0; 
// sorteren op cursusPrijs: consistent met equals()   
        if (this.equals(c)) {
            return 0;
        } else {
            // return prijs == c.getPrijs() ? -1 : prijs – c.getPrijs();
            return prijs == c.getPrijs() ? -1 : prijs - c.getPrijs();
        }
    }
}
