/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.co.hitrac.support.business.service;

import zw.co.hitrac.support.BusinessComponent;
import zw.co.hitrac.support.business.domain.User;

/**
 *
 * @author tonderai ndangana
 * created on 3/5/2016
 */
public interface UserService extends BusinessComponent<User>{
       public User get(String username,String password); 
    
}
