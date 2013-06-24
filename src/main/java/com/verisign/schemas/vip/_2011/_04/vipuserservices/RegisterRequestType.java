
package com.verisign.schemas.vip._2011._04.vipuserservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RegisterRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegisterRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.verisign.com/vip/2011/04/vipuserservices}BaseRequestWithAccountIdType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="smsDeliveryInfo" type="{http://schemas.verisign.com/vip/2011/04/vipuserservices}SmsDeliveryInfoType"/>
 *           &lt;element name="voiceDeliveryInfo" type="{http://schemas.verisign.com/vip/2011/04/vipuserservices}VoiceDeliveryInfoType"/>
 *           &lt;element name="serviceOtpDeliveryInfo" type="{http://schemas.verisign.com/vip/2011/04/vipuserservices}ServiceOtpDeliveryInfoType"/>
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
@XmlType(name = "RegisterRequestType", propOrder = {
    "smsDeliveryInfo",
    "voiceDeliveryInfo",
    "serviceOtpDeliveryInfo"
})
public class RegisterRequestType
    extends BaseRequestWithAccountIdType
{

    protected SmsDeliveryInfoType smsDeliveryInfo;
    protected VoiceDeliveryInfoType voiceDeliveryInfo;
    protected ServiceOtpDeliveryInfoType serviceOtpDeliveryInfo;

    /**
     * Gets the value of the smsDeliveryInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SmsDeliveryInfoType }
     *     
     */
    public SmsDeliveryInfoType getSmsDeliveryInfo() {
        return smsDeliveryInfo;
    }

    /**
     * Sets the value of the smsDeliveryInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SmsDeliveryInfoType }
     *     
     */
    public void setSmsDeliveryInfo(SmsDeliveryInfoType value) {
        this.smsDeliveryInfo = value;
    }

    /**
     * Gets the value of the voiceDeliveryInfo property.
     * 
     * @return
     *     possible object is
     *     {@link VoiceDeliveryInfoType }
     *     
     */
    public VoiceDeliveryInfoType getVoiceDeliveryInfo() {
        return voiceDeliveryInfo;
    }

    /**
     * Sets the value of the voiceDeliveryInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link VoiceDeliveryInfoType }
     *     
     */
    public void setVoiceDeliveryInfo(VoiceDeliveryInfoType value) {
        this.voiceDeliveryInfo = value;
    }

    /**
     * Gets the value of the serviceOtpDeliveryInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceOtpDeliveryInfoType }
     *     
     */
    public ServiceOtpDeliveryInfoType getServiceOtpDeliveryInfo() {
        return serviceOtpDeliveryInfo;
    }

    /**
     * Sets the value of the serviceOtpDeliveryInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceOtpDeliveryInfoType }
     *     
     */
    public void setServiceOtpDeliveryInfo(ServiceOtpDeliveryInfoType value) {
        this.serviceOtpDeliveryInfo = value;
    }

}
