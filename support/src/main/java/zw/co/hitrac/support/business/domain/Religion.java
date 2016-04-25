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
public enum Religion {
    CHRISTIAN("Christian"),
    MUSLIM("Muslim"),
    OTHERS("Others");
  
    
     private Religion(String religionName) {
        this.religionName = religionName;
    }

@Override
    public String toString() {
        return religionName;
    }
    private final String religionName;
    
}
