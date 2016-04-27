/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.co.hitrac.support.business.domain;

/**
 *
 * @author pchikumba
 *///tndangana changed 26/04/2016
public enum Gender {
    MALE("male"),
    FEMALE("female");
    
    private Gender(String genderName) {
        this.genderName = genderName;
    }
 public String getGenderName() {
        return genderName;
    }
 
    
    
    
@Override
    public String toString() {
        return genderName;
    }
    private final String genderName;
    
    
    
    
}
