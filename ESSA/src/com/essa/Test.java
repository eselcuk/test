/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.essa;

import java.math.BigDecimal;
import java.text.ParseException;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author zi05
 */
public class Test {

    private static FileAndObjectOIStreamClass fileAndObjectOIStreamClass;

    public static void main(String[] args) throws ParseException {
        //fileAndObjectOIStreamClass.fileObjectInput();
        SortedSet employees = new TreeSet();
        employees.add(new Employee("74041446122", "Ekber", "Selcuk", "Male", "14/04/1974", "Istanbul", "Hermesdijkstraat 17", 1,
                BigDecimal.valueOf(20.00), EmployeeContractType.SERVANT, new Company("CFC", "CFC BVBA", "Weg naar As 264", 1), 100F));
        employees.add(new Employee("74041446123", "Selcuk", "Ekber", "Male", "14/04/1974", "Istanbul", "Hermesdijkstraat 17", 1,
                BigDecimal.valueOf(20.00), EmployeeContractType.WORKER, new Company("CFC", "Compact BVBA", "Weg naar As 264", 1), 100F));
        employees.add(new Employee("74041446125", "Selcuk", "Ekber", "Male", "14/04/1974", "Istanbul", "Hermesdijkstraat 17", 1,
                BigDecimal.valueOf(20.00), EmployeeContractType.WORKER, new Company("CFC", "Compact BVBA", "Weg naar As 264", 1), 100F));
        employees.add(new Employee("74041446124", "Dirx", "Belig", "Male", "14/04/1974", "Istanbul", "Hermesdijkstraat 17", 1,
                BigDecimal.valueOf(20.00), EmployeeContractType.WORKER, new Company("CFC", "Compact BVBA", "Weg naar As 264", 1), 100F));
        employees.add(new Employee("74041446125", "Dirx", "Belig", "Male", "14/04/1974", "Istanbul", "Hermesdijkstraat 17", 1,
                BigDecimal.valueOf(20.00), EmployeeContractType.WORKER, new Company("CFC", "Compact BVBA", "Weg naar As 264", 1), 100F));

        fileAndObjectOIStreamClass.fileObjectOutput(employees);
        //fileObjectOutput(employees);
        //fileObjectInput();
       //fileAndObjectOIStreamClass.fileObjectInput();

    }

}
