/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.co.hitrac.support.business.domain;

/**
 *
 * @author pchikumba
 */
public enum MaritalStatus {
    SINGLE("Single"),
    MARRIED("Married"),
    DIVORCED("Divorced"),
    WIDOWED("Widowed"),
    SEPARATED("Separated");
    
     private MaritalStatus(String maritalstatusName) {
        this.maritalstatusName = maritalstatusName;
    }

@Override
    public String toString() {
        return maritalstatusName;
    }
    private final String maritalstatusName;
    
    
}
