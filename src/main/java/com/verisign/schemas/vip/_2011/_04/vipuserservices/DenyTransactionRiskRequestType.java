
package com.verisign.schemas.vip._2011._04.vipuserservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DenyTransactionRiskRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DenyTransactionRiskRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.verisign.com/vip/2011/04/vipuserservices}BaseRequestWithAccountIdType">
 *       &lt;sequence>
 *         &lt;element name="UserId" type="{http://schemas.verisign.com/vip/2011/04/vipuserservices}UserIdType"/>
 *         &lt;element name="TransactionId" type="{http://schemas.verisign.com/vip/2011/04/vipuserservices}TransactionIdType"/>
 *         &lt;element name="IsMonetaryTransaction" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="VerifyMethod" type="{http://schemas.verisign.com/vip/2011/04/vipuserservices}VerifyMethodType" minOccurs="0"/>
 *         &lt;element name="KeyValuePairs" type="{http://schemas.verisign.com/vip/2011/04/vipuserservices}KeyValuePairType" maxOccurs="20" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DenyTransactionRiskRequestType", propOrder = {
    "userId",
    "transactionId",
    "isMonetaryTransaction",
    "verifyMethod",
    "keyValuePairs"
})
public class DenyTransactionRiskRequestType
    extends BaseRequestWithAccountIdType
{

    @XmlElement(name = "UserId", required = true)
    protected String userId;
    @XmlElement(name = "TransactionId", required = true)
    protected String transactionId;
    @XmlElement(name = "IsMonetaryTransaction")
    protected boolean isMonetaryTransaction;
    @XmlElement(name = "VerifyMethod")
    protected String verifyMethod;
    @XmlElement(name = "KeyValuePairs")
    protected List<KeyValuePairType> keyValuePairs;

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
     * Gets the value of the transactionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * Sets the value of the transactionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionId(String value) {
        this.transactionId = value;
    }

    /**
     * Gets the value of the isMonetaryTransaction property.
     * 
     */
    public boolean isIsMonetaryTransaction() {
        return isMonetaryTransaction;
    }

    /**
     * Sets the value of the isMonetaryTransaction property.
     * 
     */
    public void setIsMonetaryTransaction(boolean value) {
        this.isMonetaryTransaction = value;
    }

    /**
     * Gets the value of the verifyMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVerifyMethod() {
        return verifyMethod;
    }

    /**
     * Sets the value of the verifyMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVerifyMethod(String value) {
        this.verifyMethod = value;
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

}
