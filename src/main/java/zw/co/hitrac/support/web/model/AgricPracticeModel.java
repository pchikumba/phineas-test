/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.co.hitrac.support.web.model;

import org.apache.wicket.injection.Injector;
import org.apache.wicket.model.LoadableDetachableModel;
import org.apache.wicket.spring.injection.annot.SpringBean;
import zw.co.hitrac.support.business.domain.Agric.AgricPractice;
import zw.co.hitrac.support.business.service.AgricPracticeService;

/**
 *
 * @author gerald matsika
 */
public class AgricPracticeModel extends LoadableDetachableModel<AgricPractice> {

    private Long id;

    @SpringBean
    private AgricPracticeService agricpracticeService;

    public AgricPracticeModel(Long id) {
        this.id = id;
        Injector.get().inject(id);
    }

    @Override
    protected AgricPractice load() {

        if (id == null) {
            return new AgricPractice();
        } else {
            return agricpracticeService.find(id);
        }
    }

}
