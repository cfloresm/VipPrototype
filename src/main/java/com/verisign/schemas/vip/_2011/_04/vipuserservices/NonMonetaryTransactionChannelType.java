
package com.verisign.schemas.vip._2011._04.vipuserservices;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NonMonetaryTransactionChannelType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NonMonetaryTransactionChannelType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="WEB"/>
 *     &lt;enumeration value="PHONE"/>
 *     &lt;enumeration value="MOBILE"/>
 *     &lt;enumeration value="OTHER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NonMonetaryTransactionChannelType")
@XmlEnum
public enum NonMonetaryTransactionChannelType {

    WEB,
    PHONE,
    MOBILE,
    OTHER;

    public String value() {
        return name();
    }

    public static NonMonetaryTransactionChannelType fromValue(String v) {
        return valueOf(v);
    }

}
