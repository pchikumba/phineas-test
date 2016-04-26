
package zw.co.hitrac.support.business.domain;

/**
 *
 * @author tonderai ndanngana
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
