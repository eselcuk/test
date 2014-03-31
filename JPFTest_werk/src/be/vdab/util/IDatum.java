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
public interface IDatum {

    public void setDag(int dag);

    public int getDag();

    public void setMaand(int maand);

    public int getMaand();

    public void setJaar(int jaar);

    public int getJaar();

    public void setDatum(int dag, int maand, int jaar);
}
