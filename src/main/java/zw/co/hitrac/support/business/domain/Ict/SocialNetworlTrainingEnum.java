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
public enum SocialNetworlTrainingEnum {

    YES("Yes"),
    NO("No");

    private final String socialNetworlTrainingEnum;

    private SocialNetworlTrainingEnum(String socialNetworlTrainingEnum) {
        this.socialNetworlTrainingEnum = socialNetworlTrainingEnum;
    }

    public String getName() {
        return socialNetworlTrainingEnum;
    }

    @Override
    public String toString() {
        return socialNetworlTrainingEnum;
    }

}
