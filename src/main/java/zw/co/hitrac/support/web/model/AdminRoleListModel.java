package zw.co.hitrac.support.web.model;

import java.util.Arrays;
import java.util.List;
import org.apache.wicket.model.LoadableDetachableModel;
import zw.co.hitrac.support.business.domain.Nutrition.AdminRole;


/**
 *
 * @author tonderai ndangana
 * 01/04/2016
 */
public class AdminRoleListModel extends LoadableDetachableModel<List<AdminRole>> {

    @Override
    protected List<AdminRole> load() {
        return Arrays.asList(AdminRole.values());
    }

}
