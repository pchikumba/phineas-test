
package zw.co.hitrac.support.business.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zw.co.hitrac.support.business.domain.User;
import zw.co.hitrac.support.business.repository.UserRepo;
import zw.co.hitrac.support.business.service.UserService;

/**
 *
 * @author tonderai ndangana
 * created on 03/04/2016
 */
@Service
public class UserServiceImpl implements UserService{
    
    @Autowired
    private UserRepo userRepo;
 

    public User save(User user) {
       return userRepo.save(user);
    }

    public List<User> findAll() {
      
       return userRepo.findAll();
    }

    public User find(Long id) {
       User user = userRepo.findOne(id);
       return user;
    }

    public void delete(User user) {
        userRepo.delete(user);
        
    }

    public User get(String username, String password) {
        return userRepo.getOne(this);
    }
    
}
