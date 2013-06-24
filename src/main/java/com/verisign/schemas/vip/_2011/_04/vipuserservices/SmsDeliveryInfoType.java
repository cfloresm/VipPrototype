
package com.verisign.schemas.vip._2011._04.vipuserservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             		Contains the branding information.
 *         		
 * 
 * <p>Java class for SmsDeliveryInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SmsDeliveryInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="phoneNumber" type="{http://schemas.verisign.com/vip/2011/04/vipuserservices}PhoneNumberType"/>
 *         &lt;element name="smsFrom" type="{http://schemas.verisign.com/vip/2011/04/vipuserservices}SmsFromType" minOccurs="0"/>
 *         &lt;element name="messageTemplate" type="{http://schemas.verisign.com/vip/2011/04/vipuserservices}SmsMessageTemplateType" minOccurs="0"/>
 *         &lt;element name="gatewayAcctInfo" type="{http://schemas.verisign.com/vip/2011/04/vipuserservices}GatewayAcctInfoType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SmsDeliveryInfoType", propOrder = {
    "phoneNumber",
    "smsFrom",
    "messageTemplate",
    "gatewayAcctInfo"
})
public class SmsDeliveryInfoType {

    @XmlElement(required = true)
    protected String phoneNumber;
    protected String smsFrom;
    protected String messageTemplate;
    protected GatewayAcctInfoType gatewayAcctInfo;

    /**
     * Gets the value of the phoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the value of the phoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNumber(String value) {
        this.phoneNumber = value;
    }

    /**
     * Gets the value of the smsFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSmsFrom() {
        return smsFrom;
    }

    /**
     * Sets the value of the smsFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSmsFrom(String value) {
        this.smsFrom = value;
    }

    /**
     * Gets the value of the messageTemplate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageTemplate() {
        return messageTemplate;
    }

    /**
     * Sets the value of the messageTemplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageTemplate(String value) {
        this.messageTemplate = value;
    }

    /**
     * Gets the value of the gatewayAcctInfo property.
     * 
     * @return
     *     possible object is
     *     {@link GatewayAcctInfoType }
     *     
     */
    public GatewayAcctInfoType getGatewayAcctInfo() {
        return gatewayAcctInfo;
    }

    /**
     * Sets the value of the gatewayAcctInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link GatewayAcctInfoType }
     *     
     */
    public void setGatewayAcctInfo(GatewayAcctInfoType value) {
        this.gatewayAcctInfo = value;
    }

}
