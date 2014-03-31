/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.vdab.personeel;

import be.vdab.util.Datum;
import be.vdab.util.WerknemerException;
import be.vdab.util.WerknemersDatum;
import java.io.Serializable;

/**
 *
 * @author zi05
 */
public abstract class Werknemer implements Comparable<Werknemer>,  Serializable {

    private static final long serialVersionUID = 1L; 
    private int personeelnummer = -1;
    private WerknemersDatum datumInDienst;
    //private WerknemersDatum datumInDienst = new WerknemersDatum();
    private String naam = "nog niet ingevuld";
    
    public abstract double getVerloning();
    
    public Werknemer(int personeelnummer, String naam, WerknemersDatum datumInDienst) throws WerknemerException {
        setPersoneelnummer(personeelnummer);
        setNaam(naam);
        setDatumInDienst(datumInDienst);
    }

    public int getPersoneelnummer() {
        return personeelnummer;
    }

    public void setPersoneelnummer(int personeelnummer) {
        if (!(personeelnummer < 0)) {
            this.personeelnummer = personeelnummer;
        }

    }

    public WerknemersDatum getDatumInDienst() {
        return datumInDienst;
    }

    public void setDatumInDienst(WerknemersDatum datumInDienst) {
        this.datumInDienst = datumInDienst;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

     @Override
    public boolean equals(Object o) {
        if (!(o instanceof Werknemer)) {
            return false;
        }
        final Werknemer w = (Werknemer) o;
        return this.getPersoneelnummer()==(w.getPersoneelnummer());
    }
    
    @Override
    public int compareTo(Werknemer w) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if (w == null) {
            throw new NullPointerException();
        } else if (this.equals(w)) {
            return 0;
        } else {
            return this.datumInDienst.compareTo(w.datumInDienst);
            //return this.nummerplaat.getPlaat().compareTo(voertuig.nummerplaat.getPlaat());
        }
    }

    @Override
    public String toString() {
        return getDatumInDienst() + "\t" + getPersoneelnummer() + "\t" + getNaam();
    }
}