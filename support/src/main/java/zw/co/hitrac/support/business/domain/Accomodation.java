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
public enum Accomodation {
    RENTED("Rented"),
    OWNED("Owned"),
    PE("Provided by Employer"),
 PR("Provided by Relative");
//changed 25/04/2016
 private Accomodation(String accomodationName) {
        this.accomodationName = accomodationName;
    }

@Override
    public String toString() {
        return accomodationName;
    }
    private final String accomodationName;
    
}
