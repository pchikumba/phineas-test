/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.co.hitrac.support.web.conf;

import java.io.Serializable;

/**
 *
 * @author 
 */
public class GeneralSearch implements Serializable{
    
    private String searchInput;

    public String getSearchInput() {
        return searchInput;
    }

    public void setSearchInput(String searchInput) {
        this.searchInput = searchInput;
    }
    
    
}
