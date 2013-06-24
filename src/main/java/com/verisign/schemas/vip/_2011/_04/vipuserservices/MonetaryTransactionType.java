
package com.verisign.schemas.vip._2011._04.vipuserservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MonetaryTransactionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MonetaryTransactionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SourceAccount" type="{http://schemas.verisign.com/vip/2011/04/vipuserservices}Account"/>
 *         &lt;element name="DestinationAccount" type="{http://schemas.verisign.com/vip/2011/04/vipuserservices}Account"/>
 *         &lt;element name="EventId" type="{http://schemas.verisign.com/vip/2011/04/vipuserservices}EventIdType" minOccurs="0"/>
 *         &lt;element name="TransactionAmount" type="{http://schemas.verisign.com/vip/2011/04/vipuserservices}AmountType"/>
 *         &lt;element name="AccountBalance" type="{http://schemas.verisign.com/vip/2011/04/vipuserservices}BalanceType" minOccurs="0"/>
 *         &lt;element name="TransactionType" type="{http://schemas.verisign.com/vip/2011/04/vipuserservices}TransactionType"/>
 *         &lt;element name="ChannelType" type="{http://schemas.verisign.com/vip/2011/04/vipuserservices}MonetaryTransactionChannelType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MonetaryTransactionType", propOrder = {
    "sourceAccount",
    "destinationAccount",
    "eventId",
    "transactionAmount",
    "accountBalance",
    "transactionType",
    "channelType"
})
public class MonetaryTransactionType {

    @XmlElement(name = "SourceAccount", required = true)
    protected Account sourceAccount;
    @XmlElement(name = "DestinationAccount", required = true)
    protected Account destinationAccount;
    @XmlElement(name = "EventId")
    protected String eventId;
    @XmlElement(name = "TransactionAmount")
    protected double transactionAmount;
    @XmlElement(name = "AccountBalance")
    protected Double accountBalance;
    @XmlElement(name = "TransactionType", required = true)
    protected TransactionType transactionType;
    @XmlElement(name = "ChannelType", required = true)
    protected MonetaryTransactionChannelType channelType;

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
     * Gets the value of the destinationAccount property.
     * 
     * @return
     *     possible object is
     *     {@link Account }
     *     
     */
    public Account getDestinationAccount() {
        return destinationAccount;
    }

    /**
     * Sets the value of the destinationAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Account }
     *     
     */
    public void setDestinationAccount(Account value) {
        this.destinationAccount = value;
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
     * Gets the value of the transactionAmount property.
     * 
     */
    public double getTransactionAmount() {
        return transactionAmount;
    }

    /**
     * Sets the value of the transactionAmount property.
     * 
     */
    public void setTransactionAmount(double value) {
        this.transactionAmount = value;
    }

    /**
     * Gets the value of the accountBalance property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAccountBalance() {
        return accountBalance;
    }

    /**
     * Sets the value of the accountBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAccountBalance(Double value) {
        this.accountBalance = value;
    }

    /**
     * Gets the value of the transactionType property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionType }
     *     
     */
    public TransactionType getTransactionType() {
        return transactionType;
    }

    /**
     * Sets the value of the transactionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionType }
     *     
     */
    public void setTransactionType(TransactionType value) {
        this.transactionType = value;
    }

    /**
     * Gets the value of the channelType property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryTransactionChannelType }
     *     
     */
    public MonetaryTransactionChannelType getChannelType() {
        return channelType;
    }

    /**
     * Sets the value of the channelType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryTransactionChannelType }
     *     
     */
    public void setChannelType(MonetaryTransactionChannelType value) {
        this.channelType = value;
    }

}
