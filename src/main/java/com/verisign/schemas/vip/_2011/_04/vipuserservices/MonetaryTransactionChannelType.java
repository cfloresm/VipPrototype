
package com.verisign.schemas.vip._2011._04.vipuserservices;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MonetaryTransactionChannelType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MonetaryTransactionChannelType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="WEB"/>
 *     &lt;enumeration value="PHONE"/>
 *     &lt;enumeration value="ATM"/>
 *     &lt;enumeration value="TELLER"/>
 *     &lt;enumeration value="MOBILE"/>
 *     &lt;enumeration value="OTHER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MonetaryTransactionChannelType")
@XmlEnum
public enum MonetaryTransactionChannelType {

    WEB,
    PHONE,
    ATM,
    TELLER,
    MOBILE,
    OTHER;

    public String value() {
        return name();
    }

    public static MonetaryTransactionChannelType fromValue(String v) {
        return valueOf(v);
    }

}
