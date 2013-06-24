
package com.verisign.schemas.vip._2011._04.vipuserservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EvaluateNonMonetaryTransactionRiskRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EvaluateNonMonetaryTransactionRiskRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.verisign.com/vip/2011/04/vipuserservices}BaseRequestWithAccountIdType">
 *       &lt;sequence>
 *         &lt;element name="UserId" type="{http://schemas.verisign.com/vip/2011/04/vipuserservices}UserIdType"/>
 *         &lt;element name="Ip" type="{http://schemas.verisign.com/vip/2011/04/vipuserservices}IpAddressType" minOccurs="0"/>
 *         &lt;element name="UserAgent" type="{http://schemas.verisign.com/vip/2011/04/vipuserservices}UserAgentType" minOccurs="0"/>
 *         &lt;element name="IAAuthData" type="{http://schemas.verisign.com/vip/2011/04/vipuserservices}IAAuthDataType" minOccurs="0"/>
 *         &lt;element name="KeyValuePairs" type="{http://schemas.verisign.com/vip/2011/04/vipuserservices}KeyValuePairType" maxOccurs="20" minOccurs="0"/>
 *         &lt;element name="NonMonetaryTransaction" type="{http://schemas.verisign.com/vip/2011/04/vipuserservices}NonMonetaryTransactionType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EvaluateNonMonetaryTransactionRiskRequestType", propOrder = {
    "userId",
    "ip",
    "userAgent",
    "iaAuthData",
    "keyValuePairs",
    "nonMonetaryTransaction"
})
public class EvaluateNonMonetaryTransactionRiskRequestType
    extends BaseRequestWithAccountIdType
{

    @XmlElement(name = "UserId", required = true)
    protected String userId;
    @XmlElement(name = "Ip")
    protected String ip;
    @XmlElement(name = "UserAgent")
    protected String userAgent;
    @XmlElement(name = "IAAuthData")
    protected String iaAuthData;
    @XmlElement(name = "KeyValuePairs")
    protected List<KeyValuePairType> keyValuePairs;
    @XmlElement(name = "NonMonetaryTransaction", required = true)
    protected NonMonetaryTransactionType nonMonetaryTransaction;

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
     * Gets the value of the ip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIp() {
        return ip;
    }

    /**
     * Sets the value of the ip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIp(String value) {
        this.ip = value;
    }

    /**
     * Gets the value of the userAgent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserAgent() {
        return userAgent;
    }

    /**
     * Sets the value of the userAgent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserAgent(String value) {
        this.userAgent = value;
    }

    /**
     * Gets the value of the iaAuthData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIAAuthData() {
        return iaAuthData;
    }

    /**
     * Sets the value of the iaAuthData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIAAuthData(String value) {
        this.iaAuthData = value;
    }

    /**
     * Gets the value of the keyValuePairs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the keyValuePairs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeyValuePairs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KeyValuePairType }
     * 
     * 
     */
    public List<KeyValuePairType> getKeyValuePairs() {
        if (keyValuePairs == null) {
            keyValuePairs = new ArrayList<KeyValuePairType>();
        }
        return this.keyValuePairs;
    }

    /**
     * Gets the value of the nonMonetaryTransaction property.
     * 
     * @return
     *     possible object is
     *     {@link NonMonetaryTransactionType }
     *     
     */
    public NonMonetaryTransactionType getNonMonetaryTransaction() {
        return nonMonetaryTransaction;
    }

    /**
     * Sets the value of the nonMonetaryTransaction property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonMonetaryTransactionType }
     *     
     */
    public void setNonMonetaryTransaction(NonMonetaryTransactionType value) {
        this.nonMonetaryTransaction = value;
    }

}
