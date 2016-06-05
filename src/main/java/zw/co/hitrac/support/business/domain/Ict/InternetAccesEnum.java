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
public enum InternetAccesEnum {

    YES("Yes"),
    NO("No");

    private final String internetAccesEnum;

    private InternetAccesEnum(String internetAccesEnum) {
        this.internetAccesEnum = internetAccesEnum;
    }

    public String getName() {
        return internetAccesEnum;
    }

    @Override
    public String toString() {
        return internetAccesEnum;
    }

}
