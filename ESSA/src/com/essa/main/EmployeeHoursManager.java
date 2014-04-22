/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.essa.main;

import com.essa.client.Company;
import com.essa.EmployeeContractType;
import com.essa.operations.TimeTracking;
import com.essa.staff.Employee;
import com.essa.util.ESSADate;
import java.math.BigDecimal;
import java.text.ParseException;

/**
 *
 * @author zi05
 */
public class EmployeeHoursManager {

    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        TimeTracking timeTracking = new TimeTracking(null, null, null, null, null, null, null, 100F);
        
        //timeTracking.setEmployeeID(null);
        //timeTracking.setEmployeeName(null);
        
        Employee employee = new Employee("740414-461-22", "Ekber", "Selcuk", "M", 
                    new ESSADate(14, 4, 1974), "Igdir/TUR", "Hermesdijkstraat 17", 1,
                    BigDecimal.valueOf(3000.50), EmployeeContractType.SERVANT, 
                    new Company(null, null, null, 1,"BE"), 100.50F);
    }
    
}
