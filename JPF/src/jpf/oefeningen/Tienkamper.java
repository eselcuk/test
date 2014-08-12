/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpf.oefeningen;

import java.util.Comparator;
import jpf.collections.Cursus;
import sun.net.www.protocol.http.HttpURLConnection;

public class Tienkamper implements Comparable<Tienkamper> {

    private String naam;
    private int punten;

    //inner class for ordering
    public static Comparator<Tienkamper> getAscendingOrder() {
        return new Comparator<Tienkamper>() {
            @Override
            public int compare(Tienkamper t1, Tienkamper t2) {
                return t1.getPunten() == t2.getPunten() ? 1 : t1.getPunten() - t2.getPunten();
            }
        };
    }

    public Tienkamper(String naam, int punten) {
        setNaam(naam);
        setPunten(punten);
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public int getPunten() {
        return punten;
    }

    public void setPunten(int punten) {
        this.punten = punten;
    }

    @Override
    public String toString() {
        return naam + "\t:" + punten;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Tienkamper)) {
            return false;
        }
        Tienkamper other = (Tienkamper) o;
        return this.getNaam().equals(other.getNaam());
    }

    @Override
    public int hashCode() {
        return this.getNaam().hashCode();
    }

    @Override
    public int compareTo(Tienkamper object) {
        return this.getNaam().compareTo(object.getNaam());
    }
}
