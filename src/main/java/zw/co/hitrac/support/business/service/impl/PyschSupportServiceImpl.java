/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.co.hitrac.support.business.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zw.co.hitrac.support.business.domain.Demo.Demographic;
import zw.co.hitrac.support.business.domain.Pysch.PyschSupport;
import zw.co.hitrac.support.business.repository.PyschSupportRepo;
import zw.co.hitrac.support.business.service.PyschSupportService;

/**
 *
 * @author hitrac
 */
@Service
public class PyschSupportServiceImpl implements PyschSupportService {

    @Autowired
    private PyschSupportRepo psychRepo;

    public PyschSupport save(PyschSupport pyschSupport) {
        return psychRepo.save(pyschSupport);
    }

    public List<PyschSupport> findAll() {
        return psychRepo.findAll();
    }

    public PyschSupport find(Long id) {
        return psychRepo.findOne(id);
    }

    public void delete(PyschSupport pyschSupport) {
        psychRepo.delete(pyschSupport);
    }

    public List<PyschSupport> getPsychSupport(Demographic demographic) {
        return psychRepo.findByDemographic(demographic);
    }

}
