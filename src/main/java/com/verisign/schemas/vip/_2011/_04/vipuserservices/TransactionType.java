
package com.verisign.schemas.vip._2011._04.vipuserservices;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TransactionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="WIRETRANSFER"/>
 *     &lt;enumeration value="BILLPAYMENT"/>
 *     &lt;enumeration value="ELECTRONICREALTIMEBANKTRANSFER"/>
 *     &lt;enumeration value="JOURNALING"/>
 *     &lt;enumeration value="CHECKREQUEST"/>
 *     &lt;enumeration value="OTHER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TransactionType")
@XmlEnum
public enum TransactionType {

    WIRETRANSFER,
    BILLPAYMENT,
    ELECTRONICREALTIMEBANKTRANSFER,
    JOURNALING,
    CHECKREQUEST,
    OTHER;

    public String value() {
        return name();
    }

    public static TransactionType fromValue(String v) {
        return valueOf(v);
    }

}
