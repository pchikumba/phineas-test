package zw.co.hitrac.support.business.domain.Nutrition;

/**
 *
 * @author tonderai ndangana
 * 01/04/2016
 */
public enum AdminRole { ADMINSTRATOR("Admnistrator");



private AdminRole(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleName() {
        return roleName;
    }

    @Override
    public String toString() {
        return roleName;
    }
    private final String roleName;
    
}
