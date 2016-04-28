
package zw.co.hitrac.support.business.domain.Demo;

/**
 *
 * @author tonderai ndangana
 *  created 26/04/2016
 */
public enum Role {
     
    RESEARCHANALYST("Research Analysts"),
    ADMINISTRATOR_PI("Adminstrator"),
    PATIENT("patient");
    
    
    private Role(String roleName) {
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
