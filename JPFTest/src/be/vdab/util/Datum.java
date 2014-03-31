/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.vdab.util;

import be.vdab.personeel.Werknemer;
import java.io.Serializable;
import java.util.Comparator;

/**
 *
 * @author zi05
 */
public class Datum implements IDatum, Comparable<Datum>, Serializable {

    private static final long serialVersionUID = 1L;
    private int dag = 1;
    private int maand = 1;
    private int jaar = 1584;

    public Datum() throws DatumException {
    }

    public Datum(int dag, int maand, int jaar) throws DatumException {
        /*if (dag < 1 || dag > 31) {
         throw new DatumException("Verkeerd datum", dag + "/" + maand + "/" + jaar);
         }
         if (maand < 1 || maand > 12) {
         throw new DatumException("Verkeerd datum", dag + "/" + maand + "/" + jaar);
         }*/
        if (!valideerDatum(dag, maand, jaar)) {
            throw new DatumException("Verkeerd datum", dag + "/" + maand + "/" + jaar);
        }
        setDag(dag);
        setMaand(maand);
        setJaar(jaar);
        //valideerDatum();
    }

    private boolean valideerDatum(int dag, int maand, int jaar) {
        if (jaar < 1584 || jaar > 4099) {
            return false;
        }
        switch (maand) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                if (dag < 1 || dag > 31) {
                    return false;
                }
                break;
            case 2:
                if (dag < 1 && (!isLeepYear(jaar) && dag > 28)) {
                    return false;
                }
                break;
            default:
                if (dag < 1 || dag > 30) {
                    return false;
                }
                break;
        }
        return true;
    }

    private boolean isLeepYear(int jaar) {
        if (((jaar % 4 == 0) && !(jaar % 100 == 0))
                || (jaar % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int getDag() {
        return dag;
    }

    @Override
    public void setDag(int dag) throws DatumException {
        if (!valideerDatum(dag, maand, jaar)) {
            throw new DatumException("Verkeerd datum", dag + "/" + maand + "/" + jaar);
        }
        setDag(dag);
        //setMaand(maand);
        //setJaar(jaar);
    }

    @Override
    public int getMaand() {
        return maand;
    }

    @Override
    public void setMaand(int maand) throws DatumException {
        if (!valideerDatum(dag, maand, jaar)) {
            throw new DatumException("Verkeerd datum", dag + "/" + maand + "/" + jaar);
        }
        //setDag(dag);
        setMaand(maand);
        //setJaar(jaar);
    }

    @Override
    public int getJaar() {
        return jaar;
    }

    @Override
    public void setJaar(int jaar) throws DatumException {
        if (!valideerDatum(dag, maand, jaar)) {
            throw new DatumException("Verkeerd datum", dag + "/" + maand + "/" + jaar);
        }
        //setDag(dag);
        //setMaand(maand);
        setJaar(jaar);
    }

    @Override
    public void setDatum(int dag, int maand, int jaar) throws DatumException {
        if (!valideerDatum(dag, maand, jaar)) {
            throw new DatumException("Verkeerd datum", dag + "/" + maand + "/" + jaar);
        }
        setDag(dag);
        setMaand(maand);
        setJaar(jaar);
    }

    @Override
    public String toString() {
        return getDag() + "/" + getMaand() + "/" + getJaar();
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Datum)) {
            return false;
        }
        final Datum d = (Datum) o;
        return (this.getJaar() == d.getJaar() && this.getMaand() == d.getMaand() && this.getDag() == d.getDag());
    }

    @Override
    public int compareTo(Datum d) {
        if (d == null) {
            throw new NullPointerException();
        } else if (this.equals(d)) {
            return 0;
        } else {
            return (this.getJaar() + "/" + this.getMaand() + "/" + this.getDag()).compareTo(d.getJaar() + "/" + d.getMaand() + "/" + d.getDag());
        }
    }
}
