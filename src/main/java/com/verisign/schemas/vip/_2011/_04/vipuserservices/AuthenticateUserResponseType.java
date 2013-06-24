
package com.verisign.schemas.vip._2011._04.vipuserservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AuthenticateUserResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AuthenticateUserResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.verisign.com/vip/2011/04/vipuserservices}BaseResponseType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="credentialId" type="{http://schemas.verisign.com/vip/2011/04/vipuserservices}CredentialIdType" minOccurs="0"/>
 *         &lt;element name="credentialType" type="{http://schemas.verisign.com/vip/2011/04/vipuserservices}CredentialTypeEnum" minOccurs="0"/>
 *         &lt;element name="authnId" type="{http://schemas.verisign.com/vip/2011/04/vipuserservices}AuthnIdType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuthenticateUserResponseType", propOrder = {
    "credentialId",
    "credentialType",
    "authnId"
})
public class AuthenticateUserResponseType
    extends BaseResponseType
{

    protected String credentialId;
    protected CredentialTypeEnum credentialType;
    protected String authnId;

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
     * Gets the value of the authnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthnId() {
        return authnId;
    }

    /**
     * Sets the value of the authnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthnId(String value) {
        this.authnId = value;
    }

}
