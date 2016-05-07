
package zw.co.hitrac.support.business.domain.Demo;

/**
 *
 * @author tonderai ndangana
 * created on 07/05/2016
 */
public enum Gender {
    
       MALE("Male"),
    FEMALE("female");

    private Gender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return gender;
    }

    @Override
    public String toString() {
        return gender;
    }
    private final String gender;
}
  
    
    

