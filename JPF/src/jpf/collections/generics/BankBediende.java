package jpf.collections.generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import jpf.classesobjectsinheritance.RekeningException;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zi05
 */
public class BankBediende {

    public static void main(String[] args) {
        // -----GENERICS: eerste collectie van rekeningen ------------- 
        Set<Rekening> setRek = new HashSet<Rekening>();
        double somSaldo = 0.0;
        ZichtRekening z1 = null;
        ZichtRekening z2 = null;
        SpaarRekening s1 = null, s2 = null;
        try {
            z1 = new ZichtRekening("001-1234567-11", 1000);
            z1.storten(100.80);
            z2 = new ZichtRekening("001-1234567-22", 1000);
            z2.storten(200.80);
            s1 = new SpaarRekening("833-1234567-88", 3.5);
            s1.storten(1500.0);
            s2 = new SpaarRekening("833-1234567-99", 3.5);
            s2.storten(3000.0);
            setRek.add(z1);
            setRek.add(z2);
            setRek.add(s1);
            setRek.add(s2);

        } catch (RekeningException re) {
            System.out.println(re.getMessage() + re.getVerkeerdNummer());
        }

        for (Rekening rek : setRek) {
            somSaldo += rek.geefSaldo();
        }
        System.out.println("Totaal saldo: " + somSaldo);
        System.out.println("HashSet van Rekeningen");
        printRekening(setRek);

        List<Rekening> alRek = new ArrayList<Rekening>();
        alRek.add(z1);
        alRek.add(z2);
        alRek.add(s1);
        alRek.add(s2);
        System.out.println("ArrayList van Rekeningen");
        printRekening(alRek);

        Set<ZichtRekening> setZichtrek = new HashSet<ZichtRekening>();
        setZichtrek.add(z1);
        setZichtrek.add(z2);
        System.out.println("Set van ZichtRekeningen");
        //printRekening(setZichtrek); 
        printRekening2(setZichtrek);

        List<String> woorden = new ArrayList<String>();
        woorden.add("eerste woord");
        woorden.add("tweede woord");
        woorden.add("derde woord");
        System.out.println("Collectie van woorden");
        //printRekening(woorden);
        //printRekening2(woorden);
        print(woorden);

        //Alle collections tonen met de procedure print 
        print(setRek);
        print(alRek);
        print(setZichtrek);

    } //einde main 

    public static void print(Collection< ?> coll) {
        for (Object obj : coll) {
            System.out.println(obj);
        }
    }

    public static void printRekening2(Collection<? extends Rekening> bank) {
        for (Rekening r : bank) {
            System.out.println(r);
        }
    }

    public static void printRekening(Collection<Rekening> bank) {
        for (Rekening r : bank) {
            System.out.println(r);
        }
    }
}
