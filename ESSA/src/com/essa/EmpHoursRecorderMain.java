/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.essa;

import java.math.BigDecimal;
import java.text.ParseException;
import java.util.GregorianCalendar;

/**
 *
 * @author zi05
 */
public class EmpHoursRecorderMain {

    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        Employee employee = new Employee("740414-461-22", "Ekber", "Selcuk", "M", 
                    "14/04/1974", "Igdir/TUR", "Hermesdijkstraat 17", 1,
                    BigDecimal.valueOf(3000.50), EmployeeContractType.SERVANT, 
                    new Company(null, null, null, 1), 100.50F);
    }
    
}
