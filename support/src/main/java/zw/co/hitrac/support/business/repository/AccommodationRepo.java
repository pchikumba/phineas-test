/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.co.hitrac.support.business.repository;

import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;
import zw.co.hitrac.support.business.domain.Accommodation;

/**
 *
 * @author pchikumba
 */
public interface AccommodationRepo extends JpaRepository<Accommodation, Serializable>{
    
}
