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
public enum DiscusHiVEnum {

    YES("Yes"),
    NO("No"),
    MAYBE("Maybe");

    private final String discusHiVEnum;

    private DiscusHiVEnum(String discusHiVEnum) {
        this.discusHiVEnum = discusHiVEnum;
    }

    public String getName() {
        return discusHiVEnum;
    }

    @Override
    public String toString() {
        return discusHiVEnum;
    }

}
