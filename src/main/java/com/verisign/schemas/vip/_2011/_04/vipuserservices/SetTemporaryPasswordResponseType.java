
package com.verisign.schemas.vip._2011._04.vipuserservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SetTemporaryPasswordResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SetTemporaryPasswordResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.verisign.com/vip/2011/04/vipuserservices}BaseResponseType">
 *       &lt;sequence>
 *         &lt;element name="temporaryPassword" type="{http://schemas.verisign.com/vip/2011/04/vipuserservices}TemporaryPasswordType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SetTemporaryPasswordResponseType", propOrder = {
    "temporaryPassword"
})
public class SetTemporaryPasswordResponseType
    extends BaseResponseType
{

    protected String temporaryPassword;

    /**
     * Gets the value of the temporaryPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemporaryPassword() {
        return temporaryPassword;
    }

    /**
     * Sets the value of the temporaryPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemporaryPassword(String value) {
        this.temporaryPassword = value;
    }

}
