
package com.verisign.schemas.vip._2011._04.vipuserservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CredentialBindingDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CredentialBindingDetailType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="credentialId" type="{http://schemas.verisign.com/vip/2011/04/vipuserservices}CredentialIdType"/>
 *         &lt;element name="credentialType" type="{http://schemas.verisign.com/vip/2011/04/vipuserservices}CredentialTypeEnum"/>
 *         &lt;element name="credentialStatus" type="{http://schemas.verisign.com/vip/2011/04/vipuserservices}CredentialStatusType" minOccurs="0"/>
 *         &lt;element name="bindingDetail" type="{http://schemas.verisign.com/vip/2011/04/vipuserservices}BindingDetailType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CredentialBindingDetailType", propOrder = {
    "credentialId",
    "credentialType",
    "credentialStatus",
    "bindingDetail"
})
public class CredentialBindingDetailType {

    @XmlElement(required = true)
    protected String credentialId;
    @XmlElement(required = true)
    protected CredentialTypeEnum credentialType;
    protected String credentialStatus;
    @XmlElement(required = true)
    protected BindingDetailType bindingDetail;

    /**
     * Gets the value of the credentialId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCredentialId() {
        return credentialId;
    }

    /**
     * Sets the value of the credentialId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCredentialId(String value) {
        this.credentialId = value;
    }

    /**
     * Gets the value of the credentialType property.
     * 
     * @return
     *     possible object is
     *     {@link CredentialTypeEnum }
     *     
     */
    public CredentialTypeEnum getCredentialType() {
        return credentialType;
    }

    /**
     * Sets the value of the credentialType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CredentialTypeEnum }
     *     
     */
    public void setCredentialType(CredentialTypeEnum value) {
        this.credentialType = value;
    }

    /**
     * Gets the value of the credentialStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCredentialStatus() {
        return credentialStatus;
    }

    /**
     * Sets the value of the credentialStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCredentialStatus(String value) {
        this.credentialStatus = value;
    }

    /**
     * Gets the value of the bindingDetail property.
     * 
     * @return
     *     possible object is
     *     {@link BindingDetailType }
     *     
     */
    public BindingDetailType getBindingDetail() {
        return bindingDetail;
    }

    /**
     * Sets the value of the bindingDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link BindingDetailType }
     *     
     */
    public void setBindingDetail(BindingDetailType value) {
        this.bindingDetail = value;
    }

}
