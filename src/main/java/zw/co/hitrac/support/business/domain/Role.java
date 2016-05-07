package zw.co.hitrac.support.business.domain;


/**
 *
 * @author tonderai ndangana
 *  created 26/04/2016
 */
public enum Role {
     
    RESEARCHANALYST("Research Analysts"),
    ADMINISTRATOR_PI("Adminstrator"),
    PATIENT("patient");
    
    private final String roleName;
    
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
    
}
