/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.co.hitrac.support.business.domain.Nutrition;

/**
 *
 * @author hitrac
 */
public enum TraditionalFoodEnum {
    
    YES("Yes"),
    NO("No");
    
    private final String traditionalName;
    
    private TraditionalFoodEnum(String traditionalName ){
       this.traditionalName = traditionalName;
     }
    
     public String getTraditionalFoodEnum() {
        return traditionalName;
    }
    
    @Override
    public String toString() {
    return traditionalName;
    
    
    }
}
    
    
    
    

