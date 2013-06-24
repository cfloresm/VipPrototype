
package com.verisign.schemas.vip._2011._04.vipuserservices;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CredentialTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CredentialTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="STANDARD_OTP"/>
 *     &lt;enumeration value="SMS_OTP"/>
 *     &lt;enumeration value="VOICE_OTP"/>
 *     &lt;enumeration value="SERVICE_OTP"/>
 *     &lt;enumeration value="CERTIFICATE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CredentialTypeEnum")
@XmlEnum
public enum CredentialTypeEnum {

    STANDARD_OTP,
    SMS_OTP,
    VOICE_OTP,
    SERVICE_OTP,
    CERTIFICATE;

    public String value() {
        return name();
    }

    public static CredentialTypeEnum fromValue(String v) {
        return valueOf(v);
    }

}
