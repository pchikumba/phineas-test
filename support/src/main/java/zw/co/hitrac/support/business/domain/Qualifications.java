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
public enum Qualifications {
    PRIMARY("Primary"),
    SECONDARY("Secondary"),
    TERTIARY("Tertiary");
    
    private Qualifications(String qualificationsName) {
        this.qualificationsName = qualificationsName;
    }

@Override
    public String toString() {
        return qualificationsName;
    }
    private final String qualificationsName;
    
    
    
    
}
