/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.essa.main;

import com.essa.client.Company;
import com.essa.EmployeeContractType;
import com.essa.staff.Employee;
import com.essa.util.ESSADate;
import java.math.BigDecimal;
import java.text.ParseException;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author zi05
 */
public class EmployeeRegisterMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        SortedSet employees = new TreeSet();
        employees.add(new Employee("74041446122", "Ekber", "Selcuk", "Male", new ESSADate(14, 04, 1974), "Istanbul", "Hermesdijkstraat 17", 1,
                BigDecimal.valueOf(20.00), EmployeeContractType.WORKER, new Company("CFC","Compact BVBA","Weg naar As 264",1,"BE"), 100F));
    }

}
