package zw.co.hitrac.support;

import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.util.string.StringValue;

/**
 *
 * @author Tonderai Ndangana
 * 21/04/2016
 */

public class SupportPageParametersUtil {

    public final static String ID = "id";
     public final static String PAGE = "page";
    public final static String SEARCH = "search";

    private SupportPageParametersUtil() {
    }

    public static Long extractId(PageParameters parameters, String IdName) {
        StringValue idStringValue = parameters.get(IdName);
        Long id = null;
        if (idStringValue != null) {

            try {
                id = Long.valueOf(idStringValue.toString());

            } catch (NumberFormatException ex) {
                id = null;
            }
        }
        return id;
    }

    public static Long extractId(PageParameters parameters) {
        return extractId(parameters, ID);
    }
}
