
package com.verisign.schemas.vip._2011._04.vipuserservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Account complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Account">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AccountName" type="{http://schemas.verisign.com/vip/2011/04/vipuserservices}IDType"/>
 *         &lt;element name="BankID" type="{http://schemas.verisign.com/vip/2011/04/vipuserservices}IDType"/>
 *         &lt;element name="AccountType" type="{http://schemas.verisign.com/vip/2011/04/vipuserservices}AccountType"/>
 *         &lt;element name="AccountDescription" type="{http://schemas.verisign.com/vip/2011/04/vipuserservices}StringDescType" minOccurs="0"/>
 *         &lt;element name="AccountCreationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Account", propOrder = {
    "accountName",
    "bankID",
    "accountType",
    "accountDescription",
    "accountCreationDate"
})
public class Account {

    @XmlElement(name = "AccountName", required = true)
    protected String accountName;
    @XmlElement(name = "BankID", required = true)
    protected String bankID;
    @XmlElement(name = "AccountType", required = true)
    protected AccountType accountType;
    @XmlElement(name = "AccountDescription")
    protected String accountDescription;
    @XmlElement(name = "AccountCreationDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar accountCreationDate;

    /**
     * Gets the value of the accountName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountName() {
        return accountName;
    }

    /**
     * Sets the value of the accountName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountName(String value) {
        this.accountName = value;
    }

    /**
     * Gets the value of the bankID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankID() {
        return bankID;
    }

    /**
     * Sets the value of the bankID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankID(String value) {
        this.bankID = value;
    }

    /**
     * Gets the value of the accountType property.
     * 
     * @return
     *     possible object is
     *     {@link AccountType }
     *     
     */
    public AccountType getAccountType() {
        return accountType;
    }

    /**
     * Sets the value of the accountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountType }
     *     
     */
    public void setAccountType(AccountType value) {
        this.accountType = value;
    }

    /**
     * Gets the value of the accountDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountDescription() {
        return accountDescription;
    }

    /**
     * Sets the value of the accountDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountDescription(String value) {
        this.accountDescription = value;
    }

    /**
     * Gets the value of the accountCreationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAccountCreationDate() {
        return accountCreationDate;
    }

    /**
     * Sets the value of the accountCreationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAccountCreationDate(XMLGregorianCalendar value) {
        this.accountCreationDate = value;
    }

}
