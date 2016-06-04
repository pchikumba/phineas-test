/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.co.hitrac.support.business.service;

import java.util.List;
import zw.co.hitrac.support.BusinessComponent;
import zw.co.hitrac.support.business.domain.Agric.AgricActivity;
import zw.co.hitrac.support.business.domain.Demo.Demographic;

/**
 *
 * @author gerald matsika
 */
public interface AgricActivityService extends BusinessComponent<AgricActivity> {

    public List<AgricActivity> getAgricActivity(Demographic demographic);
}
