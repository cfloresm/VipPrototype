
package com.verisign.schemas.vip._2011._04.vipuserservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OtpAuthDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OtpAuthDataType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.verisign.com/vip/2011/04/vipuserservices}AbstractAuthDataType">
 *       &lt;sequence>
 *         &lt;element name="otp" type="{http://schemas.verisign.com/vip/2011/04/vipuserservices}OtpType"/>
 *         &lt;element name="otp2" type="{http://schemas.verisign.com/vip/2011/04/vipuserservices}OtpType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OtpAuthDataType", propOrder = {
    "otp",
    "otp2"
})
public class OtpAuthDataType
    extends AbstractAuthDataType
{

    @XmlElement(required = true)
    protected String otp;
    protected String otp2;

    /**
     * Gets the value of the otp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtp() {
        return otp;
    }

    /**
     * Sets the value of the otp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtp(String value) {
        this.otp = value;
    }

    /**
     * Gets the value of the otp2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtp2() {
        return otp2;
    }

    /**
     * Sets the value of the otp2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtp2(String value) {
        this.otp2 = value;
    }

}
