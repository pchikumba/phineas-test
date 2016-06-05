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
public enum IctMoneyEnum {

    YES("Yes"),
    NO("No");

    private final String ictMoneyEnum;

    private IctMoneyEnum(String ictMoneyEnum) {
        this.ictMoneyEnum = ictMoneyEnum;
    }

    public String getName() {
        return ictMoneyEnum;
    }

    @Override
    public String toString() {
        return ictMoneyEnum;
    }

}
