
package com.verisign.schemas.vip._2011._04.vipuserservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Acts as the base type for all the requests that are sent on behalf of another account ID. In such cases,
 * 			the sender will either be a super admin or a parent of the onBehalfOfAccountId.
 * 
 * <p>Java class for BaseRequestWithAccountIdType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseRequestWithAccountIdType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.verisign.com/vip/2011/04/vipuserservices}BaseRequestType">
 *       &lt;sequence>
 *         &lt;element name="onBehalfOfAccountId" type="{http://schemas.verisign.com/vip/2011/04/vipuserservices}AccountIdType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseRequestWithAccountIdType", propOrder = {
    "onBehalfOfAccountId"
})
@XmlSeeAlso({
    SetTemporaryPasswordAttributesRequestType.class,
    RegisterRequestType.class,
    GetUserInfoRequestType.class,
    EvaluateRiskRequestType.class,
    SetTemporaryPasswordRequestType.class,
    CreateUserRequestType.class,
    AuthenticateUserRequestType.class,
    DeleteUserRequestType.class,
    AddCredentialRequestType.class,
    EvaluateMonetaryTransactionRiskRequestType.class,
    ConfirmTransactionRiskRequestType.class,
    RemoveCredentialRequestType.class,
    DenyRiskRequestType.class,
    UpdateCredentialRequestType.class,
    ConfirmRiskRequestType.class,
    GetCredentialInfoRequestType.class,
    GetTemporaryPasswordAttributesRequestType.class,
    DenyTransactionRiskRequestType.class,
    ClearTemporaryPasswordRequestType.class,
    EvaluateNonMonetaryTransactionRiskRequestType.class,
    SendOtpRequestType.class,
    UpdateUserRequestType.class,
    ClearUserPinRequestType.class
})
public abstract class BaseRequestWithAccountIdType
    extends BaseRequestType
{

    protected String onBehalfOfAccountId;

    /**
     * Gets the value of the onBehalfOfAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnBehalfOfAccountId() {
        return onBehalfOfAccountId;
    }

    /**
     * Sets the value of the onBehalfOfAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnBehalfOfAccountId(String value) {
        this.onBehalfOfAccountId = value;
    }

}
