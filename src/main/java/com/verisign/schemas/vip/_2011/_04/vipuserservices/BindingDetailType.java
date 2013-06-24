
package com.verisign.schemas.vip._2011._04.vipuserservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for BindingDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BindingDetailType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bindStatus" type="{http://schemas.verisign.com/vip/2011/04/vipuserservices}BindStatusEnum"/>
 *         &lt;element name="friendlyName" type="{http://schemas.verisign.com/vip/2011/04/vipuserservices}FriendlyNameType" minOccurs="0"/>
 *         &lt;element name="lastBindTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="lastAuthnTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="lastAuthnId" type="{http://schemas.verisign.com/vip/2011/04/vipuserservices}AuthnIdType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BindingDetailType", propOrder = {
    "bindStatus",
    "friendlyName",
    "lastBindTime",
    "lastAuthnTime",
    "lastAuthnId"
})
public class BindingDetailType {

    @XmlElement(required = true)
    protected BindStatusEnum bindStatus;
    protected String friendlyName;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastBindTime;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastAuthnTime;
    protected String lastAuthnId;

    /**
     * Gets the value of the bindStatus property.
     * 
     * @return
     *     possible object is
     *     {@link BindStatusEnum }
     *     
     */
    public BindStatusEnum getBindStatus() {
        return bindStatus;
    }

    /**
     * Sets the value of the bindStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link BindStatusEnum }
     *     
     */
    public void setBindStatus(BindStatusEnum value) {
        this.bindStatus = value;
    }

    /**
     * Gets the value of the friendlyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFriendlyName() {
        return friendlyName;
    }

    /**
     * Sets the value of the friendlyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFriendlyName(String value) {
        this.friendlyName = value;
    }

    /**
     * Gets the value of the lastBindTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastBindTime() {
        return lastBindTime;
    }

    /**
     * Sets the value of the lastBindTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastBindTime(XMLGregorianCalendar value) {
        this.lastBindTime = value;
    }

    /**
     * Gets the value of the lastAuthnTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastAuthnTime() {
        return lastAuthnTime;
    }

    /**
     * Sets the value of the lastAuthnTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastAuthnTime(XMLGregorianCalendar value) {
        this.lastAuthnTime = value;
    }

    /**
     * Gets the value of the lastAuthnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastAuthnId() {
        return lastAuthnId;
    }

    /**
     * Sets the value of the lastAuthnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastAuthnId(String value) {
        this.lastAuthnId = value;
    }

}
