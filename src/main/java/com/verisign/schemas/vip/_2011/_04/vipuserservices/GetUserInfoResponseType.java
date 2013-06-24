
package com.verisign.schemas.vip._2011._04.vipuserservices;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for GetUserInfoResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetUserInfoResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.verisign.com/vip/2011/04/vipuserservices}BaseResponseType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="userId" type="{http://schemas.verisign.com/vip/2011/04/vipuserservices}UserIdType" minOccurs="0"/>
 *         &lt;element name="userCreationTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="userStatus" type="{http://schemas.verisign.com/vip/2011/04/vipuserservices}UserStatusEnum" minOccurs="0"/>
 *         &lt;element name="numBindings" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="credentialBindingDetail" type="{http://schemas.verisign.com/vip/2011/04/vipuserservices}CredentialBindingDetailType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="isPinSet" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetUserInfoResponseType", propOrder = {
    "userId",
    "userCreationTime",
    "userStatus",
    "numBindings",
    "credentialBindingDetail",
    "isPinSet"
})
public class GetUserInfoResponseType
    extends BaseResponseType
{

    protected String userId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar userCreationTime;
    protected UserStatusEnum userStatus;
    protected BigInteger numBindings;
    protected List<CredentialBindingDetailType> credentialBindingDetail;
    protected Boolean isPinSet;

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
     * Gets the value of the userCreationTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUserCreationTime() {
        return userCreationTime;
    }

    /**
     * Sets the value of the userCreationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUserCreationTime(XMLGregorianCalendar value) {
        this.userCreationTime = value;
    }

    /**
     * Gets the value of the userStatus property.
     * 
     * @return
     *     possible object is
     *     {@link UserStatusEnum }
     *     
     */
    public UserStatusEnum getUserStatus() {
        return userStatus;
    }

    /**
     * Sets the value of the userStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserStatusEnum }
     *     
     */
    public void setUserStatus(UserStatusEnum value) {
        this.userStatus = value;
    }

    /**
     * Gets the value of the numBindings property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumBindings() {
        return numBindings;
    }

    /**
     * Sets the value of the numBindings property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumBindings(BigInteger value) {
        this.numBindings = value;
    }

    /**
     * Gets the value of the credentialBindingDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the credentialBindingDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCredentialBindingDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CredentialBindingDetailType }
     * 
     * 
     */
    public List<CredentialBindingDetailType> getCredentialBindingDetail() {
        if (credentialBindingDetail == null) {
            credentialBindingDetail = new ArrayList<CredentialBindingDetailType>();
        }
        return this.credentialBindingDetail;
    }

    /**
     * Gets the value of the isPinSet property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPinSet() {
        return isPinSet;
    }

    /**
     * Sets the value of the isPinSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPinSet(Boolean value) {
        this.isPinSet = value;
    }

}
