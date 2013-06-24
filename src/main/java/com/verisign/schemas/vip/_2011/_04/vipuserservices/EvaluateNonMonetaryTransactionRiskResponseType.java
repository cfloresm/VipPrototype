
package com.verisign.schemas.vip._2011._04.vipuserservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EvaluateNonMonetaryTransactionRiskResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EvaluateNonMonetaryTransactionRiskResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.verisign.com/vip/2011/04/vipuserservices}BaseResponseType">
 *       &lt;sequence>
 *         &lt;element name="Risky" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="RiskScore" type="{http://schemas.verisign.com/vip/2011/04/vipuserservices}RiskScoreType" minOccurs="0"/>
 *         &lt;element name="RiskThreshold" type="{http://schemas.verisign.com/vip/2011/04/vipuserservices}RiskScoreType" minOccurs="0"/>
 *         &lt;element name="RiskReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PolicyVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TransactionId" type="{http://schemas.verisign.com/vip/2011/04/vipuserservices}EventIdType" minOccurs="0"/>
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
@XmlType(name = "EvaluateNonMonetaryTransactionRiskResponseType", propOrder = {
    "risky",
    "riskScore",
    "riskThreshold",
    "riskReason",
    "policyVersion",
    "transactionId",
    "keyValuePairs"
})
public class EvaluateNonMonetaryTransactionRiskResponseType
    extends BaseResponseType
{

    @XmlElement(name = "Risky")
    protected Boolean risky;
    @XmlElement(name = "RiskScore")
    protected Integer riskScore;
    @XmlElement(name = "RiskThreshold")
    protected Integer riskThreshold;
    @XmlElement(name = "RiskReason")
    protected String riskReason;
    @XmlElement(name = "PolicyVersion")
    protected String policyVersion;
    @XmlElement(name = "TransactionId")
    protected String transactionId;
    @XmlElement(name = "KeyValuePairs")
    protected List<KeyValuePairType> keyValuePairs;

    /**
     * Gets the value of the risky property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRisky() {
        return risky;
    }

    /**
     * Sets the value of the risky property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRisky(Boolean value) {
        this.risky = value;
    }

    /**
     * Gets the value of the riskScore property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRiskScore() {
        return riskScore;
    }

    /**
     * Sets the value of the riskScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRiskScore(Integer value) {
        this.riskScore = value;
    }

    /**
     * Gets the value of the riskThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRiskThreshold() {
        return riskThreshold;
    }

    /**
     * Sets the value of the riskThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRiskThreshold(Integer value) {
        this.riskThreshold = value;
    }

    /**
     * Gets the value of the riskReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRiskReason() {
        return riskReason;
    }

    /**
     * Sets the value of the riskReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRiskReason(String value) {
        this.riskReason = value;
    }

    /**
     * Gets the value of the policyVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolicyVersion() {
        return policyVersion;
    }

    /**
     * Sets the value of the policyVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolicyVersion(String value) {
        this.policyVersion = value;
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
