
package com.verisign.schemas.vip._2011._04.vipuserservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AuthenticateUserRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AuthenticateUserRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.verisign.com/vip/2011/04/vipuserservices}BaseRequestWithAccountIdType">
 *       &lt;sequence>
 *         &lt;element name="userId" type="{http://schemas.verisign.com/vip/2011/04/vipuserservices}UserIdType"/>
 *         &lt;element name="pin" type="{http://schemas.verisign.com/vip/2011/04/vipuserservices}PinType" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element name="otpAuthData" type="{http://schemas.verisign.com/vip/2011/04/vipuserservices}OtpAuthDataType"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuthenticateUserRequestType", propOrder = {
    "userId",
    "pin",
    "otpAuthData"
})
public class AuthenticateUserRequestType
    extends BaseRequestWithAccountIdType
{

    @XmlElement(required = true)
    protected String userId;
    protected String pin;
    protected OtpAuthDataType otpAuthData;

    /**
     * Gets the value of the userId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserId(String value) {
        this.userId = value;
    }

    /**
     * Gets the value of the pin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPin() {
        return pin;
    }

    /**
     * Sets the value of the pin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPin(String value) {
        this.pin = value;
    }

    /**
     * Gets the value of the otpAuthData property.
     * 
     * @return
     *     possible object is
     *     {@link OtpAuthDataType }
     *     
     */
    public OtpAuthDataType getOtpAuthData() {
        return otpAuthData;
    }

    /**
     * Sets the value of the otpAuthData property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtpAuthDataType }
     *     
     */
    public void setOtpAuthData(OtpAuthDataType value) {
        this.otpAuthData = value;
    }

}
