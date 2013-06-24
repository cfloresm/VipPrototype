
package com.verisign.schemas.vip._2011._04.vipuserservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SetTemporaryPasswordAttributesRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SetTemporaryPasswordAttributesRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.verisign.com/vip/2011/04/vipuserservices}BaseRequestWithAccountIdType">
 *       &lt;sequence>
 *         &lt;element name="userId" type="{http://schemas.verisign.com/vip/2011/04/vipuserservices}UserIdType"/>
 *         &lt;element name="temporaryPasswordAttributes" type="{http://schemas.verisign.com/vip/2011/04/vipuserservices}TemporaryPasswordAttributesType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SetTemporaryPasswordAttributesRequestType", propOrder = {
    "userId",
    "temporaryPasswordAttributes"
})
public class SetTemporaryPasswordAttributesRequestType
    extends BaseRequestWithAccountIdType
{

    @XmlElement(required = true)
    protected String userId;
    @XmlElement(required = true)
    protected TemporaryPasswordAttributesType temporaryPasswordAttributes;

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
     * Gets the value of the temporaryPasswordAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link TemporaryPasswordAttributesType }
     *     
     */
    public TemporaryPasswordAttributesType getTemporaryPasswordAttributes() {
        return temporaryPasswordAttributes;
    }

    /**
     * Sets the value of the temporaryPasswordAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link TemporaryPasswordAttributesType }
     *     
     */
    public void setTemporaryPasswordAttributes(TemporaryPasswordAttributesType value) {
        this.temporaryPasswordAttributes = value;
    }

}
