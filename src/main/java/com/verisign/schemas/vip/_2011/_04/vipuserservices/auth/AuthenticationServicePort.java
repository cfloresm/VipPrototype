package com.verisign.schemas.vip._2011._04.vipuserservices.auth;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.2.3
 * Thu Jun 13 20:10:23 CDT 2013
 * Generated source version: 2.2.3
 * 
 */
 
@WebService(targetNamespace = "http://schemas.verisign.com/vip/2011/04/vipuserservices/auth", name = "AuthenticationServicePort")
@XmlSeeAlso({com.verisign.schemas.vip._2011._04.vipuserservices.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface AuthenticationServicePort {

    @WebResult(name = "DenyRiskResponse", targetNamespace = "http://schemas.verisign.com/vip/2011/04/vipuserservices", partName = "DenyRiskResponse")
    @WebMethod
    public com.verisign.schemas.vip._2011._04.vipuserservices.DenyRiskResponseType denyRisk(
        @WebParam(partName = "DenyRiskRequest", name = "DenyRiskRequest", targetNamespace = "http://schemas.verisign.com/vip/2011/04/vipuserservices")
        com.verisign.schemas.vip._2011._04.vipuserservices.DenyRiskRequestType denyRiskRequest
    );

    @WebResult(name = "EvaluateNonMonetaryTransactionRiskResponse", targetNamespace = "http://schemas.verisign.com/vip/2011/04/vipuserservices", partName = "EvaluateNonMonetaryTransactionRiskResponse")
    @WebMethod
    public com.verisign.schemas.vip._2011._04.vipuserservices.EvaluateNonMonetaryTransactionRiskResponseType evaluateNonMonetaryTransactionRisk(
        @WebParam(partName = "EvaluateNonMonetaryTransactionRiskRequest", name = "EvaluateNonMonetaryTransactionRiskRequest", targetNamespace = "http://schemas.verisign.com/vip/2011/04/vipuserservices")
        com.verisign.schemas.vip._2011._04.vipuserservices.EvaluateNonMonetaryTransactionRiskRequestType evaluateNonMonetaryTransactionRiskRequest
    );

    @WebResult(name = "EvaluateMonetaryTransactionRiskResponse", targetNamespace = "http://schemas.verisign.com/vip/2011/04/vipuserservices", partName = "EvaluateMonetaryTransactionRiskResponse")
    @WebMethod
    public com.verisign.schemas.vip._2011._04.vipuserservices.EvaluateMonetaryTransactionRiskResponseType evaluateMonetaryTransactionRisk(
        @WebParam(partName = "EvaluateMonetaryTransactionRiskRequest", name = "EvaluateMonetaryTransactionRiskRequest", targetNamespace = "http://schemas.verisign.com/vip/2011/04/vipuserservices")
        com.verisign.schemas.vip._2011._04.vipuserservices.EvaluateMonetaryTransactionRiskRequestType evaluateMonetaryTransactionRiskRequest
    );

    @WebResult(name = "ConfirmTransactionRiskResponse", targetNamespace = "http://schemas.verisign.com/vip/2011/04/vipuserservices", partName = "ConfirmTransactionRiskResponse")
    @WebMethod
    public com.verisign.schemas.vip._2011._04.vipuserservices.ConfirmTransactionRiskResponseType confirmTransactionRisk(
        @WebParam(partName = "ConfirmTransactionRiskRequest", name = "ConfirmTransactionRiskRequest", targetNamespace = "http://schemas.verisign.com/vip/2011/04/vipuserservices")
        com.verisign.schemas.vip._2011._04.vipuserservices.ConfirmTransactionRiskRequestType confirmTransactionRiskRequest
    );

    @WebResult(name = "ConfirmRiskResponse", targetNamespace = "http://schemas.verisign.com/vip/2011/04/vipuserservices", partName = "ConfirmRiskResponse")
    @WebMethod
    public com.verisign.schemas.vip._2011._04.vipuserservices.ConfirmRiskResponseType confirmRisk(
        @WebParam(partName = "ConfirmRiskRequest", name = "ConfirmRiskRequest", targetNamespace = "http://schemas.verisign.com/vip/2011/04/vipuserservices")
        com.verisign.schemas.vip._2011._04.vipuserservices.ConfirmRiskRequestType confirmRiskRequest
    );

    @WebResult(name = "AuthenticateUserResponse", targetNamespace = "http://schemas.verisign.com/vip/2011/04/vipuserservices", partName = "AuthenticateUserResponse")
    @WebMethod
    public com.verisign.schemas.vip._2011._04.vipuserservices.AuthenticateUserResponseType authenticateUser(
        @WebParam(partName = "AuthenticateUserRequest", name = "AuthenticateUserRequest", targetNamespace = "http://schemas.verisign.com/vip/2011/04/vipuserservices")
        com.verisign.schemas.vip._2011._04.vipuserservices.AuthenticateUserRequestType authenticateUserRequest
    );

    @WebResult(name = "EvaluateRiskResponse", targetNamespace = "http://schemas.verisign.com/vip/2011/04/vipuserservices", partName = "EvaluateRiskResponse")
    @WebMethod
    public com.verisign.schemas.vip._2011._04.vipuserservices.EvaluateRiskResponseType evaluateRisk(
        @WebParam(partName = "EvaluateRiskRequest", name = "EvaluateRiskRequest", targetNamespace = "http://schemas.verisign.com/vip/2011/04/vipuserservices")
        com.verisign.schemas.vip._2011._04.vipuserservices.EvaluateRiskRequestType evaluateRiskRequest
    );

    @WebResult(name = "DenyTransactionRiskResponse", targetNamespace = "http://schemas.verisign.com/vip/2011/04/vipuserservices", partName = "DenyTransactionRiskResponse")
    @WebMethod
    public com.verisign.schemas.vip._2011._04.vipuserservices.DenyTransactionRiskResponseType denyTransactionRisk(
        @WebParam(partName = "DenyTransactionRiskRequest", name = "DenyTransactionRiskRequest", targetNamespace = "http://schemas.verisign.com/vip/2011/04/vipuserservices")
        com.verisign.schemas.vip._2011._04.vipuserservices.DenyTransactionRiskRequestType denyTransactionRiskRequest
    );
}
