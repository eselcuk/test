/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.vdab.util;

/**
 *
 * @author zi05
 */
public class WerknemersDatum extends Datum {

    public WerknemersDatum() throws DatumException {
        super.setDatum(12, 2, 1977);
    }

    public WerknemersDatum(int dag, int maand, int jaar) throws DatumException {
        if (valideerDatumInDienst(dag, maand, jaar)) {
            super.setDag(dag);
            super.setMaand(maand);
            super.setJaar(jaar);
        } else {
            throw new DatumException("invoer een geldig datum", dag + "/" + maand + "/" + jaar);
        }
    }

    private boolean valideerDatumInDienst(int dag, int maand, int jaar) throws DatumException {

        Datum datumInrichting = new WerknemersDatum();
        if ((datumInrichting.getJaar() > jaar)) {
            return false;
        } else if ((datumInrichting.getJaar() < jaar)) {
            return true;
        } else {
            if (datumInrichting.getMaand() > maand) {
                return false;
            } else if (datumInrichting.getMaand() < maand) {
                return true;
            } else {
                if (datumInrichting.getDag() > dag) {
                    return false;
                } else if (datumInrichting.getDag() < dag) {
                    return true;
                } else {
                    return false;
                }
            }
        }
    }
}
