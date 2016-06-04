/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.co.hitrac.support.business.domain.Ict;

/**
 *
 * @author hitrac
 */
public enum SocialMediaEnum {

    YES("Yes"),
    NO("No");

    private final String socialMediaEnum;

    private SocialMediaEnum(String socialMediaEnum) {
        this.socialMediaEnum = socialMediaEnum;
    }

    public String getName() {
        return socialMediaEnum;
    }

    @Override
    public String toString() {
        return socialMediaEnum;
    }

}
