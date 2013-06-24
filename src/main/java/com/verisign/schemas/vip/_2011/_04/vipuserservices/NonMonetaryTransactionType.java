
package com.verisign.schemas.vip._2011._04.vipuserservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NonMonetaryTransactionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NonMonetaryTransactionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SourceAccount" type="{http://schemas.verisign.com/vip/2011/04/vipuserservices}Account" minOccurs="0"/>
 *         &lt;element name="EventId" type="{http://schemas.verisign.com/vip/2011/04/vipuserservices}EventIdType" minOccurs="0"/>
 *         &lt;element name="ChangeType" type="{http://schemas.verisign.com/vip/2011/04/vipuserservices}ChangeType"/>
 *         &lt;element name="ChannelType" type="{http://schemas.verisign.com/vip/2011/04/vipuserservices}NonMonetaryTransactionChannelType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NonMonetaryTransactionType", propOrder = {
    "sourceAccount",
    "eventId",
    "changeType",
    "channelType"
})
public class NonMonetaryTransactionType {

    @XmlElement(name = "SourceAccount")
    protected Account sourceAccount;
    @XmlElement(name = "EventId")
    protected String eventId;
    @XmlElement(name = "ChangeType", required = true)
    protected ChangeType changeType;
    @XmlElement(name = "ChannelType", required = true)
    protected NonMonetaryTransactionChannelType channelType;

    /**
     * Gets the value of the sourceAccount property.
     * 
     * @return
     *     possible object is
     *     {@link Account }
     *     
     */
    public Account getSourceAccount() {
        return sourceAccount;
    }

    /**
     * Sets the value of the sourceAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Account }
     *     
     */
    public void setSourceAccount(Account value) {
        this.sourceAccount = value;
    }

    /**
     * Gets the value of the eventId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventId() {
        return eventId;
    }

    /**
     * Sets the value of the eventId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventId(String value) {
        this.eventId = value;
    }

    /**
     * Gets the value of the changeType property.
     * 
     * @return
     *     possible object is
     *     {@link ChangeType }
     *     
     */
    public ChangeType getChangeType() {
        return changeType;
    }

    /**
     * Sets the value of the changeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangeType }
     *     
     */
    public void setChangeType(ChangeType value) {
        this.changeType = value;
    }

    /**
     * Gets the value of the channelType property.
     * 
     * @return
     *     possible object is
     *     {@link NonMonetaryTransactionChannelType }
     *     
     */
    public NonMonetaryTransactionChannelType getChannelType() {
        return channelType;
    }

    /**
     * Sets the value of the channelType property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonMonetaryTransactionChannelType }
     *     
     */
    public void setChannelType(NonMonetaryTransactionChannelType value) {
        this.channelType = value;
    }

}
