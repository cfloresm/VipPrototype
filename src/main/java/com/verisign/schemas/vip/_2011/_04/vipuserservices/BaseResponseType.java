
package com.verisign.schemas.vip._2011._04.vipuserservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Acts as the base type for all the responses.
 * 
 * <p>Java class for BaseResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="requestId" type="{http://schemas.verisign.com/vip/2011/04/vipuserservices}RequestIdType"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}hexBinary"/>
 *         &lt;element name="statusMessage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="detail" type="{http://www.w3.org/2001/XMLSchema}hexBinary" minOccurs="0"/>
 *         &lt;element name="detailMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseResponseType", propOrder = {
    "requestId",
    "status",
    "statusMessage",
    "detail",
    "detailMessage"
})
@XmlSeeAlso({
    SetTemporaryPasswordResponseType.class,
    DenyTransactionRiskResponseType.class,
    EvaluateRiskResponseType.class,
    CreateUserResponseType.class,
    AuthenticateUserResponseType.class,
    AddCredentialResponseType.class,
    EvaluateNonMonetaryTransactionRiskResponseType.class,
    UpdateCredentialResponseType.class,
    GetTemporaryPasswordAttributesResponseType.class,
    ConfirmTransactionRiskResponseType.class,
    ClearUserPinResponseType.class,
    SetTemporaryPasswordAttributesResponseType.class,
    GetServerTimeResponseType.class,
    ConfirmRiskResponseType.class,
    GetUserInfoResponseType.class,
    RemoveCredentialResponseType.class,
    UpdateUserResponseType.class,
    DenyRiskResponseType.class,
    EvaluateMonetaryTransactionRiskResponseType.class,
    GetCredentialInfoResponseType.class,
    ClearTemporaryPasswordResponseType.class,
    RegisterResponseType.class,
    DeleteUserResponseType.class,
    SendOtpResponseType.class
})
public abstract class BaseResponseType {

    @XmlElement(required = true)
    protected String requestId;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] status;
    @XmlElement(required = true)
    protected String statusMessage;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] detail;
    protected String detailMessage;

    /**
     * Gets the value of the requestId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestId() {
        return requestId;
    }

    /**
     * Sets the value of the requestId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestId(String value) {
        this.requestId = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(byte[] value) {
        this.status = ((byte[]) value);
    }

    /**
     * Gets the value of the statusMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusMessage() {
        return statusMessage;
    }

    /**
     * Sets the value of the statusMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusMessage(String value) {
        this.statusMessage = value;
    }

    /**
     * Gets the value of the detail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getDetail() {
        return detail;
    }

    /**
     * Sets the value of the detail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetail(byte[] value) {
        this.detail = ((byte[]) value);
    }

    /**
     * Gets the value of the detailMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetailMessage() {
        return detailMessage;
    }

    /**
     * Sets the value of the detailMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetailMessage(String value) {
        this.detailMessage = value;
    }

}
