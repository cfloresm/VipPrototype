
package com.verisign.schemas.vip._2011._04.vipuserservices;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChangeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ChangeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="EMAIL"/>
 *     &lt;enumeration value="PASSWORD"/>
 *     &lt;enumeration value="PHONE"/>
 *     &lt;enumeration value="ADDRESS"/>
 *     &lt;enumeration value="USERNAME"/>
 *     &lt;enumeration value="SECURITYQUESTION"/>
 *     &lt;enumeration value="SECURITYANSWER"/>
 *     &lt;enumeration value="OTHER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ChangeType")
@XmlEnum
public enum ChangeType {

    EMAIL,
    PASSWORD,
    PHONE,
    ADDRESS,
    USERNAME,
    SECURITYQUESTION,
    SECURITYANSWER,
    OTHER;

    public String value() {
        return name();
    }

    public static ChangeType fromValue(String v) {
        return valueOf(v);
    }

}
