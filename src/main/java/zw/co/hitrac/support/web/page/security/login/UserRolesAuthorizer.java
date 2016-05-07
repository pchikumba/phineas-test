package zw.co.hitrac.support.web.page.security.login;


import org.apache.wicket.Session;
import org.apache.wicket.authroles.authorization.strategies.role.IRoleCheckingStrategy;
import org.apache.wicket.authroles.authorization.strategies.role.Roles;
import zw.co.hitrac.support.web.conf.SupportSession;


public class UserRolesAuthorizer implements IRoleCheckingStrategy {
    public boolean hasAnyRole(Roles roles) {
        SupportSession authSession = (SupportSession) Session.get();

        return authSession.hasAnyRole(roles);
    }
}
