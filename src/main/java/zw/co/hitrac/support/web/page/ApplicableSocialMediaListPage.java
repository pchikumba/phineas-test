/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.co.hitrac.support.web.page;

import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.link.BookmarkablePageLink;
import org.apache.wicket.markup.html.list.ListItem;
import org.apache.wicket.markup.html.list.PropertyListView;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import zw.co.hitrac.support.SupportPageParametersUtil;
import zw.co.hitrac.support.business.domain.Ict.ApplicableSocialMedia;
import zw.co.hitrac.support.web.model.ApplicableSocialMediaModelListModel;

/**
 *
 * @author hitrac
 */
public class ApplicableSocialMediaListPage extends TemplatePage {

    public ApplicableSocialMediaListPage(PageParameters parameters) {
        super(parameters);
        add(new BookmarkablePageLink("back", HomePage.class));

        add(new PropertyListView<ApplicableSocialMedia>("applicableSocialMedia", new ApplicableSocialMediaModelListModel()) {

            @Override
            protected void populateItem(ListItem<ApplicableSocialMedia> li) {
                li.add(new Label("socialMediaType"));

                PageParameters pageParameters = new PageParameters();
                pageParameters.add(SupportPageParametersUtil.ID, li.getModelObject().getId());
                li.add(new BookmarkablePageLink("edit", ApplicableSocialMediaEditPage.class, pageParameters));

            }
        });
    }

}
