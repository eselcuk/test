/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.essa;

/**
 *
 * @author zi05
 */
public enum EmployeeContractType {

    WORKER(1), SERVANT(2);
    private int contractType; //category base on salary type

    private EmployeeContractType(int contractType) {
        this.contractType = contractType;
    }

    public int getContractType() {
        return contractType;
    }

    public void setContractType(int contractType) {
        this.contractType = contractType;
    }
}
