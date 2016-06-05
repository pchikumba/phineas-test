/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.co.hitrac.support.business.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zw.co.hitrac.support.business.domain.Ict.SocialNetworkBenefits;
import zw.co.hitrac.support.business.repository.SocialNetworkBenefitsRepo;
import zw.co.hitrac.support.business.service.SocialNetworkBenefitsService;

/**
 *
 * @author hitrac
 */
@Service
public class SocialNetworkBenefitsServiceImpl implements SocialNetworkBenefitsService {

    @Autowired
    private SocialNetworkBenefitsRepo socialNetworkBenefitsRepo;

    public SocialNetworkBenefits save(SocialNetworkBenefits socialNetworkBenefits) {
        return socialNetworkBenefitsRepo.save(socialNetworkBenefits);
    }

    public List<SocialNetworkBenefits> findAll() {
        return socialNetworkBenefitsRepo.findAll();

    }

    public SocialNetworkBenefits find(Long id) {
        return socialNetworkBenefitsRepo.findOne(id);

    }

    public void delete(SocialNetworkBenefits socialNetworkBenefits) {
        socialNetworkBenefitsRepo.delete(socialNetworkBenefits);
    }

}
