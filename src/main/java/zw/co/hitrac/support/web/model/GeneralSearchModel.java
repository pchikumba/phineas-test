package zw.co.hitrac.support.web.model;

import org.apache.wicket.model.LoadableDetachableModel;
import zw.co.hitrac.support.web.conf.GeneralSearch;



public class GeneralSearchModel extends LoadableDetachableModel<GeneralSearch> {

    public GeneralSearchModel() {
    }

    protected GeneralSearch load() {
        return new GeneralSearch();
    }
}
