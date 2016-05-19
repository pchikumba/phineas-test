/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.co.hitrac.support.web.model;

import org.apache.wicket.injection.Injector;
import org.apache.wicket.model.LoadableDetachableModel;
import org.apache.wicket.spring.injection.annot.SpringBean;

import zw.co.hitrac.support.business.domain.Nutrition.Recommender;
import zw.co.hitrac.support.business.service.RecommenderService;

/**
 *
 * @author pchikumba
 */
public class RecommenderModel extends LoadableDetachableModel<Recommender>{
 
  private Long id;  
    
  @SpringBean
    private RecommenderService recommenderService;
    public RecommenderModel(Long id){
        this.id=id;
        Injector.get().inject(this);
    }
    
    
    @Override
    protected Recommender load() {
        
      if (id==null){
         return new Recommender();
      } else{
          return recommenderService.find(id);
      } 
    }

 
}
