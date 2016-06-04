/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.co.hitrac.support.business.service;

import java.util.List;
import zw.co.hitrac.support.BusinessComponent;
import zw.co.hitrac.support.business.domain.Demo.Demographic;
import zw.co.hitrac.support.business.domain.Pysch.PyschSupport;

/**
 *
 * @author tonderai ndangana 30/04/2016
 */
public interface PyschSupportService extends BusinessComponent< PyschSupport> {

    public List<PyschSupport> getPsychSupport(Demographic demographic);

}
